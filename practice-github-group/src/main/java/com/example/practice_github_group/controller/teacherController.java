package com.example.practice_github_group.controller;

import com.example.practice_github_group.model.teachers;
import com.example.practice_github_group.repository.teacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teacher")
public class teacherController {

    @Autowired
    private teacherRepository teacherRepository;

    @GetMapping
    public List<teachers> getTeacher(){
        return teacherRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<teachers> getTeacherById(@PathVariable int id){
        return teacherRepository.findById(id);
    }

    @PostMapping
    public teachers addTeacher(@RequestBody teachers teacher){
        return teacherRepository.save(teacher);
    }

    @PutMapping("/{id}")
    public teachers updateTeacher(@PathVariable int id, @RequestBody teachers teacher) {
        Optional<teachers> existingTeacher = teacherRepository.findById(id);
        if (existingTeacher.isPresent()) {
            teachers t = existingTeacher.get();
            t.setName(teacher.getName());
            return teacherRepository.save(t);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteTeacher(@PathVariable int id){
        teacherRepository.deleteById(id);
    }

}
