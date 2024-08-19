package org.example;

public class MedicoMilitar extends Soldado implements Curar {

    private int anosExperiencia;
    private int capacidadeEmergencia;

    public MedicoMilitar(String nome, long cpf, int anosExperiencia, int capacidadeEmergencia) {
        super(nome, cpf);
        this.anosExperiencia = anosExperiencia;
        this.capacidadeEmergencia = capacidadeEmergencia;
    }

    @Override
    void mostraInfo() {
        super.mostraInfo();
        System.out.println("Anos de experiencia: " + this.anosExperiencia);
        System.out.println("Capacidade de emergencia: " + this.capacidadeEmergencia);
    }

    @Override
    void usandoItem() {
        super.usandoItem();
        if(this.itemEspecial != null){
            this.capacidadeEmergencia += 100;
        }
    }

    @Override
    public void curar() {
        if(this.capacidadeEmergencia > 920){
            System.out.println(this.nome + " conseguiu curar outro soldado");
        } else {
            System.out.println(this.nome + " não conseguiu curar outro soldado");
        }
    }
}
