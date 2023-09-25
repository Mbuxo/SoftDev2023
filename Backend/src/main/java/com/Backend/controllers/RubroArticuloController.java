package com.Backend.controllers;


import com.Backend.entities.Domicilio;
import com.Backend.entities.RubroArticulo;
import com.Backend.services.DomicilioServiceImpl;
import com.Backend.services.RubroArticuloServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/rubroArticulos")
public class RubroArticuloController extends BaseControllerImpl<RubroArticulo, RubroArticuloServiceImpl>{

}

