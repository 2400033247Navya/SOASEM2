package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(AddController.class)
class AddControllerTest {

    @Autowired
    private MockMvc mockMvc;

    // Step 1 + Step 2: GET /ms1/add?a=-5&b=5 -> 200 OK and "MS 1.1 - Additon = 0"
    @Test
    void addNegativeAndPositive_returnsZero() throws Exception {
        mockMvc.perform(get("/ms1/add")
                        .param("a", "-5")
                        .param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("MS 1.1 - Additon = 0"));
    }

    // Extra boundary cases
    @Test
    void addTwoNegatives_returnsNegativeSum() throws Exception {
        mockMvc.perform(get("/ms1/add")
                        .param("a", "-5")
                        .param("b", "-5"))
                .andExpect(status().isOk())
                .andExpect(content().string("MS 1.1 - Additon = -10"));
    }

    @Test
    void addZeros_returnsZero() throws Exception {
        mockMvc.perform(get("/ms1/add")
                        .param("a", "0")
                        .param("b", "0"))
                .andExpect(status().isOk())
                .andExpect(content().string("MS 1.1 - Additon = 0"));
    }
}
