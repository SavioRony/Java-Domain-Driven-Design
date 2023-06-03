package br.com.alura.escola.dominio.aluno;

public class QuantidadeMaximaTelefone extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public QuantidadeMaximaTelefone() {
		super("Aluno ja possui a quantidade maxima de telefones!");
	}

}
