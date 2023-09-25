package com.Backend.controllers;



import com.Backend.entities.Pedido;
import com.Backend.services.PedidoServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoServiceImpl>{

}

