package CaixaEletronico;

import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void imprimirContasClientes() {
        System.out.println("=== Contas do Banco " + getNome() + " ===");
        if (contas != null && !contas.isEmpty()) {
            for (Conta conta : contas) {
                String nomeCliente = conta.getCliente().getNome();
                String tipoConta = conta.getClass().getSimpleName();
                int numConta = conta.getNumeroConta();
                System.out.println("Titular: " + nomeCliente + "\nTipo de Conta: " + tipoConta + "\nConta nº: " + numConta);
            }
        } else {
            System.out.println("Nenhuma conta cadastrada.");
        }
    }
}