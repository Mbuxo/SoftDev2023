package com.Backend.controllers;

import com.Backend.entities.ArticuloInsumo;
import com.Backend.entities.ArticuloManufacturado;
import com.Backend.services.ArticuloInsumoServiceImpl;
import com.Backend.services.ArticuloManufacturadoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="api/v1/articuloManufacturados")
public class ArticuloManufacturadoController extends BaseControllerImpl<ArticuloManufacturado, ArticuloManufacturadoServiceImpl> {
}
