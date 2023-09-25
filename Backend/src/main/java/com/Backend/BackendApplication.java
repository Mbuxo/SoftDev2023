package com.Backend;

import com.Backend.controllers.ClienteController;
import com.Backend.entities.Cliente;
import com.Backend.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendApplication {
	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	private ClienteController clienteController;


	public static void main(String[] args) {

		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean
	CommandLineRunner init(ClienteRepository clienteRepository){
		return args -> {
//			Cliente cliente1 = new Cliente();
//			cliente1.setNombre("joaquin :)");
//			clienteController.save(cliente1);

		};
	}
}
