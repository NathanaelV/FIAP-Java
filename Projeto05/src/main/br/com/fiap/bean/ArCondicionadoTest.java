package main.br.com.fiap.bean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArCondicionadoTest {

    private final ArCondicionado AR_COND = new ArCondicionado();

    @Test
    public void aumentarTemperatura() {
        AR_COND.temperatura = 18;
        AR_COND.aumentarTemperatura();
        AR_COND.aumentarTemperatura();

        Assertions.assertEquals(20, AR_COND.temperatura);
    }

    @Test
    public void diminuirTemeratura() {
        AR_COND.temperatura = 26;
        AR_COND.diminuirTemperatura();
        AR_COND.diminuirTemperatura();
        AR_COND.diminuirTemperatura();
        AR_COND.diminuirTemperatura();

        Assertions.assertEquals(22, AR_COND.temperatura);

        AR_COND.diminuirTemperatura();
        AR_COND.diminuirTemperatura();
        Assertions.assertEquals(20, AR_COND.temperatura);
    }

    @Test
    public void trocarModo() {
        AR_COND.modo = "Aquecer";

        AR_COND.trocarModo("Resfriar");

        Assertions.assertEquals("Resfriar", AR_COND.modo);
    }
}
