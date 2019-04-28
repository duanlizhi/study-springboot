package com.dlz.service.impl;

import com.dlz.entity.Student;
import com.dlz.service.ISomeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * <p> Package: com.dlz.service.impl </p>
 * <p> Description: (用一句话描述该文件做什么) </p>
 *
 * @author lizhi_duan
 * @version 1.0
 * @date 2019/4/26 16:28
 */
@Service
@Profile("prod")
public class ProdServiceImpl implements ISomeService {
    /**
     * 查找学生
     *
     * @param id
     * @return
     */
    @Override
    public Student findStudentById(Integer id) {
        return null;
    }

    /**
     * 查找学生总人数
     *
     * @return
     */
    @Override
    public Integer findStudentsCount() {
        return null;
    }

    @Override
    public String send() {
        return "prod";
    }

    @Override
    public void addStudent(Student student) {

    }
}
