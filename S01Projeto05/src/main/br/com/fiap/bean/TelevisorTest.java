package main.br.com.fiap.bean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisorTest {

    private final Televisor TV = new Televisor();

    @Test
    void aumentarVolume() {
        TV.volume = 3;
        TV.aumentarVolume();
        TV.aumentarVolume();
        Assertions.assertEquals(5, TV.volume);
    }

    @Test
    void diminuirVolume() {
        TV.volume = 5;
        TV.diminuirVolume();
        TV.diminuirVolume();

        Assertions.assertEquals(3, TV.volume);
    }

    @Test
    void trocarCanal() {
        TV.canal = 2;
        TV.trocarCanal(8);

        Assertions.assertEquals(8, TV.canal);
    }
}
