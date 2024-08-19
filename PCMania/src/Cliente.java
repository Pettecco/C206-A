public class Cliente {

    String nome;
    long cpf;
    Computador[] computadores = new Computador[10];
    float totalCompra = 0;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    void addComputadores(Computador novoComputador){
        for (int i = 0; i < computadores.length; i++) {
            if(computadores[i] == null){
                computadores[i] = novoComputador;
                break;
            }
        }
    }

    void mostrarComputadores(){
        for (int i = 0; i < computadores.length; i++) {
            if(computadores[i] != null){
                System.out.println("Computador da marca: " + computadores[i].marca);
                System.out.println("Preço: " + computadores[i].preco);
                System.out.println("Configurações:");
                System.out.println("Sistema Operacional: " + sistemaOperacional.nome + " " + sistemaOperacional.tipo + " bits");
                for(int j = 0; j < 3; j++){
                    System.out.println(computadores[i].hardwaresBasicos[j].nome + " " + computadores[i].hardwaresBasicos[j].capacidade);
                }

            }
        }
    }

    float calculaTotalCompra(float novaCompra){
        this.totalCompra += novaCompra;
        return totalCompra;
    }

}
