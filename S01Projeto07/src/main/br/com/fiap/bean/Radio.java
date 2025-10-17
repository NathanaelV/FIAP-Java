package main.br.com.fiap.bean;

public class Radio {
    private int volume;
    private float estacao;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        try {
            if (volume >= 0 && volume <= 100) {
                this.volume = volume;
            } else {
                // Força que o catch aconteça
                throw new Exception("Volume fora da faixa permitida! (min=0 e max=100");
            }
        } catch (Exception e) {
            // Mostra a mensagem de erro. Essa é a função do getMessage()
            System.out.println(e.getMessage());
        }
    }

    public float getEstacao() {
        return estacao;
    }

    public void setEstacao(float estacao) {
        try {
            if (estacao >= 80 && estacao <= 105) {
                this.estacao = estacao;
            } else {
                throw new Exception("Estação fora da faixa permitida! (Min=80.0 e Max=105.0)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        } else {
            System.out.println("Volume MAX!");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Volume MIN");
        }
    }

}
