package com.dlz.controller;

import com.dlz.entity.Student;
import com.dlz.entity.StudentLombok;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p> Package: com.dlz.controller </p>
 * <p> Description: (用一句话描述该文件做什么) </p>
 *
 * @author lizhi_duan
 * @version 1.0
 * @date 2019/4/28 15:50
 */
@Controller
public class ThymeleafController {
    @RequestMapping("/test1/myindex")
    public String indexHandle(Model model) {
        model.addAttribute("welcome","Hello Thymeleaf World");
        StudentLombok student = new StudentLombok("张三",23);
        model.addAttribute("student",student);
        return "index";
    }
}
