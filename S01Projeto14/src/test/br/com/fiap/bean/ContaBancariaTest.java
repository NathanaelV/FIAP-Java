package test.br.com.fiap.bean;


import main.br.com.fiap.bean.ContaBacaria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaBancariaTest {
    private ContaBacaria conta;
    private float saldo;

    @BeforeEach
    public void criaConta() {
        conta = new ContaBacaria();
        conta.setSaldo(800.0f);
    }

    // Sacar
    @Test
    void UsuarioSacaDinheiroSaldoFicaPositivo() {
        saldo = conta.sacar(500);

        assertEquals(300f, saldo);
    }

    @Test
    void UsuarioSacaDinheiroSaldoFicaZero() {
        saldo = conta.sacar(800);

        assertEquals(0f, saldo);
    }

    @Test
    void UsuarioNaoTemSaldoSuficiente() {
        saldo = conta.sacar(1000);

        assertEquals(800f, saldo);
    }

    // Depositar
    @Test
    void UsuarioFazDeposito() {
        saldo = conta.depositar(400.5f);

        assertEquals(1200.5f, saldo);
    }
}
