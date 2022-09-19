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
                "  \"sellerId\": 1,\n" +
                "  \"location\": \"Test location\",\n" +
                "  \"houseType\": \"Condominium\",\n" +
                "  \"price\": 2600456.65,\n" +
                "  \"description\": \"Test description\",\n" +
                "  \"verificationDocs\": \"VerificationDoc1\",\n" +
                "  \"houseStatus\": \"Sold\",\n" +
                "  \"verificationStatus\": 0\n" +
                "}\n";

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
