
public class Main {
    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.vida = 10.5;

        zumbi2.vida = 7.5;

        System.out.println("A vida total do zumbi_1 é: " + zumbi1.mostraVida());
        System.out.println("A vida total do zumbi_2 é: " + zumbi2.mostraVida());

        System.out.println("Igualando zumbi_1 ao zumbi_2");
        zumbi1 = zumbi2;

        System.out.println("A vida total do zumbi_1 é: " + zumbi1.mostraVida());
        System.out.println("A vida total do zumbi_2 é: " + zumbi2.mostraVida());

        System.out.println("Alterando a vida de zumbi_1");
        zumbi1.vida = 14;
        System.out.println("A vida total do zumbi_1 é: " + zumbi1.mostraVida());
        System.out.println("A vida total do zumbi_2 é: " + zumbi2.mostraVida());

        System.out.println("Alterando a vida de zumbi_2");
        zumbi2.vida = 12;
        System.out.println("A vida total do zumbi_1 é: " + zumbi1.mostraVida());
        System.out.println("A vida total do zumbi_2 é: " + zumbi2.mostraVida());

    }
}