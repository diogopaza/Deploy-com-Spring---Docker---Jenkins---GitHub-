package com.example.deployjenkinsspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controllerPrincipal")
public class ControllerTeste {

	@GetMapping
	public String teste() {
		return "resposta do controller TESTE";
	}
}
