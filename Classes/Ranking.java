package Classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ranking {
    private Jogador User;
    private Jogo jogo;
    private Dificuldade Dificuldade;

    public Ranking() {
    }

    public Jogador getUser() {
        return this.User;
    }

    public void setUser(Jogador user) {
        this.User = user;
    }

    public Jogo getJogo() {
        return this.jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public Dificuldade getDificuldade() {
        return this.Dificuldade;
    }

    public void setDificuldade(Dificuldade dificuldade) {
        this.Dificuldade = dificuldade;
    }

    public void SalvarRanking() {
        Arquivo a = new Arquivo();
        a.setNomeArquivo("Ranking.TXT");
        a.setTexto(this.User.getUsuario() + ";" + this.jogo.getPontos() + ";" + this.Dificuldade.getID() + ";" + this.Dificuldade.getNome());
        System.out.println(a.GravarArquivo());
    }

    public List<Ranking> Ler() {
        Arquivo a = new Arquivo();
        a.setNomeArquivo("Ranking.txt");
        new ArrayList();
        List<String> lista_ranking = a.LerArquivo();
        List<Ranking> list_usr = new ArrayList();
        Iterator var5 = lista_ranking.iterator();

        while(var5.hasNext()) {
            String linha_da_lista = (String)var5.next();
            String[] vet_campos = linha_da_lista.split(";");
            Ranking r = new Ranking();
            this.jogo = new Jogo();
            this.Dificuldade = new Dificuldade();
            this.jogo.setNomeUsuario(vet_campos[0]);
            this.jogo.setPontos(Integer.parseInt(vet_campos[1]));
            this.Dificuldade.setID(Integer.parseInt(vet_campos[2]));
            this.Dificuldade.setNome(vet_campos[3]);
            r.setDificuldade(this.Dificuldade);
            r.setJogo(this.jogo);
            list_usr.add(r);
        }

        return list_usr;
    }
}
