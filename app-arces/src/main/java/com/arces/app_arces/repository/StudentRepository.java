package com.arces.app_arces.repository;

import com.arces.app_arces.entity.Student;
import com.arces.app_arces.entity.StudentoCorso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // Пример дополнительного метода поиска студента по email
    Optional<Student> findByEmail(String email);

    @Query ("select s from Student s join s.studentocorsoList sc where sc.interes = true")
    List<Student> findStudentsWithInteres () ;

}
