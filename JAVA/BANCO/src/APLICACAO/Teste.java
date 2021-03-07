package APLICACAO;

import java.util.Scanner;

import CLASSES.Conta;
import CLASSES.ContaEstudantil;

public class Teste {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Conta conta = new Conta(365);
        ContaEstudantil CEE = new ContaEstudantil (369,"555.555.555-55",true,5000);
       
        double valor;
        char opcao;
        int escolhaConta;
        double movimento [] = new double [10];
        char sair;
        int contador =0;
        int numero=0;
        int ativo;
        String cpf;
    
        
        System.out.print("\n|             Seja bem vindo ao Banco Horizonte.                |");
        System.out.print("\n| Venha exergar o Horizonte de uma forma diferente com a gente! |");
        System.out.print("\n|                                                               |");
        System.out.print("\n|                 1 -> [ Conta Poupança   ]                     |");
        System.out.print("\n|                 2 -> [ Conta Corrente   ]                     |");
        System.out.print("\n|                 3 -> [ Conta Especial   ]                     |");
        System.out.print("\n|                 4 -> [ Conta Empresa    ]                     |");
        System.out.print("\n|                 5 -> [ Conta Estudantil ]                     |");
        System.out.print("\n|                 6 -> [ Sair             ]                     |");
        System.out.print("\n                   [ Digite a opção desejada ] -> ");
        
        escolhaConta = leia.nextInt();
        System.out.println();
        
        //contaPoupanca
        if (escolhaConta == 1) 
        {
        	
        }
        
        //contaCorrente
        if (escolhaConta == 2) 
        {
        	
        }
        
        //contaEspecial
        if (escolhaConta == 3) 
        {
        	
        }
                        
        //contaEmpresa
        if(escolhaConta == 4)
        {
        			
        }
        
        //contaEstudantil
        if (escolhaConta == 5) 
        {
        	System.out.println("           BEM VINDO!!         ");
    		System.out.println("  Vamos abrir sua conta estudantil?  ");
    		System.out.println();
    		System.out.println("Qual o numero da sua conta? ");
    		numero = leia.nextInt();
    		System.out.println("Qual o seu CPF? ");
    		cpf = leia.next();
    		System.out.println("Sua conta é ativa? (Digite 1) Sua conta é inativa? (Digite 2)");
    		ativo = leia.nextInt();	
    		if (ativo == 1)
    			{
    				System.out.println("Conta ativa");
    			}
    		else if (ativo == 2) 
    		{
    			System.out.println("Conta inativa");
    		}
    		else 
    		{
    			System.out.println("Você não respondeu corretamente...");
    		}
    		
			
        	do 
        	{
        		
        		System.out.println("Seu saldo é: "+ CEE.getEmprestimo());
        		System.out.println("Seu limite da transação é: "+ CEE.getLimiteEstudantil());
		    	System.out.print("\nDigite o valor da transação: ");
		    	valor = leia.nextDouble();
		    	if (valor > CEE.getLimiteEstudantil())
		    	{
		    		System.out.println("Ultrapassou o limite da transação...");
		    		break;
		    	}
				System.out.println();
				System.out.print("[D-> DÉBITO] [C-> CRÉDITO] -> ");
				opcao = leia.next().toUpperCase().charAt(0);
				
				
					if(opcao == 'D')
					{
						CEE.debito(valor);
						valor = CEE.getEmprestimoDebito();
						System.out.printf("Débito: %.2f",CEE.getEmprestimoDebito(),movimento[contador]);
						
					}
					else if(opcao == 'C')
					{
						CEE.credito(valor);
						valor = CEE.getEmprestimoCredito();
						System.out.printf("Crédito: %.2f",CEE.getEmprestimoCredito(),movimento[contador]);
					}else 
					{
						System.out.println("\nOpção invalida!");
						break;
					}
					
					contador++;
					System.out.println();
					System.out.println();
					
				if (CEE.getLimiteEstudantil() != 0) {
					
				    System.out.print("Deseja continuar fazendo as transações? [S-> SIM] [N-> NÃO] -> "); 
				    sair = leia.next().toUpperCase().charAt(0);
				}
				else 
				{
					break;
				}
        	}while(sair == 'S');
        	
        	System.out.println("------------------------------------------------------------");
        	System.out.println();
        		System.out.println("Numero da sua conta: "+numero);
        		System.out.println("Seu CPF: "+cpf);
        		System.out.println(ativo);
        		if (ativo == 1)
        		{
        			System.out.println("Conta ativa");
        		}
        		else if (ativo == 2) 
        		{
        			System.out.println("Conta inativa");
        		}
        		System.out.println("Seu saldo: R$"+ CEE.getEmprestimo());
        		System.out.println("Seu limite é: "+CEE.getLimiteEstudantil());
        		System.out.println("O emprestimo foi de: R$"+CEE.getEmprestimo());
        		System.out.println("Debito: "+CEE.getEmprestimoDebito());
        		System.out.println("Credito: "+CEE.getEmprestimoCredito());
        		
        	
        	}
        
        //sair
        if (escolhaConta == 6) 
        {
        	System.out.println("Obrigado por usar os nossos sistemas, o banco Horizonte agradece a preferência.");
        }
        
        
        
        //escolhaConta = leia.nextInt();

       /* System.out.println("Digite o valor:");
        valor = leia.nextDouble();
        System.out.println("Debito ou Credito? D/C:");
        opcao = leia.next().toUpperCase().charAt(0);
        if (opcao =='D')
        {
            conta3.debito(valor);
        }
        else if (opcao =='C') {
            conta3.credito(valor);
        } else
        {
            System.out.println("Opção invalida!!!");
        }
        System.out.println("Saldo atual: "+conta3.getSaldo());
        */
    
       
    }

}