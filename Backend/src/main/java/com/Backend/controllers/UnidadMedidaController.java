package com.Backend.controllers;


import com.Backend.entities.UnidadMedida;
import com.Backend.services.UnidadMedidaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/unidadMedidas")
public class UnidadMedidaController extends BaseControllerImpl<UnidadMedida, UnidadMedidaServiceImpl>{

}

