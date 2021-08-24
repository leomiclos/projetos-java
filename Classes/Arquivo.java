package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

    public class Arquivo {



        private String diretorio = "/home/leonardomiclos/Área de Trabalho/Jogo";
        private String nomeArquivo = "jogo.txt";
        private String texto = "";
        private Boolean acrescentar;

        public Boolean getacrescentar() {
            return this.acrescentar;
        }

        public void setacresentar(Boolean acrescentar) {
            this.acrescentar = acrescentar;
        }

        public String getDiretorio() {
            return this.diretorio;
        }

        public void setDiretorio(String dir) {
            this.diretorio = dir;
        }

        public String getNomeArquivo() {
            return this.nomeArquivo;
        }

        public void setNomeArquivo(String n) {
            this.nomeArquivo = n;
        }

        public String getTexto() {
            return this.texto;
        }

        public void setTexto(String tex) {
            this.texto = tex;
        }

        public Arquivo() {
        }

        public String GravarArquivo() {
            File diretorio = new File(this.diretorio);
            diretorio.mkdir();
            File arquivo = new File(diretorio, this.nomeArquivo);

            try {
                arquivo.createNewFile();
                boolean acrescentar = true;
                FileWriter fw = new FileWriter(arquivo, acrescentar);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(this.texto);
                pw.flush();
                pw.close();
            } catch (IOException var6) {
                System.out.println("erro");
            }

            return "Gravado";
        }

        public List<String> LerArquivo() {
            File dir = new File(this.diretorio);
            File arq = new File(dir, this.nomeArquivo);
            ArrayList linhas = new ArrayList();

            try {
                BufferedReader br = new BufferedReader(new FileReader(arq));

                String linha;
                while((linha = br.readLine()) != null) {
                    linhas.add(linha);
                }

                br.close();
            } catch (IOException var6) {
                System.out.println("Erro no Sistema:" + var6.getMessage());
            }

            return linhas;
        }
    }

