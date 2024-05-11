package io.github.renanrcs.challenge.dio.conta_banco.model;

import java.math.BigDecimal;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ContaBanco {
    private static Scanner scanner = new Scanner(System.in);
    private static final String AGENCY = "067-8";

    private Long number;
    private String nameClient;
    private BigDecimal amount;

    public void criarConta() {
        cadastrarCliente();
        cadastrarNumeroConta();
        depositar();
        System.out.println(toString());
    }

    private void cadastrarCliente() {
        System.out.println("Por favor, digite o nome do cliente !");
        String nomeDoCliente = scanner.nextLine();
        setNameClient(nomeDoCliente); 
    }

    private void cadastrarNumeroConta() {
        System.out.println("Por favor, digite o número da Conta !");
        Long numeroDaConta = scanner.nextLong();
        setNumber(numeroDaConta);
    }

    private void depositar() {
        System.out.println("Por favor, Informe o valor do deposito !");
        BigDecimal valorDeposito = scanner.nextBigDecimal();
        scanner.close();
        setAmount(valorDeposito); 
    }


    @Override
    public String toString() {
        return "Olá " + getNameClient() + ", obrigado por criar uma conta em nosso banco, sua agência é " + ContaBanco.AGENCY + ", conta " + getNumber() + " e seu saldo R$" + getAmount() + " já está disponível para saque";
    }


}
