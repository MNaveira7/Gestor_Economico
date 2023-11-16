package com.gestorEconomico.gestoreconomiafamiliar.application.serviceimpl.acciones;

import com.gestorEconomico.gestoreconomiafamiliar.application.service.acciones.ListAccionesService;
import com.gestorEconomico.gestoreconomiafamiliar.infraestructure.repository.acciones.ListAccionesRepository;
import com.gestorEconomico.gestoreconomiafamiliar.shared.dto.AccionesDTO;
import com.gestorEconomico.gestoreconomiafamiliar.shared.mapper.AccionesMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListAccionesServiceImpl implements ListAccionesService {

    private final ListAccionesRepository listAccionesRepository;

    private final AccionesMapper accionesMapper;

    public ListAccionesServiceImpl(
            ListAccionesRepository listAccionesRepository,
            AccionesMapper accionesMapper) {

        this.listAccionesRepository = listAccionesRepository;
        this.accionesMapper = accionesMapper;
    }

    public List<AccionesDTO> list() {
        return this.listAccionesRepository.findAll().stream()
                .map(this.accionesMapper::entityToDto)
                .collect(Collectors.toList());
    }
}
