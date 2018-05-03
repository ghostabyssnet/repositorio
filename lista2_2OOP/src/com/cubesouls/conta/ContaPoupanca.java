package com.cubesouls.conta;

public class ContaPoupanca extends Conta {
	private double taxa = super.getTaxa() * 3;
	
	protected void atualizarConta() {
		taxa = taxa * 0.1;
		this.setSaldo(this.getSaldo() - (this.getSaldo() * taxa)); 
	}
}
