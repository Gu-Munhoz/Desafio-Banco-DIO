public class RodarAplicacao {

    public static void main(String[] args) {
        Cliente Gustavo = new Cliente();
        Gustavo.setNome("Gustavo");

        Conta cc = new ContaCorrente(Gustavo);
        cc.depositar(1520.98);

        Conta cp = new ContaPoupanca(Gustavo);

        cc.transferir(345, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }

}
