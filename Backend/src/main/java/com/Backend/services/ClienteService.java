package com.Backend.services;

import com.Backend.entities.Base;
import com.Backend.entities.Cliente;
import com.Backend.repositories.BaseRepository;
import com.Backend.repositories.ClienteRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class ClienteService extends BaseServiceImpl<Cliente, Long>{

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteService(BaseRepository<Cliente, Long> baseRepository, ClienteRepository clienteRepository) {
        super(baseRepository);
        this.clienteRepository = clienteRepository;
    }
// EN LOS VIDEOS NO HACE FALTA IMPLEMETAR LOS METODOS ACA, VER EN CLASE
    @Override
    public List<Cliente> findAll() throws Exception {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Cliente save(Cliente entity) throws Exception {
        return clienteRepository.save(entity);
    }

    @Override
    public Cliente update(Long aLong, Cliente entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}
