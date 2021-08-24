package Teste;

import Classes.Jogador;
import Classes.Jogo;
import Classes.Ranking;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        new Jogador();
        Jogo jog = new Jogo();
        new Ranking();
        jog.Ler();
    }
}
