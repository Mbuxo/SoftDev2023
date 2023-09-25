package com.Backend.controllers;


import com.Backend.entities.Usuario;
import com.Backend.services.UsuarioServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/usuarios")
public class UsuarioController extends BaseControllerImpl<Usuario, UsuarioServiceImpl>{

}

