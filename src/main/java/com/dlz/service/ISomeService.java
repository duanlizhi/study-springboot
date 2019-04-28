package com.dlz.service;

import com.dlz.entity.Student;

/**
 * <p> Package: com.dlz.service </p>
 * <p> Description: (用一句话描述该文件做什么) </p>
 *
 * @author lizhi_duan
 * @version 1.0
 * @date 2019/4/26 16:26
 */
public interface ISomeService {
    String send();

    /**
     * 添加学生
     * @param student
     */
    void addStudent(Student student);

    /**
     * 查找学生
     * @param id
     * @return
     */
    Student findStudentById(Integer id);

    /**
     * 查找学生总人数
     * @return
     */
    Integer findStudentsCount();
}
