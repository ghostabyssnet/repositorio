package com.cubesouls.conta;

public class ContaCorrente extends Conta {
	
	private double taxa = super.getTaxa() * 2;
	
	protected void atualizarConta() {
		taxa = taxa * 0.1;
		System.out.println("taxona " + taxa);
		this.setSaldo(this.getSaldo() - (this.getSaldo() * taxa)); 
	}
	
	public void depositar(double valor) {
		this.atualizarConta();
		this.setSaldo((this.getSaldo() + valor) - 0.10);
	}
}
