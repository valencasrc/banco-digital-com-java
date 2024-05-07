import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {

    private int numeroConta;
    private String titular;
    private double saldo;
    private List<Transacao> transacoes;

    public ContaBancaria(int numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.transacoes = new ArrayList<>();
    }

    public void depositar(double valor) {
        this.saldo += valor;
        registrarTransacao("Depósito", valor);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            registrarTransacao("Saque", valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    private void registrarTransacao(String tipo, double valor) {
        Transacao transacao = new Transacao(tipo, valor);
        transacoes.add(transacao);
    }

    public void exibirInformacoes() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }

    public int getNumeroConta() {
        return numeroConta;
    }
}
