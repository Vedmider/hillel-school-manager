package com.hillel.application.presentation.controller;

import com.hillel.application.persistent.entity.School;
import com.hillel.application.presentation.model.Teacher;
import com.hillel.application.service.SchoolService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@Validated
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @PutMapping(value = "/school/{schoolId}")
    public School createSchool(@PathVariable Long schoolId,
                               @RequestHeader(value = HttpHeaders.ACCEPT_LANGUAGE, required = false) String language,
                               @RequestHeader Map<String, String> headers) {

        School school = schoolService.create();
        return school;
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/items/{id}",
            produces = {"application/json"}
    )
    public ResponseEntity<String> getItemById(@PathVariable("id") @Size(max = 10) String id,
                                              @PathVariable("uuid") String uuid,
                                              @RequestParam(value = "verbosity",
                                                      required = false,
                                                      defaultValue = "all") List<String> verbosity) {


        return ResponseEntity.ok("Fetched Item by id: " + id);
    }

    @RequestMapping(
            method = RequestMethod.POST,
            value = "/transaction",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity<String> executeTransaction(@Valid @RequestBody(required = false) Teacher teacher) {


        return ResponseEntity.ok().build();
    }

    @PostMapping(value = "/report")
    public ResponseEntity<String> saveReport(@RequestPart(value = "reportFile") MultipartFile reportFile,
                                             @RequestPart Teacher teacher) throws IOException {

        return ResponseEntity.ok("Report saved");
    }
}
