package com.Backend.services;

import com.Backend.entities.ArticuloInsumo;
import com.Backend.entities.Cliente;
import com.Backend.repositories.ArticuloInsumoRepository;
import com.Backend.repositories.BaseRepository;
import com.Backend.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloInsumoServiceImpl extends BaseServiceImpl<ArticuloInsumo, Long> implements ArticuloInsumoService{

    @Autowired
    private ArticuloInsumoRepository articuloInsumoRepository;


    public ArticuloInsumoServiceImpl(BaseRepository<ArticuloInsumo, Long> baseRepository) {
        super(baseRepository);
    }
}