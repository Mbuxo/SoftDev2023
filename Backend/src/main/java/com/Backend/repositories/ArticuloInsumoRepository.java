package com.Backend.repositories;

import com.Backend.entities.ArticuloInsumo;
import com.Backend.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloInsumoRepository extends BaseRepository<ArticuloInsumo, Long> {

}