package com.gestorEconomico.controller.acciones;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.gestorEconomico.gestoreconomiafamiliar.application.service.acciones.ListAccionesService;
import com.gestorEconomico.gestoreconomiafamiliar.infraestructure.controller.Acciones.ListAccionesController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Collections;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@ExtendWith(MockitoExtension.class)
class ListAccionesControllerTest {

    @Mock
    private ListAccionesService listAccionesService;

    @InjectMocks
    private ListAccionesController listAccionesController;

    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(listAccionesController).build();
    }

    @Test
    public void getAllAcciones_ShouldReturnEmptyList() throws Exception {

        when(listAccionesService.list()).thenReturn(Collections.emptyList());

        mockMvc.perform(get("/acciones/findAcciones")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$").isEmpty());

        verify(listAccionesService).list();
    }

}
