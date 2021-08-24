package Classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Jogo {
    private String nomeUsuario;
    private int contador;
    private int pontos;
    private int continua;
    private Dificuldade Dificuldade;
    private ArrayList<Integer> Jogador_Jogada = new ArrayList();
    private ArrayList<Integer> Jogada_Jogo = new ArrayList();
    Random ran = new Random();
    private Jogador User;

    public Jogador getUser() {
        return this.User;
    }

    public void setUser(Jogador user) {
        this.User = user;
    }

    public String getNomeUsuario() {
        return this.nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getCont() {
        return this.contador;
    }

    public void setCont(int cont) {
        this.contador = cont;
    }

    public int getPontos() {
        return this.pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getContinua() {
        return this.continua;
    }

    public void setContinua(int continua) {
        this.continua = continua;
    }

    public Dificuldade getDificuldade() {
        return this.Dificuldade;
    }

    public void setDificuldade(Dificuldade dificuldade) {
        this.Dificuldade = dificuldade;
    }

    public ArrayList<Integer> getJogador_Jogada() {
        return this.Jogador_Jogada;
    }

    public void setJogador_Jogada(ArrayList<Integer> jogador) {
        this.Jogador_Jogada = jogador;
    }

    public ArrayList<Integer> getJogada_Jogo() {
        return this.Jogada_Jogo;
    }

    public void setJogada_Jogo(ArrayList<Integer> jogada) {
        this.Jogada_Jogo = jogada;
    }

    public Jogo() {
    }

    public ArrayList<Integer> sorteia() {
        this.Jogada_Jogo.add(this.ran.nextInt(4));
        return this.Jogada_Jogo;
    }

    public Boolean verifica() {
        for(int i = 0; i < this.Jogador_Jogada.size(); ++i) {
            if (this.Jogador_Jogada.get(i) != this.Jogada_Jogo.get(i)) {
                this.SalvarJogadaJogo();
                return false;
            }

            if (this.Jogador_Jogada.equals(this.Jogada_Jogo)) {
                this.continua = 1;
                ++this.pontos;
                this.sorteia();
                this.getJogador_Jogada().clear();
            }
        }

        return true;
    }

    public void Salvar() {
        Arquivo a = new Arquivo();
        a.setNomeArquivo("Jogo.TXT");
        String Sequencia = "";

        Integer Jogada;
        for(Iterator var4 = this.Jogador_Jogada.iterator(); var4.hasNext(); Sequencia = Jogada.toString() + "," + Sequencia) {
            Jogada = (Integer)var4.next();
        }

        a.setTexto(this.User.getUsuario() + ";" + this.pontos + ";" + this.Dificuldade.getID() + ";" + Sequencia);
        System.out.println(a.GravarArquivo());
    }

    public void SalvarJogadaJogo() {
        Arquivo a = new Arquivo();
        a.setNomeArquivo("JogadaJogo.TXT");
        String Sequencia = "";

        Integer Jogada;
        for(Iterator var4 = this.Jogada_Jogo.iterator(); var4.hasNext(); Sequencia = Jogada.toString() + "," + Sequencia) {
            Jogada = (Integer)var4.next();
        }

        a.setTexto(Sequencia);
        System.out.println(a.GravarArquivo());
    }

    public List<Jogo> Ler() {
        Arquivo a = new Arquivo();
        a.setNomeArquivo("Jogo.TXT");
        new ArrayList();
        List<String> lista_pontos = a.LerArquivo();
        List<Jogo> list_usr = new ArrayList();
        Iterator var5 = lista_pontos.iterator();

        while(var5.hasNext()) {
            String linha_da_lista = (String)var5.next();
            String[] vet_campos = linha_da_lista.split(";");
            String[] vet_sequencia = vet_campos[3].split(",");
            Jogo usr = new Jogo();
            this.Dificuldade = new Dificuldade();
            usr.setNomeUsuario(vet_campos[0]);
            usr.setPontos(Integer.parseInt(vet_campos[1]));
            this.Dificuldade.setNome(vet_campos[2]);
            usr.setDificuldade(this.Dificuldade);
            String[] var12 = vet_sequencia;
            int var11 = vet_sequencia.length;

            for(int var10 = 0; var10 < var11; ++var10) {
                String var10000 = var12[var10];
            }

            System.out.println(vet_campos[0] + ";" + vet_campos[1] + ";" + vet_campos[2] + ";" + vet_campos[3]);
            list_usr.add(usr);
        }

        return list_usr;
    }

    public List<Jogo> LerUltimaJogada() {
        Arquivo a = new Arquivo();
        a.setNomeArquivo("JogadaJogo.TXT");
        new ArrayList();
        List<String> lista_jogada = a.LerArquivo();
        List<Jogo> list_usr = new ArrayList();
        Iterator var5 = lista_jogada.iterator();

        while(var5.hasNext()) {
            String linha_da_lista = (String)var5.next();
            String[] vet_campos = linha_da_lista.split(";");
            String[] vet_sequencia = vet_campos[0].split(",");
            Jogo usr = new Jogo();
            System.out.println(vet_campos[0]);
            list_usr.add(usr);
        }

        return list_usr;
    }
}
