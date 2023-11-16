package com.gestorEconomico.gestoreconomiafamiliar.infraestructure.repository.acciones;

import com.gestorEconomico.gestoreconomiafamiliar.domain.entity.AccionesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListAccionesRepository extends JpaRepository<AccionesEntity, Integer> {

}
