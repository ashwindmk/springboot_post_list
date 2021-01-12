package com.ashwin.api.route;

import com.ashwin.api.dto.StudentListDto;
import com.ashwin.domain.model.Student;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    List<Student> studentList = Collections.synchronizedList(new ArrayList<>());

    @PostMapping
    @RequestMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addStudent(@RequestBody StudentListDto studentListDto) {
        studentList.addAll(studentListDto.getStudentList());
        System.out.println(studentList);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    @RequestMapping(value = "/addall", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addAllStudent(@RequestBody List<Student> students) {
        studentList.addAll(students);
        System.out.println(studentList);
        return ResponseEntity.ok().build();
    }
}
