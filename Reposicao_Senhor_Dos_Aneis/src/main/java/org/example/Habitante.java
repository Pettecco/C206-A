package org.example;

public abstract class Habitante {

    private static int contador;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;
    protected Arma arma; // agregação

    public Habitante(String nome, int idade, float energia) {
        contador++;
        this.id = contador;
        this.nome = nome;
        this.idade = idade;
        this.energia = energia;
    }

    public void atacar(){}
    public void mostrarInfo(){}
}
