package com.cubesouls;

public class Diretor extends Funcionario {
	private final double encargos = 75;
	private int totalDiretores = 0;
	private Diretor[] Diretores = new Diretor[totalDiretores];
	
	protected double despesas() {
		double despesas = 0;
		for (int x = 0; x < getDiretores().length; x++) {
			despesas += this.getDiretores()[x].getSalario() + (this.getDiretores()[x].getSalario() * this.encargos);
		}
		return despesas;
	}
	public Diretor(double salario) {
		super(salario);
	}
	@Override
	public double getEncargos() {
		return encargos;
	}
	public Diretor[] getDiretores() {
		return Diretores;
	}
	public void setDiretores(Diretor[] Diretores) {
		this.Diretores = Diretores;
	}
	public void setDiretor(Diretor Diretor, int x) {
		this.Diretores[x] = Diretor;
	}

}