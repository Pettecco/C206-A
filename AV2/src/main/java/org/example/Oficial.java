package org.example;

public class Oficial extends Soldado implements Defesa{

    private String patente;

    public Oficial(String nome, long cpf, String patente) {
        super(nome, cpf);
        this.patente = patente;
    }

    public Oficial(){ // construtor para chamar o construtor que mostra a quantidade de soldados totais
        super();
    }

    @Override
    void mostraInfo() {
        super.mostraInfo();
        System.out.println("Patente: " + this.patente);
    }

    @Override
    void usandoItem() {
        super.usandoItem();
    }

    @Override
    public void defender() {
        if(this.itemEspecial != null){
            System.out.println(this.nome + " conseguiu se defender");
        } else {
            System.out.println(this.nome + " não se defendeu");
        }
    }
}
