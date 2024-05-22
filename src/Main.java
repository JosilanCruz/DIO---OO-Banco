public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente("Joao", "11111111111");
        Cliente maria = new Cliente("Maria", "00202020002");
        Banco banco = new Banco();
        banco.adicionarCliente(joao);
        banco.adicionarCliente(maria);
        System.out.println("Quantidade de clientes do banco: " + banco.totalDeClientes());
        ContaCorrente contaCorrente = new ContaCorrente(joao);
        ContaPoupanca contaPoupanca = new ContaPoupanca(maria);
        contaCorrente.depositar(100);
        contaCorrente.transferir(100, contaPoupanca);
        contaPoupanca.imprimirExtrato();
        contaCorrente.imprimirExtrato();
    }
}