package com.Demo.Demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> GetStudents() {
        return studentService.GetStudents();
    }
    @PostMapping
    public Student CreateNewStudent(@RequestBody Student student){
        return studentService.AddStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long id){
        studentService.DeleteStudent(id);
    }
}
