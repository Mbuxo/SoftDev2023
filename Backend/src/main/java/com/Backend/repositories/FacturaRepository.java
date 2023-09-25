package com.Backend.repositories;

import com.Backend.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends BaseRepository<Factura, Long> {

}


