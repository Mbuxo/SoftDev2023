package com.Backend.controllers;


import com.Backend.entities.Domicilio;
import com.Backend.services.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl>{

}

