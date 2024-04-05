import br.inatel.cdg.Cliente;
import br.inatel.cdg.Conta;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Petteco");
        cliente1.setCpf(1234567891);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Jão");
        cliente2.setCpf(1987654321);

        Cliente cliente3 = new Cliente();
        cliente2.setNome("Ryan");
        cliente2.setCpf(333222111);

        Cliente[] clientes = new Cliente[3];
        clientes[0] = cliente1;
        clientes[1] = cliente2;
        clientes[2] = cliente3;

        Conta conta = new Conta();
        conta.setClientes(clientes);
        conta.setLimite(3500.10F);
        conta.setNumero(33487);

        System.out.println("Voce possui " + conta.getSaldo());
        conta.deposita(300);
        System.out.println("Voce possui " + conta.getSaldo());
        conta.sacar(250);
        System.out.println("Voce possui " + conta.getSaldo());
        conta.sacar(500);

    }
}