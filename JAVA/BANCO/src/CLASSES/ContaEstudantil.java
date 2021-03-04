package CLASSES;

import java.util.Scanner;

import CLASSES.Conta;

public class ContaEstudantil extends Conta 
{
	private double limiteEstudantil;
	private double emprestimo;
	int opcao = 0;
	Scanner ler = new Scanner (System.in);
	
	public ContaEstudantil(int numero, String cpf, boolean ativa, double limiteEstudantil) {
		super(numero, cpf, ativa);
		this.limiteEstudantil = limiteEstudantil;
		this.setLimiteEstudantil(5000);
		
		this.emprestimo = emprestimo;
	}
	
	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}


	public double getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(double emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	@Override 
	public void debito(double valor) 
	{
		if(this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
		}
		else if(valor > this.getSaldo()) {
			System.out.println("   Você não possui saldo o suficiente... Deseja solicitar um");	
			System.out.println("          empréstimo estudantil no valor de R$5.000? [1] Sim / [0] Não");
			opcao = ler.nextInt();
		}	
			if(opcao == 1) {
				this.credito(getLimiteEstudantil());
			}
	
	}
}