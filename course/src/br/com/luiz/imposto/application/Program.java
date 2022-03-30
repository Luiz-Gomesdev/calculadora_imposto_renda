package br.com.luiz.imposto.application;

import br.com.luiz.imposto.entities.PessoaFisica;
import br.com.luiz.imposto.entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica();
		
		pf.setNome("Luiz Augusto Gomes");
		pf.setCpf("795.331.090-25");
		pf.setRendaBruta(3000);
		pf.calcularImposto();
		System.out.println(pf);
		
		pf.setNome("Sandro Pimenta Santos");
		pf.setCpf("403.046.840-31");
		pf.setRendaBruta(1400);
		pf.calcularImposto();
		System.out.println(pf);
		
		pf.setNome("Pedro Castro Vieira");
		pf.setCpf("630.280.900-23");
		pf.setRendaBruta(5000);
		pf.calcularImposto();
		System.out.println(pf);
		
		
		PessoaJuridica pj = new PessoaJuridica();
		
		pj.setNome("Gomes Softwares");
		pj.setCnpj("40.923.095/0001-30");
		pj.setRendaBruta(50000);
		pj.calcularImposto();
		System.out.println(pj);
		
		pj.setNome("Boom Digital");
		pj.setCnpj("98.419.993/0001-35");
		pj.setRendaBruta(40000);
		pj.calcularImposto();
		System.out.println(pj);
		
		pj.setNome("Auto DNA");
		pj.setCnpj("86.057.280/0001-90");
		pj.setRendaBruta(30000);
		pj.calcularImposto();
		System.out.println(pj);
	}

}
