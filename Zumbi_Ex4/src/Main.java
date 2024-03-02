import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double vidaTransferida;
        boolean deuCerto;
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.nome = "Petteco";
        zumbi1.vida = 10.5;

        zumbi2.nome = "João";
        zumbi2.vida = 7.5;

        System.out.println("A vida total do " + zumbi1.nome + " é: " + zumbi1.mostraVida());
        System.out.println("A vida total do " + zumbi2.nome + " é: " + zumbi2.mostraVida());

        System.out.println("Qual a quantidade de vida que será transferida? ");
        vidaTransferida = entrada.nextDouble();
        deuCerto = zumbi1.transfereVida(zumbi2, vidaTransferida );
        System.out.println("A transferencia de vida deu: " + deuCerto);

        System.out.println("A vida total do " + zumbi1.nome + " é: " + zumbi1.mostraVida());
        System.out.println("A vida total do " + zumbi2.nome + " é: " + zumbi2.mostraVida());

        entrada.close();
    }
}