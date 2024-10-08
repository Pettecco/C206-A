package org.example;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    // Métodos que podemos realizar com o arquivo
    public void escrever(Aluno aluno) {
        // Instanciando os objetos que permitirão a escrita de dados
        OutputStream os = null; // fluxo de entrada
        OutputStreamWriter osw = null; //leitor de fluxo de entrada
        BufferedWriter bw = null; //buffer entrada

        // Variável auxiliar
        String linha;

        try {
            // Abrindo a saída de dados
            os = new FileOutputStream("infoAlunos.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);



            // Flag que indica onde começa as informações do Produto
            bw.write("Aluno:\n");
            bw.write(aluno.getNome() + "\n");
            bw.write(aluno.getCurso() + "\n");
            bw.write(aluno.getMatricula() + "\n");
            bw.write(aluno.getMedia() + "\n");

        } catch (Exception e) {
            System.out.println("ERRO: " + e);
        } finally {
            // Fechando a entrada de dados
            try {
                bw.close();
            } catch (Exception e) {
            }
        }
    }

    // 2. Método ler


    public ArrayList<Aluno> ler() {

        // ArrayList auxiliar para salvar funcionários encontrados no arquivo
        ArrayList<Aluno> encontreiNoArquivo = new ArrayList<>();

        // Classes que permitem leitura de dados do arquivo
        InputStream is = null; //fluxo saida
        InputStreamReader isr = null; //gerador de fluxo de saida
        BufferedReader br = null; // buffer de saida

        // Variável auxiliar que servirá de flag para o while
        String linhaLer;

        try {
            // Instanciando os objetos
            is = new FileInputStream("infoAlunos.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // Colocando o cursor no inicio do arquivo
            linhaLer = br.readLine();

            while (linhaLer != null) {
                // Comparando se o que está em linhaLer é igual a minha flag
                if (linhaLer.contains("Aluno:")) {
                    // Variável auxiliar de funcionario
                    Aluno a1 = new Aluno();
                    a1.setNome(br.readLine());
                    a1.setCurso(br.readLine());
                    a1.setMatricula(Integer.parseInt(br.readLine()));
                    a1.setMedia(Float.parseFloat(br.readLine()));

                    encontreiNoArquivo.add(a1);
                }
                linhaLer = br.readLine();
            }


        } catch (Exception e) {
        } finally {
            try {
                br.close();
            } catch (Exception e) {

            }
        }
        return encontreiNoArquivo;

    }
}