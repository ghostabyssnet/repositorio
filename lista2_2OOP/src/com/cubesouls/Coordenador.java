package com.cubesouls;

public class Coordenador extends Funcionario {
	private final double encargos = 65;
	private int totalCoordenadores = 0;
	private Coordenador[] coordenadores = new Coordenador[totalCoordenadores];
	
	protected double despesas() {
		double despesas = 0;
		for (int x = 0; x < getCoordenadores().length; x++) {
			despesas += this.getCoordenadores()[x].getSalario() + (this.getCoordenadores()[x].getSalario() * this.encargos);
		}
		return despesas;
	}
	public Coordenador(double salario) {
		super(salario);
	}
	@Override
	public double getEncargos() {
		return encargos;
	}
	public Coordenador[] getCoordenadores() {
		return coordenadores;
	}
	public void setCoordenadores(Coordenador[] coordenadores) {
		this.coordenadores = coordenadores;
	}
	public void setCoordenador(Coordenador coordenador, int x) {
		this.coordenadores[x] = coordenador;
	}

}
