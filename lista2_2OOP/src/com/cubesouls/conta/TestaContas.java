package com.cubesouls.conta;

public class TestaContas {
	public void testarContas() {
		Conta conta = new Conta();
		conta.setSaldo(102.10);
		conta.setTaxa(10.0);
		System.out.println("Conta criada com " + conta.getSaldo() + " de saldo e "
				+ conta.getTaxa() + " de taxa\nCriada com sucesso.");
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(504.35);
		contaCorrente.setTaxa(30);
		System.out.println("Conta corrente com " + contaCorrente.getSaldo() + " de saldo e "
				+ contaCorrente.getTaxa() + " de taxa\nCriada com sucesso.");
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(300.0);
		contaPoupanca.setTaxa(25.2);
		System.out.println("Conta poupanca com " + contaPoupanca.getSaldo() + " de saldo e "
				+ contaPoupanca.getTaxa() + " de taxa\nCriada com sucesso.");
		conta.sacar(20.0);
		contaCorrente.sacar(20.0);
		contaPoupanca.sacar(20.0);
		System.out.println("Saque de 20.0 em cada conta");
		System.out.println("Conta agora possui " + conta.getSaldo() + " de saldo");
		System.out.println("ContaCorrente agora possui " + contaCorrente.getSaldo() + " de saldo");
		System.out.println("ContaPoupanca agora possui " + contaPoupanca.getSaldo() + " de saldo");
	}
}
