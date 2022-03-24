package com.action.in.taco.cloud.app;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import com.action.in.taco.cloud.app.controller.HomeController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

//@WebAppConfiguration
@ContextConfiguration(classes = TacoCloudAppApplication.class)
@WebMvcTest(HomeController.class)
//@SpringBootTest
class TacoCloudAppApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void contextLoads() {
        try {
            mockMvc.perform(get("/"))
                    .andExpect(status().is2xxSuccessful())
                    .andExpect(view().name("home"))
                    .andExpect(content().string(containsString("Welcome to...")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
