package com.dlz.service.impl;

import com.dlz.dao.ISomeDao;
import com.dlz.entity.Student;
import com.dlz.service.ISomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * <p> Package: com.dlz.service.impl </p>
 * <p> Description: (用一句话描述该文件做什么) </p>
 *
 * @author lizhi_duan
 * @version 1.0
 * @date 2019/4/26 16:27
 */
@Service
@Profile("dev")
public class DevSomServiceImpl implements ISomeService {

    @Resource
    private ISomeDao someDao;
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;
    /**
     * 查找学生
     *
     * @param id
     * @return
     */
    @Cacheable(value = "${spring.cache.cache-names}", key = "'student_'+#id")
    @Override
    public Student findStudentById(Integer id) {
        return someDao.findStudentById(id);
    }

    /**
     * 查找学生总人数
     *
     * @return
     */
    @Override
    public Integer findStudentsCount() {
        //使用双重检测锁解决热点缓存问题
        //获取Redis操作对象
        BoundValueOperations<Object, Object> ops = redisTemplate.boundValueOps("count");
        //从缓存中读取数据
        Object count = ops.get();
        if(count == null) {
            synchronized (this) {
                count = ops.get();
                if(count == null) {
                    //从DB中查询数据
                    count = someDao.findCount();
                    //将数据写入到缓存，并设置到期时间
                    ops.set(count,10, TimeUnit.SECONDS);
                }
            }
        }
        return (Integer) count;
    }

    @Override
    public String send() {
        return "dev";
    }

    @CacheEvict(value = "${spring.cache.cache-names}",allEntries = true)
    @Transactional
    @Override
    public void addStudent(Student student) {
        someDao.saveStudent(student);
    }
}
