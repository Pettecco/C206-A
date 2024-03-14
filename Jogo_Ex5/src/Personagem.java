public class Personagem {
    String nome;
    int pontos;
    Arma arma;

    void usarArmas(){
        System.out.println(this.nome + " usando a arma: " + this.arma.nome);
        if(arma.resistencia > 2){
            this.arma.resistencia = arma.resistencia - 2;
        } else {
            this.arma.resistencia = 0;
        }
        System.out.println(this.nome + " usou a arma: " + this.arma.nome + "e agora ela tem a resistencia: " + arma.resistencia);
    }

    void tomarDano(){
        System.out.println(this.nome + " tem isso de vida: " + this.pontos);
        System.out.println(this.nome + " tomou dano e seus pontos de vida abaixaram");
        if(pontos > 5){
            this.pontos = pontos - 5;
        } else {
            this.pontos = 0;
        }
        System.out.println(this.nome + " tem isso de vida: " + this.pontos);
    }
}
