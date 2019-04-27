package com.dlz.controller;

import com.dlz.entity.Student;
import com.dlz.service.ISomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p> Package: com.dlz.controller </p>
 * <p> Description: (用一句话描述该文件做什么) </p>
 *
 * @author lizhi_duan
 * @version 1.0
 * @date 2019/4/26 19:56
 */
@Controller
@RequestMapping("/test")
public class RegisterController {
    @Autowired
    private ISomeService service;
    @RequestMapping("/register")
    public String registerbute(String name,int age,Model model) {
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        service.addStudent(student);
        return "/jsp/welcome";
    }
}
