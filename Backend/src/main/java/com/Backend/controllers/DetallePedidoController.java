package com.Backend.controllers;


import com.Backend.entities.DetallePedido;
import com.Backend.services.DetallePedidoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="api/v1/detallePedidos")
public class DetallePedidoController extends BaseControllerImpl<DetallePedido, DetallePedidoServiceImpl> {
}
