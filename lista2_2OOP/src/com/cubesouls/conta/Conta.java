package com.cubesouls.conta;

public class Conta {
	private double saldo;
	private double taxa;
	
	protected void atualizarConta() {
		this.taxa = this.taxa * 0.10;
		System.out.println(this.getTaxa());
		this.setSaldo(this.getSaldo() - (this.getSaldo() * this.taxa));
		System.out.println("atualizar " + this.getSaldo());
	}
	
	public void sacar(double valor) {
		System.out.println("sacar1 " + this.getSaldo());
		this.atualizarConta();
		System.out.println("sacar2 " + this.getSaldo());
		this.setSaldo(this.getSaldo() - valor);
		System.out.println("sacar3 " + this.getSaldo());
	}
	
	public void depositar(double valor) {
		this.atualizarConta();
		this.setSaldo(this.getSaldo() + valor);
	}
	
	public double getTaxa() {
		return this.taxa;
	}
	
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
