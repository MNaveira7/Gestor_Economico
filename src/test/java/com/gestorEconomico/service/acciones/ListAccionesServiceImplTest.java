package com.gestorEconomico.service.acciones;

import com.gestorEconomico.gestoreconomiafamiliar.application.serviceimpl.acciones.ListAccionesServiceImpl;
import com.gestorEconomico.gestoreconomiafamiliar.infraestructure.repository.acciones.ListAccionesRepository;
import com.gestorEconomico.gestoreconomiafamiliar.shared.dto.AccionesDTO;
import com.gestorEconomico.gestoreconomiafamiliar.shared.mapper.AccionesMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class ListAccionesServiceImplTest {

    @Mock
    private ListAccionesRepository listAccionesRepository;

    @Mock
    private AccionesMapper accionesMapper;

    @InjectMocks
    private ListAccionesServiceImpl listAccionesService;

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void list_ShouldReturnEmptyList_WhenNoEntitiesFound() {
        when(listAccionesRepository.findAll()).thenReturn(Collections.emptyList());

        List<AccionesDTO> result = listAccionesService.list();

        assertEquals(0, result.size(), "La lista devuelta debe estar vacía");
        verify(listAccionesRepository).findAll();
    }

}