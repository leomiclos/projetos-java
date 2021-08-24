
package Classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Login {
    private int id;
    private Jogador jogador;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Jogador getJogador() {
        return this.jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Login() {
    }

    public boolean ValidarUsuario(Jogador login) throws IOException {
        Arquivo a = new Arquivo();
        a.setNomeArquivo("Jogador.TXT");
        new ArrayList();
        List<String> lista_usuario = a.LerArquivo();
        Iterator var5 = lista_usuario.iterator();

        String[] vet_campos;
        do {
            if (!var5.hasNext()) {
                return false;
            }

            String linha_da_lista = (String)var5.next();
            vet_campos = linha_da_lista.split(";");
        } while(!login.getUsuario().equals(vet_campos[2]) || !login.getSenha().equals(vet_campos[3]));

        return true;
    }
}
