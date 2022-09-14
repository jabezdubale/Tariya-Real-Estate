package com.tariyarealestate.tariyarealestate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase
@AutoConfigureMockMvc
public class AccountControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldSendAccountToServiceAndToRepositoryAndCreateAnAccount() throws Exception {

        String payload = "{\n" +
                "  \"fullName\": \"Selamawit Hunegnaw\",\n" +
                "  \"phone\": \"0944229033\",\n" +
                "  \"email\": \"Selamawit@gmail.com\",\n" +
                "  \"dob\": \"1994-11-15\",\n" +
                "  \"permission\": \"Seller\",\n" +
                "  \"pin\": 2550\n" +
                "}";

        mockMvc.perform(
                post("/api/account/create")
                        .contentType("application/json")
                        .content(payload)
                )
                .andDo(print())
                .andExpect(status().is(200));



    }
}
