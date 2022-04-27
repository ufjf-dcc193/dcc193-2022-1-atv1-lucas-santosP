package br.ufjf.dcc193.exemplo_00;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exemplo00Application {

	public static void main(String[] args) {
		SpringApplication.run(Exemplo00Application.class, args);
		System.out.println("Hi world!");
	}

}
