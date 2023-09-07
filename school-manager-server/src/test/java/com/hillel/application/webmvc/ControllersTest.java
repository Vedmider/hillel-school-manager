package com.hillel.application.webmvc;


import com.hillel.application.presentation.controller.SchoolController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@WebMvcTest(SchoolController.class)
public class ControllersTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    void whenValidInput_thenReturns200() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/api/v1/greeting")).andDo(print()).andReturn();

        mvcResult.getResponse().getContentAsString();
    }
}
