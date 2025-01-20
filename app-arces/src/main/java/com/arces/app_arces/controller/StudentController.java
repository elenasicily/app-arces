package com.arces.app_arces.controller;
/*
import com.arces.app_arces.entity.Student;
import com.arces.app_arces.repository.StudentRepository;
import com.arces.app_arces.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


import java.util.List;

 @RestController
 @RequestMapping("/app")
 public class StudentController {

 private final StudentService studentService;

 public StudentController(StudentService studentService) {

     this.studentService = studentService;
      }

     @GetMapping("/students")
     public List<Student> getAllStudents() {
         return studentService.findAll();
     }
}
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import com.arces.app_arces.entity.Student;
import com.arces.app_arces.service.StudentService;
import java.util.*;

@RestController
//@RequestMapping("/app")
public class StudentController {
    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
    private final StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService; }

    @GetMapping("/students")
    @ResponseBody
    public List<Student> getAllStudents() {
        List<Student> students = studentService.findAll();
        logger.debug("Retrieved students: {}", students);
        return students;
    }

    @GetMapping("/by-email/{email}/students")
    public Student getStudentsByEmail(@PathVariable String email) {
        return studentService.findStudentByEmail(email);
      //  logger.debug("Retrieved students: {}", students);
    }

    @GetMapping("/by-id/{id}/students")
    public Student getStudentsById(@PathVariable Long  id) {
        return studentService.findStudentByID(id);
        //  logger.debug("Retrieved students: {}", students);
    }

    }