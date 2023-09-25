package com.Backend.services;

import com.Backend.entities.DetalleArticuloManufacturado;
import com.Backend.repositories.BaseRepository;
import com.Backend.repositories.DetalleArticuloManufacturadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleArticuloManufacturadoServiceImpl extends BaseServiceImpl<DetalleArticuloManufacturado, Long> implements DetalleArticuloManufacturadoService {
    @Autowired
    private DetalleArticuloManufacturadoRepository detalleArticuloManufacturadoRepository;

    public DetalleArticuloManufacturadoServiceImpl(BaseRepository<DetalleArticuloManufacturado, Long> baseRepository) {
        super(baseRepository);
    }
}
