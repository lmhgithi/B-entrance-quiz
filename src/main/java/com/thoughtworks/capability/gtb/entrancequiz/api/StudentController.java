package com.thoughtworks.capability.gtb.entrancequiz.api;


import com.thoughtworks.capability.gtb.entrancequiz.domain.Group;
import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    @CrossOrigin
    public ResponseEntity<List<Student>> getStudents() {
        return ResponseEntity.ok(studentService.getStudents());
    }

    @GetMapping("/studentsGroup")
    @CrossOrigin
    public ResponseEntity<List<Group>> getStudentsGroup() {
        return ResponseEntity.ok(studentService.getStudentsGroup());
    }

    @PostMapping("/student")
    @CrossOrigin
    public ResponseEntity getStudentsGroup(@RequestParam String name) {
        studentService.addStudent(name);
        return ResponseEntity.ok().build();
    }
}
