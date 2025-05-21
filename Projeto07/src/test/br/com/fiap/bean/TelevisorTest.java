package test.br.com.fiap.bean;

import main.br.com.fiap.bean.Televisor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TelevisorTest {
    Televisor tv = new Televisor();

    @Test
    void setVolumeCorrectly() {
        tv.setVolume(15);
        Assertions.assertEquals(15, tv.getVolume());
    }

    @Test
    void testSetVolumeGreaterThanTwenty() {
        String errorMessage = "Volume fora da faixa. (min=0 até max=20)";

        // Capture the system output
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output)); // Temporarily override System.out

        tv.setVolume(32);

        // Reset System.out to avoid affecting other tests
        System.setOut(System.out);

        // Assert the printed message
        String printed = output.toString().trim(); // remove any extra newlines/spaces
        Assertions.assertEquals(errorMessage, printed);
    }

    @Test
    void testSetVolumeLowerThanZero() {
        String errorMessage = "Volume fora da faixa. (min=0 até max=20)";

        // Capture the system output
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output)); // Temporarily override System.out

        tv.setVolume(-3);

        // Reset System.out to avoid affecting other tests
        System.setOut(System.out);

        // Assert the printed message
        String printed = output.toString().trim(); // remove any extra newlines/spaces
        Assertions.assertEquals(errorMessage, printed);
    }

    @Test
    void setCanal() {

    }

    @Test
    void aumentarVolume() {
        tv.setVolume(3);
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();

        Assertions.assertEquals(6, tv.getVolume());
    }

    @Test
    void aumentarVolumeAboveTheLimit() {
        tv.setVolume(19);

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();

        Assertions.assertEquals(20, tv.getVolume());
    }

    @Test
    void diminuirVolume() {
        tv.setVolume(5);

        tv.diminuirVolume();
        tv.diminuirVolume();

        Assertions.assertEquals(3, tv.getVolume());
    }

    @Test
    void diminuirVolumeBelowTheLimit() {
        tv.setVolume(1);

        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();

        Assertions.assertEquals(0, tv.getVolume());
    }
}