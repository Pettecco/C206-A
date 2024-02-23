import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número de lances pra primeira hora: ");
        int lanche_1 = entrada.nextInt();
        System.out.println("Digite o número de lances pra segunda hora: ");
        int lanche_2 = entrada.nextInt();
        System.out.println("Digite o número de lances pra terceira hora: ");
        int lanche_3 = entrada.nextInt();

        int total = lanche_1 + lanche_2 + lanche_3;
        float media = total/3.0f;

        System.out.println("Total de lanches foi: " + total);
        System.out.println("A media de lanches foi: " + media);

        entrada.close();
    }
}