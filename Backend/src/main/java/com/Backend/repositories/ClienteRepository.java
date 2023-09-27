package com.Backend.repositories;

import com.Backend.entities.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends BaseRepository<Cliente, Long> {

 //Anotacion metodo Query
    List<Cliente> findByNombreContainingOrApellidoContaining(String nombre, String apellido);
   // boolean existsByDni(int dni);

    //Anotacion JPQL parametros indexados
    @Query(value = "SELECT c FROM Cliente c WHERE c.nombre LIKE '%?1%' OR c.apellido LIKE '%?1%'" )
    List<Cliente> search(String filtro);

    //QUERy nativo
    @Query(
            value = "SELECT * FROM cliente WHERE cliente.nombre LIKE '%?1%' OR cliente.apellido LIKE '%?1%'",
            nativeQuery = true
    )
    List<Cliente> search1(String filtro);
}
