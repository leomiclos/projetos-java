package Telas;

public class Tela {
    public Tela() {
    }

    public static void main(String[] args) {
        TelaPrincipal tela = new TelaPrincipal();
        tela.setDefaultCloseOperation(3);
        tela.setSize(640, 480);
        tela.setResizable(false);
        tela.setVisible(true);
    }
}
