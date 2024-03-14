public class Arma {
    String nome;
    int poder;
    int resistencia;
    String descricao;

    void mostraInfoArmas(){
        System.out.println("Nome da arma: " + this.nome);
        System.out.println("Poder da arma: " + this.poder);
        System.out.println("Resistencia da arma: " + this.resistencia);
        System.out.println("Descrição da arma: " + this.descricao);
    }
}
