package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Arquivo a = new Arquivo();
        Scanner sc = new Scanner(System.in);
        int flag = 5;


        while(flag != 0){
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Ler lista de alunos");
            System.out.println("3. Quantidade de alunos por curso");
            System.out.println("0. Sair");

            flag = sc.nextInt();

            switch (flag){
                case 1:
                    sc.nextLine();
                    System.out.println("Digite o nome do aluno: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a matricula do aluno: ");
                    int matricula = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o curso do aluno: ");
                    String curso = sc.nextLine();
                    System.out.println("Digite a media: ");
                    float media = sc.nextFloat();
                    Aluno a1 = new Aluno(nome, matricula, curso, media);
                    a.escrever(a1);
                    break;
                case 2:
                    ArrayList<Aluno> alunos = a.ler();
                    for(int i = 0; i < alunos.size(); i++){
                        System.out.println("Nome: " + alunos.get(i).getNome());
                        System.out.println("Matricula: " + alunos.get(i).getMatricula());
                        System.out.println("Curso: " + alunos.get(i).getCurso());
                        System.out.println("Media: " + alunos.get(i).getMedia());
                    }
                    break;
                case 3:
                    ArrayList<Aluno> alunos1 = a.ler();
                    int comp = 0;
                    int soft = 0;
                    int tele = 0;

                    for(int i = 0; i < alunos1.size(); i++){
                        if(alunos1.get(i).getCurso().equals("computação")){
                            comp++;
                        } else if(alunos1.get(i).getCurso().equals("software")){
                            soft++;
                        } else if(alunos1.get(i).getCurso().equals("telecomunicações")){
                            tele++;
                        }
                    }

                    System.out.println("Alunos matriculados no curso de computação: " + comp);
                    System.out.println("Alunos matriculados no curso de software: " + soft);
                    System.out.println("Alunos matriculados no curso de telecomunicações: " + tele);

                    break;
                case 0:
                    break;
            }

        }

    }
}