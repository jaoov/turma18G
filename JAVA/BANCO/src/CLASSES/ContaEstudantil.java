package CLASSES;

import java.util.Scanner;

import CLASSES.Conta;

public class ContaEstudantil extends Conta 
{
	private double limiteEstudantil;
	private double emprestimoCredito;
	private double emprestimoDebito;
	private double emprestimo;
	private double emprestimoFinal;
	int opcao = 0;
	
	public ContaEstudantil(int numero, String cpf, boolean ativa, double limiteEstudantil) {
		super(numero, cpf, ativa);
		this.limiteEstudantil = limiteEstudantil;
		this.setLimiteEstudantil(5000);
		
		this.emprestimoCredito = emprestimoCredito;
		this.emprestimoDebito = emprestimoDebito;
		this.emprestimo = emprestimo;
		this.emprestimoFinal = emprestimoFinal;

	}
	
	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}
	
	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	
	public double getEmprestimoCredito() {
		return emprestimoCredito;
	}

	public void setEmprestimoCredito(double emprestimoCredito) {
		this.emprestimoCredito = emprestimoCredito;
	}

	public double getEmprestimoDebito() {
		return emprestimoDebito;
	}

	public void setEmprestimoDebito(double emprestimoDebito) {
		this.emprestimoDebito = emprestimoDebito;
	}
	
	public double getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(double emprestimo) {
		this.emprestimo = emprestimo;
	}

	public double getEmprestimoFinal() {
		return emprestimoFinal;
	}

	public void setEmprestimoFinal(double emprestimoFinal) {
		this.emprestimoFinal = emprestimoFinal;
	}

	@Override
	public void debito(double valor) 
	{
		this.setEmprestimo(this.getEmprestimo() + valor );
		this.setEmprestimoFinal(this.getEmprestimo());
		this.setEmprestimoDebito(valor + this.emprestimoDebito);
		this.setLimiteEstudantil(this.getLimiteEstudantil()- valor);
		super.debito(super.getSaldo()+ this.getEmprestimo());
		
		
		System.out.println();
		
		System.out.println("Seu saldo atual é: "+this.getEmprestimoFinal());
		System.out.println("O seu limite de transação é: "+this.getLimiteEstudantil());
			
	}
	@Override
	public void credito(double valor) 
	{
		
		this.setEmprestimo(valor + this.getEmprestimo());
		this.setEmprestimoFinal(this.getEmprestimo());
		this.setEmprestimoCredito(valor + this.getEmprestimoCredito());
		this.setLimiteEstudantil(this.getLimiteEstudantil()- valor);
		super.credito(super.getSaldo()+ this.getEmprestimo());
	
		System.out.println();
		
		System.out.println("Seu saldo atual é: "+ this.getEmprestimoFinal());
		System.out.println("O seu limite de transação é: "+this.getLimiteEstudantil());
		
	}
}