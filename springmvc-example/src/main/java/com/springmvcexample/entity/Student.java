package com.springmvcexample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Student {

    @Id
    Integer id;
    String fullName;
    String address;
    int age = 18;

}
