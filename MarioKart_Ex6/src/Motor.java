public class Motor {
    String cilindradas;
    float velocidadeMaxima;

    public Motor(String cilindradas, float velocidadeMaxima) {
        this.cilindradas = cilindradas;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    void mostraInfo(){
        System.out.println("O motor tem: " + this.cilindradas + " cilindradas");
        System.out.println("A velocidade máxima que o motor chega é: " + this.velocidadeMaxima);
    }
}
