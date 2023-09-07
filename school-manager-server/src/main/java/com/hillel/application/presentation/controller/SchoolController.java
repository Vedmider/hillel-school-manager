package com.hillel.application.presentation.controller;

import com.hillel.api.SchoolManagerApi;
import com.hillel.model.School;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@Validated
public class SchoolController implements SchoolManagerApi {

    @Override
    public ResponseEntity<School> getSchools(@PathVariable("id") String id,
                                             @Valid @RequestParam(value = "verbosity", required = false, defaultValue = "all") String verbosity
    ) {

        return ResponseEntity.ok(new School());
    }

    @PostMapping(value = "/post")
    public ResponseEntity<String> post(@RequestParam(value = "i_know_what_i_am_doing", required = false) String warning) {

        if (warning != null && warning.equals("")) {
            System.out.println("Start process");
        }

        return ResponseEntity.ok("");
    }

    @RequestMapping("/greeting")
    public @ResponseBody String greeting() {
        return "Hello MVC world";
    }

}
