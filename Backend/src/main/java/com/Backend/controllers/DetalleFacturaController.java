package com.Backend.controllers;


import com.Backend.entities.DetalleArticuloManufacturado;

import com.Backend.entities.DetalleFactura;
import com.Backend.services.DetalleArticuloManufacturadoServiceImpl;
import com.Backend.services.DetalleFacturaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="api/v1/detalleFacturas")
public class DetalleFacturaController extends BaseControllerImpl<DetalleFactura, DetalleFacturaServiceImpl> {
}
