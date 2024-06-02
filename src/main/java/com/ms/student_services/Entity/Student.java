package com.ms.student_services.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "students")
public class Student {

    @Id
    private String id;
    private String name;
    private int age;
    private String gender;
    private Integer schoolId;

}
