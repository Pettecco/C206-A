package org.example;

public abstract class Soldado {

    static int qntSoldado;
    protected String nome;
    protected long cpf;
    ItemEspecial itemEspecial;

    public Soldado(String nome, long cpf) {
        qntSoldado++;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Soldado(){
        System.out.println("Quantidade de soldados: " + qntSoldado);
    }

    void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        if(this.itemEspecial != null){
            System.out.println("tipo do Item especial: " + this.itemEspecial.tipo);
        } else {
            System.out.println("não tem item especial");
        }
    }
    void usandoItem(){
        if(this.itemEspecial != null){
            System.out.println(this.nome + " utilizando item especial");
        } else {
            System.out.println(this.nome + " não tem item especial para utilizar");
        }
    }
}
