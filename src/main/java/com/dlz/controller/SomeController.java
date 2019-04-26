package com.dlz.controller;

import com.dlz.configration.Group;
import com.dlz.configration.Student;
import com.dlz.service.ISomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p> Package: com.dlz.controller </p>
 * <p> Description: (用一句话描述该文件做什么) </p>
 *
 * @author lizhi_duan
 * @version 1.0
 * @date 2019/4/26 15:23
 */
@RestController
public class SomeController {
    @Value("${student.name}")
    private String name;
    @Autowired
    private ISomeService someSvice;
    @Autowired
    private Student student;

    @Autowired
    private Group group;

    @RequestMapping("some")
    @ResponseBody
    public String someHandle() {
//        int i = 3/0;
        return someSvice.send();
    }

    @RequestMapping("name")
    @ResponseBody
    public String studentName() {
        for (Student student1 : group.getStudents()) {
            System.out.println(student1.getName() + " " + student1.getAge() + " " + student1.getScore());
        }
        return name;
    }
    @RequestMapping("student")
    @ResponseBody
    public Student student() {
        return student;
    }
}
