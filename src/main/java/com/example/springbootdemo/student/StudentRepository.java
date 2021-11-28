package com.example.springbootdemo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository
        extends JpaRepository<Student, Long> {

    // @Query("SELECT * FROM Student s WHERE s.email = ?1") -> jSQL
    Optional<Student> findStudentByEmail(String email);
}
