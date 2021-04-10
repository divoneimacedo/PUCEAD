
public class ContaCorrente {
	private int numero;
	private double saldo = 0;
	private Cliente cliente;

	public ContaCorrente(int numero) {
		this.numero = numero;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String depositaValor(double deposito) {
		String retorno = "";
		if (deposito > 0) {
			this.saldo += deposito;
		} else {
			// alerta que nao pode ser valor negativo ou 0;
			retorno = "O valor a ser depositado não pode ser negativo";
		}

		return retorno;
	}

	public String retiraValor(double saque) {
		String retorno = "";
		if (saque > 0) {
			if (saque <= this.verificaSaldo()) {
				this.saldo -= saque;
			} else {
				retorno = "Não há saldo suficiente para essa retirada";
			}
		} else {
			retorno = "O valor a ser retirado não pode ser negativo";
		}
		return retorno;
	}

	public double verificaSaldo() {
		return this.saldo;
	}

	public String imprimiConta() {
		// imprimir conta numero;
		String retorno = "Numero da conta: " + this.numero + "\n";
		retorno += "Cliente:  " + this.cliente.getNome() + "\n";
		retorno += "Saldo:  " + this.verificaSaldo() + "\n";
		return retorno;
	}

}
