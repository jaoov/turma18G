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
		System.out.println("Você gostaria de contratar um empréstimo?");
		System.out.println();
		System.out.print("[S-> SIM] [N-> NÃO] -> ");
		opcao = leia.next().toUpperCase().charAt(0);
		
		if(this.emprestimo >= 10000)
		{
			System.out.println();
			System.out.println("[Desculpe, mas Você atingiu o valor máximo de empréstimo]");
		}else
				if(opcao == 'S') 
				{
					
					System.out.println();
					System.out.printf("\n[Valor máximo disponível para empréstimo R$: %.2f]",exibeRestante - this.emprestimo);
					System.out.print("\nDigite o valor do empréstimo -> ");
					valor = leia.nextDouble();
					
					if(valor > 10000.00) 
					{
						System.out.println();
						System.out.print("[Desculpe, você não pode pedir um emprésitmo acima de R$: 10000,00]");
						System.out.println();
						
					}else if(valor < 10000.00) 
					{
					
					super.credito(valor);
					
					this.emprestimo += + valor;
					
					System.out.println();
					System.out.printf("[Saldo atual R$: %.2f] \n", super.getSaldo());
					System.out.printf("[Valor resgatado do empréstimo R$: %.2f] \n", valor);
					System.out.printf("[Valor restante para empréstimo disponível R$: %.2f] \n", (exibeRestante - this.emprestimo));
					}
				}	
		
	}

	
	@Override
	public void credito(double valor) {
		System.out.println();
		System.out.println("                    [CRÉDITO]                    ");
		System.out.print("Digite o valor da transação -> ");
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
			System.out.println("[Desculpe, mas você não pode fazer uma transação de débito com o saldo zerado.]");
		}else
		
	        if (super.saldo>=valor)
	        {
	        	System.out.println();
	        	System.out.println("                    [DÉBITO]                    ");
	        	System.out.print("Digite o valor da transação -> ");
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


