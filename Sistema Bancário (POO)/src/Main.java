public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("João", "12345678900");
        Cliente cliente2 = new Cliente("José", "98765432100");

        Conta conta1 = new Conta(1001, cliente1);
        Conta conta2 = new Conta(1002, cliente2);

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        conta1.depositar(500);
        conta1.sacar(200);
        conta1.transferir(100, conta2);

        System.out.println("Titular da conta 1: " + conta1.getTitular().getNome());
        System.out.println("CPF: " + conta1.getTitular().getCpf());
        System.out.println("Saldo: " + conta1.getSaldo());
        System.out.println();
        System.out.println("Titular da conta 2: " + conta2.getTitular().getNome());
        System.out.println("CPF: " + conta2.getTitular().getCpf());
        System.out.println("Saldo: " + conta2.getSaldo());
    }
    
}
