package org.example;

public class Mago extends Habitante implements Cura, Feitico {

    private String cor;

    public Mago(String nome, int idade, float energia, String cor) {
        super(nome, idade, energia);
        this.cor = cor;
    }


    @Override
    public void lancaFeitico() {
        System.out.println(this.nome + " lançando feitiço!!");
    }

    @Override
    public void curar() {
        System.out.println(this.nome + " curando...");
    }

    @Override
    public void atacar() {
        System.out.println("Mago da cor " + this.cor + " atacando!");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Informações do Mago:");
        System.out.println("Id: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Energia: " + this.energia);
        System.out.println("Cor: " + this.cor);
    }
}
