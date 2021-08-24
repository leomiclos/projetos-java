package Classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Jogador {
    private String usuario;

    private String nome;
    private String senha;

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Jogador() {
    }

    public void Salvar() {
        Arquivo a = new Arquivo();
        a.setNomeArquivo("Jogador.txt");
        a.setTexto(this.nome + ";" + ";" + this.usuario + ";" + this.senha);
        System.out.println(a.GravarArquivo());
    }

    public List<Jogador> Ler() {
        Arquivo a = new Arquivo();
        a.setNomeArquivo("Jogador.txt");
        new ArrayList();
        List<String> lista_usuarios = a.LerArquivo();
        List<Jogador> list_usr = new ArrayList();
        Iterator var5 = lista_usuarios.iterator();

        while(var5.hasNext()) {
            String linha_da_lista = (String)var5.next();
            String[] vet_campos = linha_da_lista.split(";");
            Jogador usr = new Jogador();
            usr.setNome(vet_campos[0]);
            usr.setUsuario(vet_campos[2]);
            usr.setSenha(vet_campos[3]);
            System.out.println(vet_campos[0] + ";" + vet_campos[1] + ";" + vet_campos[2] + ";" + vet_campos[3]);
            list_usr.add(usr);
        }

        return list_usr;
    }

    public boolean verificaAvatar() {
        Arquivo a = new Arquivo();
        a.setNomeArquivo("Jogador.txt");
        new ArrayList();
        List<String> linhas = a.LerArquivo();
        Iterator var4 = linhas.iterator();

        while(var4.hasNext()) {
            String linha_da_lista = (String)var4.next();
            String[] vet_campos = linha_da_lista.split(";");
            Jogador j = new Jogador();
            j.setUsuario(vet_campos[2]);
            if (this.usuario.equals(j.getUsuario())) {
                return false;
            }
        }

        this.Salvar();
        return true;
    }
}
