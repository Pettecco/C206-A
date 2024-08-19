public class Computador {

    String marca;
    float preco;
    MemoriaUSB memoriaUSB;
    SistemaOperacional sistemaOperacional;
    HardwareBasico[] hardwaresBasicos = new HardwareBasico[3];

    public Computador(String marca, float preco, String nomeOS, int tipoOS) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = new SistemaOperacional(nomeOS, tipoOS);
    }

    void mostraPCConfigs(){
        System.out.println("Computador da marca: " + this.marca);
        System.out.println("Preço: R$" + this.preco);
        System.out.println("Configurações de hardware:");
        for (int i = 0; i < hardwaresBasicos.length; i++){
            System.out.println(hardwaresBasicos[i].nome + " " + hardwaresBasicos[i].capacidade);
        }
        System.out.println("Sistema Operacional: " + sistemaOperacional.nome + " " + sistemaOperacional.tipo + " bits");
        System.out.println("Acompanha " + memoriaUSB.nome + " de " + memoriaUSB.capacidade + "Gb");
    }

    void addMemoriaUSB(MemoriaUSB musb){
        this.memoriaUSB = musb;
    }
    
    void addHardwareBasico(HardwareBasico novoHardware){
        for (int i = 0; i < hardwaresBasicos.length; i++) {
            if(hardwaresBasicos[i] == null){
                hardwaresBasicos[i] = novoHardware;
                break;
            }
        }
    }

}
