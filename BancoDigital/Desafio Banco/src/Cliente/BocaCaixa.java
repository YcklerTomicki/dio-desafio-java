package Cliente;
import CaixaEletronico.Cliente;
import CaixaEletronico.Conta;
import CaixaEletronico.ContaCorrente;
import CaixaEletronico.ContaPoupanca;
import CaixaEletronico.Banco;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BocaCaixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente Ramon = new Cliente();
        Ramon.setNome("Ramon");
        Ramon.setCpf("123.123.123-12");
        Conta cp = new ContaPoupanca(Ramon);

        Cliente Ryan = new Cliente();
        Ryan.setNome("Ryan");
        Ryan.setCpf("163.532.323-87");
        Conta cc = new ContaCorrente(Ryan);

        // Operações titular Ryan
        cc.depositar(100000.00);
        cc.sacar(20000.00);
        cc.transferir(50000.00, cp);

        // Criando banco e adicionando contas
        Banco bc = new Banco();
        bc.setNome("Javaliu");

        List<Conta> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(cp);

        bc.setContas(contas);

        // Extratos
        cc.imprimirExtrato();
        cp.imprimirExtrato();

        // Imprimindo contas do banco
        bc.imprimirContasClientes();
    }
}