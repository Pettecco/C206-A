public class Main {
    public static void main(String[] args) {

        Kart kart1 = new Kart("Kart do Mario", "150", 130);
        Kart kart2 = new Kart("Kart do Luigi", "100", 115);
        Kart kart3 = new Kart("Kart do Wario", "50", 80);

        Piloto Mario = new Piloto("Mario", false);
        Piloto Luigi = new Piloto("Luigi", false);
        Piloto Wario = new Piloto("Wario", true);

        // fazendo a agregação
        kart1.piloto = Mario;
        kart2.piloto = Luigi;
        kart3.piloto = Wario;

        kart1.piloto.superPoder();
        kart2.motor.mostraInfo();
        kart3.pular();
        kart3.soltarTurbo();
        kart3.fazerDrift();

        System.out.println("O piloto do kart 3 é: " + kart3.piloto.nome);
        System.out.println("O piloto do kart 2 é um vilão? " + kart2.piloto.vilao);
    }
}