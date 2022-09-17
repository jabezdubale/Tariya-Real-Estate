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
public class HouseCreationIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldCreateAndReturnTheHousesData() throws Exception {

        //Given
        String payload = "{\n" +
                "  \"sellerId\": 4,\n" +
                "  \"location\": \"googlelink1\",\n" +
                "  \"houseType\": \"Mansion\",\n" +
                "  \"price\": 2600.65,\n" +
                "  \"description\": \"The house is super big that you can bring a horse in the salon\",\n" +
                "  \"verificationDocs\": \"VerificationDoc1\"\n" +
                "}";

        //When
        mockMvc.perform(
                post("/api/realestate/create")
                        .contentType("application/json")
                        .content(payload)
        ) //Then
                .andDo(print())
                .andExpect(status().is(200));

    }

}
