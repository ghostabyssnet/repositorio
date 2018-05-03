package com.cubesouls;

public class Professor extends Funcionario {
	private final double encargos = 60;
	private int totalProfessores = 0;
	private Professor[] Professores = new Professor[totalProfessores];
	public Professor(double salario) {
		super(salario);
	}
	
	protected double despesas() {
		double despesas = 0;
		for (int x = 0; x < getProfessores().length; x++) {
			despesas += this.getProfessores()[x].getSalario() + (this.getProfessores()[x].getSalario() * this.encargos);
		}
		return despesas;
	}
	@Override
	public double getEncargos() {
		return encargos;
	}
	public Professor[] getProfessores() {
		return Professores;
	}
	public void setProfessores(Professor[] Professores) {
		this.Professores = Professores;
	}
	public void setProfessor(Professor Professor, int x) {
		this.Professores[x] = Professor;
	}

}