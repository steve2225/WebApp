package com.example.demo.Service;

import com.example.demo.Entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudents();
    Student findById(int id);
    void addStudent(Student student);
    void deleteById(int id);
}
