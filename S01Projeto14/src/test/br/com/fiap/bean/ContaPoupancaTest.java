package test.br.com.fiap.bean;


import main.br.com.fiap.bean.ContaPoupanca;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaPoupancaTest {
    private ContaPoupanca conta;
    private float saldo;

    @BeforeEach
    public void criaConta() {
        conta = new ContaPoupanca();
        conta.setSaldo(800.0f);
        conta.setDiaDeRendimento(10);
    }

    // novoSaldo
    @Test
    public void rendimentoDoMesAplicado() {
        // Valor passado em %
        saldo = conta.novoSaldo(0.5f);

        assertEquals(804f, saldo);
    }

    @Test
    public void rendimentoNaoAplicado() {
        conta.setDiaDeRendimento(15);
        saldo = conta.novoSaldo(0.5f);

        assertEquals(800f, saldo);
    }
}
