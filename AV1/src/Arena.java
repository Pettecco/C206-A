public class Arena {

    String nome;
    String lugar;
    Rapper[] rappers = new Rapper[15];

    public Arena(String nome, String lugar) {
        this.nome = nome;
        this.lugar = lugar;
    }

    void addRapper(Rapper novoRapper){
        for(int i = 0; i < rappers.length; i++){
            if(rappers[i] == null){
                rappers[i] = novoRapper;
                break;
            }
        }
    }

    void mostraInfo(){
        System.out.println("Informacoes da arena: ");
        System.out.println();
        System.out.println("Nome da arena: " + this.nome);
        System.out.println("Lugar da arena: " + this.lugar);

        for (int i = 0; i < rappers.length; i++) {
            if(rappers[i] != null){
                rappers[i].mostraInfo();
            }
        }
    }

    void microfoneDou(){
        System.out.println("Rappers com micronfone dourado:");
        System.out.println();
        for (int i = 0; i < rappers.length; i++) {
            if(rappers[i] != null){
                if(rappers[i].microfone.material.equals("Dourado")){
                    System.out.println(rappers[i].nome);
                }
            }
        }
    }

    void ranking(){
        float maiorNota = 0;
        float menorNota = rappers[0].nota;
        String primeiro = "";
        String ultimo = rappers[0].nome;

        for(int i = 0; i < rappers.length; i++){
            if(rappers[i] != null){
                if (rappers[i].nota < menorNota){
                    ultimo = rappers[i].nome;
                    menorNota = rappers[i].nota;
                }
                if(rappers[i].nota > maiorNota){
                    primeiro = rappers[i].nome;
                    maiorNota = rappers[i].nota;
                }
            }
        }
        System.out.println("Rapper que ficou em primeiro lugar: " + primeiro);
        System.out.println("Rapper que ficou em ultimo lugar: " + ultimo);
    }

}
