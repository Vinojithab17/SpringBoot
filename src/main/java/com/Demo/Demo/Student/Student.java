package com.Demo.Demo.Student;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName= "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long ID;
    private String Name;
    private String Email;
    private LocalDate DoB;
    @Transient
    private Integer Age;

    public Student() {
    }

    public Student(String name,
                   String email,
                   LocalDate doB
                   )
    {
        Name = name;
        Email = email;
        DoB = doB;

    }

    public Student(Long ID,
                   String name,
                   String email,
                   LocalDate doB
                  ) {
        this.ID = ID;
        Name = name;
        Email = email;
        DoB = doB;

    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public LocalDate getDoB() {
        return DoB;
    }

    public void setDoB(LocalDate doB) {
        DoB = doB;
    }

    public Integer getAge() {
        return Period.between(DoB,LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", DoB=" + DoB +
                ", Age=" + Age +
                '}';
    }
}

