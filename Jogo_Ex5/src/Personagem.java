public class Personagem {
    String nome;
    int pontos;
    Arma arma;

    void usarArmas(){
        System.out.println(this.nome + " usando a arma: " + this.arma.nome);
    }

    void tomarDano(){
        System.out.println(this.nome + " tem " + this.pontos);
        System.out.println(this.nome + " tomou dano e seus pontos de vida abaixaram");
    }
}
