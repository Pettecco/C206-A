package org.example;

public class Sargento extends Soldado implements Defesa{

    private String especializacao;
    private int experienciaCombate;

    public Sargento(String nome, long cpf, String especializacao, int experienciaCombate) {
        super(nome, cpf);
        this.especializacao = especializacao;
        this.experienciaCombate = experienciaCombate;
    }

    @Override
    void mostraInfo() {
        super.mostraInfo();
        System.out.println("Especialização: " + this.especializacao);
        System.out.println("Experiencia de Combate: " + this.experienciaCombate);
    }

    @Override
    void usandoItem() {
        super.usandoItem();
        if(this.itemEspecial != null){
            this.experienciaCombate += 300;
        }
    }

    @Override
    public void defender() {
        if(this.experienciaCombate > 650){
            System.out.println(this.nome + " conseguiu se defender");
        } else {
            System.out.println(this.nome + " não se defendeu");
        }
    }
}
