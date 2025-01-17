package com.Backend.controllers;

import com.Backend.entities.ArticuloInsumo;
import com.Backend.entities.DetalleArticuloManufacturado;
import com.Backend.services.ArticuloInsumoServiceImpl;
import com.Backend.services.DetalleArticuloManufacturadoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="api/v1/detalleArticuloManufacturados")
public class DetalleArticuloManufacturadoController extends BaseControllerImpl<DetalleArticuloManufacturado, DetalleArticuloManufacturadoServiceImpl> {
}

