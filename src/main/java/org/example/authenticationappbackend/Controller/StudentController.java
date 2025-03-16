package org.example.authenticationappbackend.Controller;

import org.example.authenticationappbackend.Entity.Student;
import org.example.authenticationappbackend.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return studentService.saveDetails(student);
    }

    @PostMapping("/getStudent")
    public Student checkLogedin(@RequestBody Map<String, Object> body){
        return studentService.isLogedIn(body);
    }

    @GetMapping("/getStudents")
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();
    }


}
