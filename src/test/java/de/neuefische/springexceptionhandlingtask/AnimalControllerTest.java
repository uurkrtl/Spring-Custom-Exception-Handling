package de.neuefische.springexceptionhandlingtask;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@AutoConfigureMockMvc
class AnimalControllerTest {
    @Autowired
    private MockMvc mvc;

    @Autowired
    private AnimalController animalController;

    @Test
    void getAnimalSpeciesTest_NotDog_ShouldReturnBadRequest() throws Exception {
        String species = "cat";

        mvc.perform(MockMvcRequestBuilders.get("/api/animals/{species}", species)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isBadRequest())
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorMessage").value("Only 'dog' is allowed"));

    }

    @Test
    void getAllAnimalsTest_ShouldReturnNotFound() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/api/animals")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isInternalServerError())
                .andExpect(MockMvcResultMatchers.content().string("No Animals found"));
    }
}