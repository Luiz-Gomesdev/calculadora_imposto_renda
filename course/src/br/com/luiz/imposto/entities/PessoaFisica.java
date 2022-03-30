package br.com.luiz.imposto.entities;

public class PessoaFisica extends Contribuinte {

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public double calcularImposto() {

		double renda = this.getRendaBruta(); // pra n�o precisar escrever this.getRendaBruta() toda hora

		if (renda <= 1400) {
			return 0;
		} else if (renda <= 2100) {
			return renda * 0.1 - 100;
		} else if (renda <= 2800) {
			return renda * 0.15 - 270;
		} else if (renda <= 3600) {
			return renda * 0.25 - 500;
		}
		return renda * 0.30 - 700;
	}

	@Override
	public String toString() {
		System.out.println();
		String s = "=== Pessoa F�sica ===\n";
		s += super.toString(); //para chamar toString de Contribuinte
		s += "CPF: " + cpf + "\n";
		s += "Valor do Imposto: R$" + String.format("%.2f", calcularImposto());

		return s;
	}

}
