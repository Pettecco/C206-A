import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Arena arena = new Arena("Arena do tubarao", "ilha do tubarao");
        // variaveis para os atributos do rapper
        String nome;
        float nota;
        int idade;
        String material;

        boolean flag = true;
        int op;

        System.out.println("Bem vindo a " + arena.nome);
        System.out.println();

        while (flag){
            System.out.println("Selecione uma opcao: ");
            System.out.println("1. Adicionar um rapper a arena");
            System.out.println("2. Mostrar informacoes do rapper e da arena");
            System.out.println("3. Mostrar quais rappers tem microfone dourado");
            System.out.println("4. Mostrar primeiro e ultimo lugar");
            System.out.println("5. Sair");
            System.out.println();

            op = entrada.nextInt();
            entrada.nextLine();

            switch (op){
                case 1:
                    System.out.println("Digite o nome do rapper: ");
                    nome = entrada.nextLine();
                    System.out.println("Digite a nota do rapper: ");
                    nota = entrada.nextFloat();
                    System.out.println("Digite a idade do rapper: ");
                    idade = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Digite o material do microfone: ");
                    material = entrada.nextLine();
                    Rapper novoRapper = new Rapper(nome, nota, idade, material);
                    arena.addRapper(novoRapper);
                    break;

                case 2:
                    arena.mostraInfo();
                    break;
                case 3:
                    arena.microfoneDou();
                    break;
                case 4:
                    arena.ranking();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("opcao invalida");
            }
        }
    }
}