package com.hillel.application.presentation.controller;

import com.hillel.application.infrastructure.exceptions.SchoolManagerArchitecturalException;
import com.hillel.application.infrastructure.exceptions.SchoolManagerThinkingException;
import com.hillel.application.presentation.model.Teacher;
import com.hillel.application.service.SchoolService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1")
@Validated
public class SchoolController {

    @Autowired
    private SchoolService schoolService;



    @PutMapping(value = "/teacher/{id}")
    public Teacher createTeacher(@PathVariable String id,
                                 @RequestBody Teacher teacher) {


        return  new Teacher(id, null, null, null);
    }



    @RequestMapping(
            method = RequestMethod.POST,
            value = "/transaction",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity< @Size(min = 4, max = 10) String> executeTransaction(@Valid @RequestBody(required = false) Teacher teacher) {


        return ResponseEntity.ok().build();
    }

    @PostMapping(value = "/report")
    public ResponseEntity<String> saveReport(@RequestPart(value = "reportFile") MultipartFile reportFile,
                                             @RequestPart Teacher teacher) throws IOException {

        return ResponseEntity.ok("Report saved");
    }

    @GetMapping(value = "/thinking/{id}")
    public ResponseEntity<String> needToThink(@PathVariable String id) {

        if (id.equals("000")) {
            throw new SchoolManagerThinkingException("Are you sure you want to");
        }

        if (id.equals("{~0~}")) {
            throw new SchoolManagerArchitecturalException("Incorrect code structure");
        }

        return ResponseEntity.ok("Need to Think");
    }
}
