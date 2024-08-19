package org.example;

public class Anao extends Habitante implements Mineracao {
    private float altura;
    private String reino;

    public Anao(String nome, int idade, float energia, float altura, String reino) {
        super(nome, idade, energia);
        this.altura = altura;
        this.reino = reino;
    }

    @Override
    public void minerar() {
        System.out.println(this.nome + " mineirando...");
    }

    @Override
    public void atacar() {
        System.out.println("Anão atacando!! E O MEU MACHADO!!");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Informações do Anao:");
        System.out.println("Id: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Energia: " + this.energia);
        System.out.println("Altura: " + this.altura);
        System.out.println("Reino: " + this.reino);
    }
}
