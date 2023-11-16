package com.gestorEconomico.gestoreconomiafamiliar.shared.mapper.repository;

import com.gestorEconomico.gestoreconomiafamiliar.domain.entity.AccionesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  AccionesRepository extends JpaRepository<AccionesEntity, Integer> {
}
