public class Kart {
    String nome;
    Piloto piloto = null;
    Motor motor;

    public Kart(String nome, String cilindradas, float velMax) {
        this.nome = nome;
        // fazendo a composição
        this.motor = new Motor(cilindradas, velMax);
    }

    void pular(){
        System.out.println("Kart pulou!");
    }

    void soltarTurbo(){
        System.out.println("Ligando o turbo do kart... vrummm");
    }

    void fazerDrift(){
        System.out.println("Fazendo drifit com o kart...");
    }

}
