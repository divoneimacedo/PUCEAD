import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
	private String nome;
	private ArrayList<Cliente> clientes;
	private static Scanner ler = new Scanner(System.in);

	public Banco(String banco) {
		this.nome = banco;
		// inicializando o arrayList
		clientes = new ArrayList<Cliente>();
	}

	public static void main(String[] args) {
		// estanciando classe Banco

		Banco banco = new Banco("Banco PUCEAD POO AAP1");
		String dadosConta;

		// adicionando cliente Maria
		banco.clientes.add(new Cliente("Maria", 123));

		// adicionando cliente Jose
		banco.clientes.add(new Cliente("Jose", 1234));

		// adicionando cliente Joao
		banco.clientes.add(new Cliente("Joao", 1234));

		System.out.println("*** Banco " + banco.nome + " - OPERACOES ***");

		// Operacoes com os Clientes

		for (Cliente cliente : banco.clientes) {
			banco.Operacoes(cliente);
		}
		System.out.println("");
		System.out.println("*** Banco " + banco.nome + " - CLIENTES ***");
		//imprime os dados das contas
		for (Cliente cliente : banco.clientes) {
			dadosConta = cliente.getConta();
			System.out.println(dadosConta);
		}

	}

	public void Operacoes(Cliente cliente) {

		double valorDeposito;
		double valorSaque;

		String retornoOperacoes;
		System.out.println("Cliente " + cliente.getNome() + " - OPERACOES");
		System.out.print("** Entre com o valor do depósito: R$ ");
		valorDeposito = this.ler.nextDouble();
		this.ler.reset();
		retornoOperacoes = cliente.opera("deposito", valorDeposito);
		if (retornoOperacoes.length() > 0) {
			System.out.println("Falha ao depositar falha: " + retornoOperacoes);
		}

		System.out.print("** Entre com o valor do saque: R$ ");
		valorSaque = this.ler.nextDouble();
		this.ler.reset();
		retornoOperacoes = cliente.opera("saque", valorSaque);

		if (retornoOperacoes.length() > 0) {
			System.out.println("Falha ao efetuar o saque falha: " + retornoOperacoes);
		}
		// this.ler.close();
	}

}
