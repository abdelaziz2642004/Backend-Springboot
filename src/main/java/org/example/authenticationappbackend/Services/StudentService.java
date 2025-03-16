package org.example.authenticationappbackend.Services;

import org.example.authenticationappbackend.Entity.Student;
import org.example.authenticationappbackend.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public Student saveDetails(Student student){
        return studentRepo.save(student);
    }

    public Student isLogedIn(Map<String, Object> body){
        int id = (int)body.get("id");
        String password = (String)body.get("password");
        Student student = studentRepo.findById(id).orElse(null);
        if(student != null && student.getPassword().equals(password)){
            return student;
        }
        return null;
    }

    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }
}
