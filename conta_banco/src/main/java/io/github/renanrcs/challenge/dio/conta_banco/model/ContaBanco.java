package io.github.renanrcs.challenge.dio.conta_banco.model;

import java.math.BigDecimal;

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

    private static final String AGENCY = "067-8";

    private Long number;
    private String nameClient;
    private BigDecimal amount;

    @Override
    public String toString() {
        return "Olá " + getNameClient() + ", obrigado por criar uma conta em nosso banco, sua agência é " + ContaBanco.AGENCY + ", conta " + getNumber() + " e seu saldo R$" + getAmount() + " já está disponível para saque";
    }

}
