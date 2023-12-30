package com.Demo.Demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student AddStudent(Student student) {
//      Optional<Student> studentByEmail =  studentRepository.findStudentByEmail(student.getEmail());
//
//        if(studentByEmail.isPresent()){
//            throw  new IllegalStateException("email taken");
//
//        }
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

    public void DeleteStudent(Long id) {

        boolean exists = studentRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException("Student does not exits");
        }
        studentRepository.deleteById(id);
    }
}
