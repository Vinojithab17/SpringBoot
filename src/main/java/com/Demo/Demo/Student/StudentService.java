package com.Demo.Demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student AddStudent(Student student) {
//        return student;
        System.out.println(student);
        return student;
    }

    public List<Student> GetStudents() {
        return studentRepository.findAll();
//        return List.of(
//                new Student("Vinojith",
//                        "Vinojith@gmail.com",
//                        LocalDate.of(2000, Month.JANUARY,18),
//                        23
//                )
//
//
//        );
    }
}
