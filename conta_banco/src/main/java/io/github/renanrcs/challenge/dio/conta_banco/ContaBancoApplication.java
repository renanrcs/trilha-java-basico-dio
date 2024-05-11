package io.github.renanrcs.challenge.dio.conta_banco;

import java.math.BigDecimal;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.renanrcs.challenge.dio.conta_banco.model.ContaBanco;

@SpringBootApplication
public class ContaBancoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContaBancoApplication.class, args);

		ContaBanco contaBanco = new ContaBanco();

		contaBanco.criarConta();

	}

}
