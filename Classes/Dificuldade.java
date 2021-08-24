package Classes;

public class Dificuldade {
    private int ID = 0;
    private String Nome = "";
    private int Tempo = 0;

    public int getID() {
        return this.ID;
    }

    public void setID(int iD) {
        this.ID = iD;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public int getTempo() {
        return this.Tempo;
    }

    public void setTempo(int tempo) {
        this.Tempo = tempo;
    }

    public Dificuldade() {
    }
}
