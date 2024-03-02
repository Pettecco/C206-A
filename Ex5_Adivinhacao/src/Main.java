import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int numAdivinhado;
        int numGerado = rand.nextInt(10) + 1;

        do {
            System.out.println("Qual o número estou pensando?");
            numAdivinhado = entrada.nextInt();

            if(numAdivinhado != numGerado){
                System.out.println("Errooou!");
            }
        } while (numGerado != numAdivinhado);

        System.out.println("Parabéns! Voce acertou o numero!");
        entrada.close();
    }
}