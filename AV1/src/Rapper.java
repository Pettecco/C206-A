public class Rapper {

    String nome;
    float nota;
    int idade;
    Microfone microfone;

    public Rapper(String nome, float nota, int idade, String material) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
        this.microfone = new Microfone(material);
    }

    void mostraInfo(){
        System.out.println("----------------------");
        System.out.println("Informações do rapper:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Nota: " + this.nota);
        System.out.println("Idade: " + this.idade);
        System.out.println("Microfone: " + this.microfone.material);
        System.out.println();
    }

}
