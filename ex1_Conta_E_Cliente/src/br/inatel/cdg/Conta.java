package br.inatel.cdg;

public class Conta {

    private int numero;
    private float saldo;
    private float limite;
    private Cliente[] clientes;


    public Conta(){
        setClientes(new Cliente[3]);
    }

    public void deposita(float dinheiro){
        this.saldo += dinheiro;
    }

    public void sacar(float dinheiro){
        if(this.saldo >= dinheiro){
            this.saldo -= dinheiro;
            System.out.println("Você sacou " + dinheiro);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
}
