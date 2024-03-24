import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // instanciando um novo cliente
        Cliente cliente1 = new Cliente("Petterson", 1233455678);

        // instanciando os computadores
        Computador computador1 = new Computador(
                "Positivo",
                3300,
                "Linux Ubuntu",
                32
        );
        Computador computador2 = new Computador(
                    "Acer",
                    8800,
                    "Windows 8",
                    64
        );
        Computador computador3 = new Computador(
                    "Vaio",
                    4800,
                    "Windows 10",
                    64
        );

        HardwareBasico hardwareBasicoComp1Processador = new HardwareBasico("Pentium Core i3", 2200);
        HardwareBasico hardwareBasicoComp1Memoria = new HardwareBasico("Memoria RAM", 8);
        HardwareBasico hardwareBasicoComp1HD = new HardwareBasico("HD", 500);

        HardwareBasico hardwareBasicoComp2Processador = new HardwareBasico("Pentium Core i5", 3370);
        HardwareBasico hardwareBasicoComp2Memoria = new HardwareBasico("Memoria RAM", 16);
        HardwareBasico hardwareBasicoComp2HD = new HardwareBasico("HD", 1000);

        HardwareBasico hardwareBasicoComp3Processador = new HardwareBasico("Pentium Core i7", 4500);
        HardwareBasico hardwareBasicoComp3Memoria = new HardwareBasico("Memoria RAM", 32);
        HardwareBasico hardwareBasicoComp3HD = new HardwareBasico("HD", 2000);

        computador1.addHardwareBasico(hardwareBasicoComp1Processador);
        computador1.addHardwareBasico(hardwareBasicoComp1Memoria);
        computador1.addHardwareBasico(hardwareBasicoComp1HD);

        computador2.addHardwareBasico(hardwareBasicoComp2Processador);
        computador2.addHardwareBasico(hardwareBasicoComp2Memoria);
        computador2.addHardwareBasico(hardwareBasicoComp2HD);

        computador3.addHardwareBasico(hardwareBasicoComp3Processador);
        computador3.addHardwareBasico(hardwareBasicoComp3Memoria);
        computador3.addHardwareBasico(hardwareBasicoComp3HD);

        MemoriaUSB musb1 = new MemoriaUSB("Pen-Drive", 16);
        MemoriaUSB musb2 = new MemoriaUSB("Pen-Drive", 32);
        MemoriaUSB musb3 = new MemoriaUSB("HD Externo", 1000);

        computador1.addMemoriaUSB(musb1);
        computador2.addMemoriaUSB(musb2);
        computador3.addMemoriaUSB(musb3);

        Scanner entrada = new Scanner(System.in);
        boolean flag = true;
        int op;

        System.out.println("+++++++++ BEM-VINDO A PC MANIA +++++++++");

        while(flag){

            System.out.println();
            System.out.println("Selecione 1, 2 ou 3 para escolher um computador:");
            System.out.println("Digite 0 para sair");
            System.out.println();
            System.out.println("----- Promoção 1 -----");
            computador1.mostraPCConfigs();
            System.out.println();
            System.out.println("----- Promoção 2 -----");
            computador2.mostraPCConfigs();
            System.out.println();
            System.out.println("----- Promoção 3 -----");
            computador3.mostraPCConfigs();
            op = entrada.nextInt();

            switch (op){

                case 1:
                    cliente1.addComputadores(computador1);
                    cliente1.calculaTotalCompra(computador1.preco);
                    break;
                case 2:
                    cliente1.addComputadores(computador2);
                    cliente1.calculaTotalCompra(computador2.preco);
                    break;

                case 3:
                    cliente1.addComputadores(computador3);
                    cliente1.calculaTotalCompra(computador3.preco);
                    break;

                case 0:
                    flag = false;
                    break;
            }
        }

        System.out.println("+++++++++ Informações do cliente +++++++++");
        System.out.println();
        System.out.println("Nome: " + cliente1.nome);
        System.out.println("CPF: " + cliente1.cpf);
        System.out.println();
        System.out.println("+++++++++ Carrinho de compras +++++++++");
        System.out.println("Computadores no carrinho: ");
        System.out.println();
        cliente1.mostrarComputadores();
        System.out.println();
        System.out.println("Preço total da compra: R$" + cliente1.totalCompra);
    }
}