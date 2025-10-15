package com.example.practice_github_group.repository;

import com.example.practice_github_group.model.teachers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface teacherRepository extends JpaRepository<teachers, Integer> {
}
