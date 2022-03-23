package com.action.in.taco.cloud.app;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import com.action.in.taco.cloud.app.controller.HomeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(HomeController.class)
@SpringBootTest
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
