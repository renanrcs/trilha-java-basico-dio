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
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite o nome do cliente !");
		String nomeDoCliente = scanner.nextLine();
		contaBanco.setNameClient(nomeDoCliente); 

		System.out.println("Por favor, digite o número da Conta !");
		Long numeroDaConta = scanner.nextLong();
		contaBanco.setNumber(numeroDaConta);
		
		System.out.println("Por favor, Informe o valor do deposito !");
		BigDecimal valorDeposito = scanner.nextBigDecimal();
		contaBanco.setAmount(valorDeposito); 

		System.out.println(contaBanco);

		scanner.close();
	}

}
