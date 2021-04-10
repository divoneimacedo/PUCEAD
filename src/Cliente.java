
public class Cliente {
	private String nome;
	private ContaCorrente conta;
	
	public  Cliente(String nome,int numero) {
			this.nome = nome;
			this.conta = new ContaCorrente(numero);
			this.conta.setCliente(this);
	}
	
	//retorna o nome do cliente
	public String getNome() {
		return this.nome;
	}
	
	//retornar no numero da conta
	public String getConta() {
		return conta.imprimiConta();	
	}
	
	public String opera(String tipoOperacao, double valorOperacao) {
		
		if(tipoOperacao =="deposito") {
			return  this.conta.depositaValor(valorOperacao);
		}else {
			return this.conta.retiraValor(valorOperacao);
		}
	}
	
}
