import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int npa, np3;

        System.out.println("Digite a NPA: ");
        npa = entrada.nextInt();

        if(npa >= 60){
            System.out.println("Deu bom!");
        } else {
            System.out.println("Ainda tem chance...");
            System.out.println("Digite a nota da NP3: ");
            np3 = entrada.nextInt();

            if((npa + np3)/2 >= 50){
                System.out.println("Deu bom!");
            } else {
                System.out.println("Até semestre que vem!");
            }
        }
    }
}