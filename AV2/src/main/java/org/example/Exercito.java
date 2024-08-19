package org.example;

public class Exercito {

    private String nome;
    private Soldado[] soldados = new Soldado[10];

    // ao instanciar o exercito é obrigado ter um soldado nele
    public Exercito(String nome, Soldado soldado) {
        this.nome = nome;
        this.soldados[0] = soldado;
    }

    void addSoldados(Soldado s){
        for(int i = 0; i < soldados.length; i++){
            if(soldados[i] == null){
                soldados[i] = s;
                break;
            }
        }
    }

    void mostrarInfo(){
        System.out.println("------------INFORMAÇÕES DO EXERCITO------------");
        System.out.println();
        System.out.println("Nome: " + this.nome);
        System.out.println("----- SOLDADOS ------");
        System.out.println();

        for(int i = 0; i < soldados.length; i++){
            if(soldados[i] != null){
                if(soldados[i] instanceof Sargento s){
                    s.usandoItem();
                    s.defender();
                    s.mostraInfo();
                    System.out.println("----------------");
                } else if(soldados[i] instanceof Oficial o){
                    o.usandoItem();
                    o.defender();
                    o.mostraInfo();
                    System.out.println("----------------");
                } else if(soldados[i] instanceof MedicoMilitar m){
                    m.usandoItem();
                    m.curar();
                    m.mostraInfo();
                    System.out.println("----------------");
                }
            }
        }

        Oficial oficial = new Oficial();

    }

}
