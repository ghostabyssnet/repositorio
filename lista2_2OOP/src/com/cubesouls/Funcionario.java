package com.cubesouls;

public class Funcionario implements Despesas {
	private double salario;
	private final double encargos = 0.4;
	private int totalFuncionarios = 0;
	private Funcionario[] funcionarios = new Funcionario[totalFuncionarios];
	
	protected double despesas() {
		double despesas = 0;
		for (int x = 0; x < getFuncionarios().length; x++) {
			despesas += this.getFuncionarios()[x].getSalario() + (this.getFuncionarios()[x].getSalario() * this.encargos);
		}
		return despesas;
	}
	public Funcionario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getEncargos() {
		return encargos;
	}

	public int getTotalFuncionarios() {
		return totalFuncionarios;
	}

	public void setTotalFuncionarios(int totalFuncionarios) {
		this.totalFuncionarios = totalFuncionarios;
	}

	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public void setFuncionario(Funcionario funcionario, int x) {
		this.funcionarios[x] = funcionario;
	}
}
