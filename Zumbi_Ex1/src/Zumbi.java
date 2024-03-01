public class Zumbi {
    int vida;
    String nome;
    float altura;
    int forca;

    void iniciar(){
        vida = 100;
        nome = "Anna";
        altura = 1.40F;
        forca = 9999;
    }

    void andar(){
        System.out.println(nome + " Zumbi andando...");
    }

    void seAlimentar(){
        System.out.println("Zumbi se alimentando");

    }
}
