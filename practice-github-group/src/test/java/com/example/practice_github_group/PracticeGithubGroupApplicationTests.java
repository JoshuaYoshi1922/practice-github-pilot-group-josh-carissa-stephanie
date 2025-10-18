package com.example.practice_github_group;

import com.example.practice_github_group.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PracticeGithubGroupApplicationTests {

	@Test
	void contextLoads() {
	}

    @Test
    public void testCreateStudent() {
        Student student = new Student("Arthur Burrito");
        assertEquals("Arthur Burrito", student.getName());
    }

    @Test
    public void testUpdateStudent() {
        Student student = new Student("Mae Mae");
        student.setName("Cora Beanie");
        assertEquals("Cora Beanie", student.getName());
    }

}
