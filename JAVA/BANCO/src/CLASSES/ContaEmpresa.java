package CLASSES;

import java.util.Scanner;

public class ContaEmpresa extends Conta {
	
	Scanner leia = new Scanner(System.in);
	double valor;
		
	
	private double emprestimo;
	
	
	public ContaEmpresa(int numero, String cpf) 
	{
		super(numero);
		
	}

	
	public void ofereceEmprestimo () 
	{
	
		char opcao;
		double exibeRestante = 10000.00;
		
		System.out.println();
		System.out.println("Voc� gostaria de contratar um empr�stimo?");
		System.out.println();
		System.out.print("[S-> SIM] [N-> N�O] -> ");
		opcao = leia.next().toUpperCase().charAt(0);
		
		if(this.emprestimo >= 10000)
		{
			System.out.println();
			System.out.println("[Desculpe, mas Voc� atingiu o valor m�ximo de empr�stimo]");
		}else
				if(opcao == 'S') 
				{
					
					System.out.println();
					System.out.printf("\n[Valor m�ximo dispon�vel para empr�stimo R$: %.2f]",exibeRestante - this.emprestimo);
					System.out.print("\nDigite o valor do empr�stimo -> ");
					valor = leia.nextDouble();
					
					if(valor > 10000.00) 
					{
						System.out.println();
						System.out.print("[Desculpe, voc� n�o pode pedir um empr�sitmo acima de R$: 10000,00]");
						System.out.println();
						
					}else if(valor < 10000.00) 
					{
					
					super.credito(valor);
					
					this.emprestimo += + valor;
					
					System.out.println();
					System.out.printf("[Saldo atual R$: %.2f] \n", super.getSaldo());
					System.out.printf("[Valor resgatado do empr�stimo R$: %.2f] \n", valor);
					System.out.printf("[Valor restante para empr�stimo dispon�vel R$: %.2f] \n", (exibeRestante - this.emprestimo));
					}
				}	
		
	}

	
	@Override
	public void credito(double valor) {
		System.out.println();
		System.out.println("                    [CR�DITO]                    ");
		System.out.print("Digite o valor da transa��o -> ");
		valor = leia.nextInt();
        super.saldo += + valor;
        
        System.out.println();
		System.out.printf("[Saldo atual R$: %.2f] \n", super.getSaldo());

    }

	@Override
	public void debito(double valor)
    {
		if(super.saldo == 0) 
		{
			System.out.println("[Desculpe, mas voc� n�o pode fazer uma transa��o de d�bito com o saldo zerado.]");
		}else
		
	        if (super.saldo>=valor)
	        {
	        	System.out.println();
	        	System.out.println("                    [D�BITO]                    ");
	        	System.out.print("Digite o valor da transa��o -> ");
	    		valor = leia.nextInt();
	        	super.debito(this.getSaldo() + valor);
	        }
    }

	@Override
	public int getNumero() {
	        return numero;
	    }

	@Override
    public void setNumero(int numero) {
        this.numero = numero;
	    }

	@Override
    public String getCpf() {
        return cpf;
	    }
	
	@Override
	public void setCpf(String cpf) {
        this.cpf = cpf;
	    }
	
	
	
}


