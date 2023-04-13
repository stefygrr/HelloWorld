package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	
	@GetMapping
	public String hello() {
		return "<b>Hello Turma!</b>";
	}

	@GetMapping("/nome")
	public String meuNome() {
		return "<b>Stephany</b>";
	}

	@GetMapping("/bsms")
	public String bsm() {
		return "<b>Todas as BSM's:</b>" + "<br>Orientação ao futuro</br>" + "Responsabilidade Pessoal</br>" + "Mentalidade de Crescimento</br>"
	            + "Persistência</br>" + "Trabalho em Equipe</br>" + "Atenção aos detalhes</br>"+ "Proatividade</br>" + "Comunicação</b>";
	}
	@GetMapping("/objetivo")
	public String meuobjetivo() {
		return "<b>Meu Objetivo de bsm da semana é a Persistência</br>"
	            + "<br>Pois, trabalhando com essa mentalidade consigo superar os desafios sem desistir.<br>";
	}
}
