package org.example;

public class Arma {

    private String nomeArma;
    private boolean magica;

    public Arma(String nomeArma, boolean magica) {
        this.nomeArma = nomeArma;
        this.magica = magica;
    }

    public String getNomeArma() {
        return nomeArma;
    }

    public boolean isMagica() {
        return magica;
    }
}
