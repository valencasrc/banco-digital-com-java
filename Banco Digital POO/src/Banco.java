import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<ContaBancaria> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void abrirConta(int numeroConta, String titular, double saldoInicial) {
        ContaBancaria conta = new ContaBancaria(numeroConta, titular, saldoInicial);
        contas.add(conta);
        System.out.println("Conta aberta com sucesso.");
    }

    public void depositar(int numeroConta, double valor) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                conta.depositar(valor);
                System.out.println("Depósito realizado com sucesso.");
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }

    public void sacar(int numeroConta, double valor) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                conta.sacar(valor);
                System.out.println("Saque realizado com sucesso.");
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }

    public void exibirInformacoesConta(int numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                conta.exibirInformacoes();
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }
}
