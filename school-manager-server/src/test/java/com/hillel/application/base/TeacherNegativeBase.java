package com.hillel.application.base;

import com.hillel.application.presentation.controller.SchoolController;
import com.hillel.application.service.SchoolService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.context.WebApplicationContext;

@WebMvcTest(SchoolController.class)
public class TeacherNegativeBase {

    @Autowired
    private WebApplicationContext context;

    @MockBean
    private SchoolService schoolService;

    @BeforeEach
    public void setUp() {
        RestAssuredMockMvc.webAppContextSetup(context);
    }
}
