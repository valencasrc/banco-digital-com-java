public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.abrirConta(123456, "Lucas", 1000.0);
        banco.depositar(123456, 500.0);
        banco.sacar(123456, 200.0);
        banco.exibirInformacoesConta(123456);
    }
}
