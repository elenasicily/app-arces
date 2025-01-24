package com.arces.app_arces.service;
/*
import com.arces.app_arces.entity.Student;
import com.arces.app_arces.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {

        this.studentRepository = studentRepository;
    }
*/
   /*  @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    */
/*
   // @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
*/
    /*
    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

    @Override
    public Student getStudentByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.arces.app_arces.entity.Student;
import com.arces.app_arces.repository.StudentRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class StudentService {
    private static final Logger logger = LoggerFactory.getLogger(StudentService.class);
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll() {
        List<Student> students = studentRepository.findAll();
        logger.debug("Students found: {}", students);
        return students;
    }

    public Student findStudentByID (Long id) {
        return studentRepository.findById(id).orElseThrow(()->new RuntimeException ("Student not found"));
    }

    public Student findStudentByEmail (String email) {
        return studentRepository.findByEmail(email).orElseThrow(()->new RuntimeException ("Student not found"));
    }

    public List<Student> findStudentWithInteres () {
        return studentRepository.findStudentsWithInteres();
    }

}

