package com.gestorEconomico.gestoreconomiafamiliar.shared.mapper;

import com.gestorEconomico.gestoreconomiafamiliar.domain.entity.AccionesEntity;
import com.gestorEconomico.gestoreconomiafamiliar.shared.dto.AccionesDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccionesMapper {
    AccionesDTO entityToDto(AccionesEntity entity);
    AccionesEntity dtoToEntity(AccionesDTO dto);
}