package com.Backend.controllers;


import com.Backend.entities.Domicilio;
import com.Backend.entities.Factura;
import com.Backend.services.DomicilioServiceImpl;
import com.Backend.services.FacturaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/facturas")
public class FacturaController extends BaseControllerImpl<Factura, FacturaServiceImpl>{

}

