package com.prata.votacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class VotacaoApplication {
	public static void main(String[] args) {
		SpringApplication.run(VotacaoApplication.class, args);
	}
	@GetMapping
	public String testeHome(){
		return "teste home votacao";
	}
}