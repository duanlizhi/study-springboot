package com.dlz.service.impl;

import com.dlz.dao.ISomeDao;
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
 * @date 2019/4/26 16:27
 */
@Service
@Profile("dev")
public class DevSomServiceImpl implements ISomeService {
    private ISomeDao someDao;
    @Override
    public String send() {
        return "dev";
    }

    @Override
    public void addStudent(Student student) {
        someDao.saveStudent(student);
    }
}
