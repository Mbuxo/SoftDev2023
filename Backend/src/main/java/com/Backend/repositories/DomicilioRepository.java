package com.Backend.repositories;

import com.Backend.entities.ArticuloInsumo;
import com.Backend.entities.Cliente;
import com.Backend.entities.DetalleFactura;
import com.Backend.entities.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio, Long> {

}

