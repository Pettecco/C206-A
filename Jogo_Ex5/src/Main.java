public class Main {
    public static void main(String[] args) {

        Personagem personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();

        personagem1.nome = "Anakin Skywalker";
        personagem2.nome = "Obi-Wan Kenobi";
        personagem1.pontos = 10;
        personagem2.pontos = 20;

        Arma arma1 = new Arma();
        Arma arma2 = new Arma();

        arma1.nome = "Sabre de luz";
        arma2.nome = "Sabre de luz";
        arma1.poder = 30;
        arma2.poder = 30;
        arma1.resistencia = 5;
        arma2.resistencia = 5;
        arma1.descricao = "Sabre de luz azul";
        arma2.descricao = "Sabre de luz verde";
        personagem1.arma = arma1;
        personagem2.arma = arma2;

        personagem1.arma.mostraInfoArmas();
        personagem2.arma.mostraInfoArmas();
        personagem1.tomarDano();
        personagem2.usarArmas();
    }
}