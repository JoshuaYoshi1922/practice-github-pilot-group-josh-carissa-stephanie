package com.example.practice_github_group.repository;

import com.example.practice_github_group.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
