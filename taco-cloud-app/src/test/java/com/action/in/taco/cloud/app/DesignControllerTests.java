package com.action.in.taco.cloud.app;

import com.action.in.taco.cloud.app.controller.DesignTacoController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


@WebMvcTest(DesignTacoController.class)
@SpringBootTest
public class DesignControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void context(){

    }

    @Test
    void orderPage() {
        try {
            mockMvc.perform(get("/design"))
                    .andExpect(status().is2xxSuccessful())
                    .andExpect(view().name("design"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
