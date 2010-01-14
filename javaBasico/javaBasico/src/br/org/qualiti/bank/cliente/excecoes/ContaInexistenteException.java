package br.org.qualiti.bank.cliente.excecoes;

public class ContaInexistenteException extends Exception {

	private static final long serialVersionUID = -8286384506915027204L;

	public ContaInexistenteException() {
		super("Conta inexistente");
	}
}
