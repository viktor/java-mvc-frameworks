package com.springmvcexample.service;

import com.springmvcexample.entity.Student;
import com.springmvcexample.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository repo;

    public void testData(){
        List<Student> list = Arrays.asList(
                new Student(1, "Alejandro Quintanilla","123 Seedling Ln, Dallas 75280",20),
                new Student(2, "Rebe Bentz","123 Calle, Cdad Delgado 00000",20),
                new Student(3, "Ruben Echegn","123 Street Ln, San Salvador 00000",19),
                new Student(4, "Mateo M","123 Street, Escalon 000000",18)
        );

        repo.saveAll(list);
    }

    public List<Student> findAll(){
        return  repo.findAll();
    }

}
