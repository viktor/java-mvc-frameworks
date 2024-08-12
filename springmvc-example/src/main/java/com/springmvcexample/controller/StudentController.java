package com.springmvcexample.controller;

import com.springmvcexample.entity.Student;
import com.springmvcexample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService service;

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String studentList(Model model){
        List<Student> studentList = service.findAll();
        model.addAttribute("studentList", studentList);
        return "list";
    }

}
