import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o número de alunos matriculados: ");
        int alunos_matriculados = entrada.nextInt();

        switch (alunos_matriculados){

            case 10, 20:
                System.out.println("Poderá ser utilizada a sala I-16.");
                break;
            case 30:
                System.out.println("Poderá ser utilizada a sala I-22");
                break;
            default:
                System.out.println("Verificar salas disponiveis no CRA!");
        }

        entrada.close();
    }
}