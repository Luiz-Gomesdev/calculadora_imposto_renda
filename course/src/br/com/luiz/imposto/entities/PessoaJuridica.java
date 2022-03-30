package br.com.luiz.imposto.entities;

public class PessoaJuridica extends Contribuinte {

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		return this.getRendaBruta() * 0.1;
	}

	@Override
	public String toString() {
		System.out.println();
		String s = "=== Pessoa Jurídica ===\n";
		s += super.toString(); //para chamar toString de Contribuinte
		s += "CNPJ: " + cnpj + "\n";
		s += "Valor do Imposto: R$" + String.format("%.2f", calcularImposto());

		return s;
	}

}
