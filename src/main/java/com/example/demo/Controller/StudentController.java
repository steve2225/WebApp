package com.example.demo.Controller;

import com.example.demo.Entity.Student;
import com.example.demo.Service.BookService;
import com.example.demo.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {


    final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/list")
    public String  getStudents(Model theModel){
        List<Student>theStudents=studentService.getAllStudents();
        theModel.addAttribute("students", theStudents);
        return "list-students";
    }

    @GetMapping("formAdd")
    public String formAdd(Model theModel){
        Student theStudent=new Student();
        theModel.addAttribute("students", theStudent);
        return "student-form";
    }

    @GetMapping("formUpdate")
    public String formUpdate(@RequestParam("studentId") int id, Model theModel){
        Student theStudent=studentService.findById(id);
        theModel.addAttribute("students", theStudent);
        return "student-form";
    }
    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("students") Student theStudent){
        studentService.addStudent(theStudent);
        return "redirect:/students/list";
    }

    @GetMapping("/delete")
    public String deleteStudent(@RequestParam("studentId") int id){
        studentService.deleteById(id);
        return "redirect:/students/list";
    }


}
