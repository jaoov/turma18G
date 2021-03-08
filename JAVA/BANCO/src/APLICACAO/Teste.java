package APLICACAO; 

import java.util.Scanner;

import CLASSES.Conta;
import CLASSES.ContaCorrente;
import CLASSES.ContaEmpresa;
import CLASSES.ContaEspecial;
import CLASSES.ContaEstudantil;
import CLASSES.ContaPoupanca;

public class Teste {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        ContaEmpresa CE = new ContaEmpresa(369,"455.585.741-99");
        ContaEstudantil CEE = new ContaEstudantil (369,"555.555.555-55",true,5000);
        ContaPoupanca CP = new ContaPoupanca(369,"555.555.555-55",01);
       
        double valor;
        char opcao;
        int escolhaConta;
        double movimento [] = new double [10];
        String movimento2 [] = new String [10];
        char sair;
        int contador =0;
        int numero=0;
        int ativo;
        String cpf;
    
        do 
        {
        	
        
        System.out.print("\n|             Seja bem vindo ao Banco Horizonte G2.             |");
        System.out.print("\n| Venha exergar o Horizonte de uma forma diferente com a gente! |");
        System.out.print("\n|                                                               |");
        System.out.print("\n|                 1 -> [ Conta Poupan�a   ]                     |");
        System.out.print("\n|                 2 -> [ Conta Corrente   ]                     |");
        System.out.print("\n|                 3 -> [ Conta Especial   ]                     |");
        System.out.print("\n|                 4 -> [ Conta Empresa    ]                     |");
        System.out.print("\n|                 5 -> [ Conta Estudantil ]                     |");
        System.out.print("\n|                 6 -> [ Sair             ]                     |");
        System.out.print("\n                   [ Digite a op��o desejada ] -> ");
        
        escolhaConta = leia.nextInt();
        System.out.println();
       
        
        	
       
        
        //contaPoupanca Edu
        /*if (escolhaConta == 1) 
        {
        	do {
    			for (int transacao = 0; transacao < 10; transacao++) {
    				System.out.println("Conta Poupan�a");
    				System.out.println("Digite a op��o de transa��o");
    				System.out.println("1 - Cr�dito ");
    				System.out.println("2 - D�bito ");
    				System.out.println("3 - Saldo ");
    				System.out.println("4 - Anivers�rio ");
    				System.out.println("0 - Sair");
    				int escolha = leia.nextInt();
    				double debito;
    				
    				if (escolha == 1) {
    					System.out.println("Digite o valor a se"
    							+ "r creditado");
    					double credito = leia.nextDouble();
    					CP.credito(credito);
    					CP.getSaldo();
    				} else if (escolha == 2) {
    					
						if (CP.getSaldo() <= 0.0) {
    						System.out.println("N�o � poss�vel realizar o saque!");
    					} else if (CP.getSaldo() >= debito) {
    						System.out.println("Digite o valor a ser debitado");
    						debito = leia.nextDouble();
    						CP.debito(debito);
    						
    						System.out.println(CP.getSaldo());
    					}				
    				} else if (escolha == 3) {
    					System.out.println("Saldo: R$ " + CP.getSaldo());
    				}else if(escolha == 4) {
    					System.out.println("Digite o anivers�rio da conta");
    					int aniversarioDigitado = leia.nextInt();
    					CP.setDataAniversarioConta(aniversarioDigitado);
    					if(aniversarioDigitado == CP.getDataAniversarioConta()) {
    						CP.getSaldo() = CP.getSaldo() + (CP.getSaldo() * 0.05);
    						System.out.print("\nO sistema atribuiu data de anivers�rio dia "+ aniversario[contaDigitada]+"\n\n");
    						System.out.println("Saldo atualizado\n");
    						System.out.print("Novo saldo ");
    						mostrarSaldo(saldo[contaDigitada]);
    						System.out.println();
    					}else if(aniversarioDigitado != aniversario[contaDigitada]) {
    						System.out.println("N�o houve reajuste de 0.5% no saldo");
    						System.out.print("\nO sistema atribuiu data de anivers�rio dia "+ aniversario[contaDigitada]+"\n\n");
    					}	
    				} else if (escolha == 0) {
    					System.out.println("Encerrando acesso a conta");
    					return;
    				}
    			}
    			System.out
    					.println("Voc� realizou todas as poss�veis transa��es em Conta Poupan�a, deseja continuar? (S/N)");
    			sair = leia.next().toUpperCase().charAt(0);
    		} while (sair == 'S');
    	}*/
        
        
        //contaCorrente Jessica
        if (escolhaConta == 2) 
        {
        	System.out.println("           [BEM VINDO]         ");
    		System.out.println("  Vamos abrir sua Conta Corrente?  ");
        	System.out.print("Informe o numero da conta -> ");
        	numero = leia.nextInt();
        	System.out.println();
        	
        	leia.nextLine();
        	
        	System.out.print("Informe seu CPF - > ");
        	cpf = leia.nextLine();
        	System.out.println();
        	
        	/* ================================ */
        	/*INSTANCIA DA CLASSE CONTA CORRENTE*/
        	/* ================================ */
        	
        	ContaCorrente CC1 = new ContaCorrente(numero, cpf);
        	
        	do
        	{
			     	if(contador == movimento.length - 1) {
			     		sair = 'N';
			     	}
			     	
			     	System.out.println("Numero conta: "+ CC1.getNumero());
			     	System.out.println("CPF: "+ CC1.getCpf());
			     	
			    	System.out.println(); 
			    	System.out.print("\nDigite o valor da transa��o ");
			    	valor = leia.nextDouble();
			    	
					movimento[contador] = valor;
					
					System.out.println();
					System.out.print("[D-> D�BITO] [C-> CR�DITO] -> ");
					opcao = leia.next().toUpperCase().charAt(0);
					
					if(opcao == 'D'){
						if(valor < CC1.getSaldo()) {
							CC1.debito(valor);
							
							System.out.printf("\nD�bito: %.2f",movimento[contador]);
							System.out.printf("\nsaldo atual: %.2f ",CC1.getSaldo());
							
							contador++;
							
						}else {
							System.out.println("Saldo insuficiente!");
							
						}
					
					}
					else if(opcao == 'C'){
						CC1.credito(valor);
						
						System.out.printf("\nCr�dito: %.2f",movimento[contador]);
						System.out.printf("\nsaldo atual: %.2f ",CC1.getSaldo());
						
						contador++;
						
					}else{
						System.out.println("\nOp��o invalida!");
						
					}
							
					//contador++;
					
					System.out.println();
					System.out.println();
					
					if(contador < movimento.length) {
						/*System.out.print("Deseja continuar fazendo as transa��es? [S-> SIM] [N-> N�O] -> "); 
					     *sair = leia.next().toUpperCase().charAt(0);
					    System.out.println();*/
					    
						System.out.println("Voc� gostaria de usar um cheque  de R$: 1000");
						System.out.println();
						
						System.out.println("[S-> SIM] [N-> N�O]");
						opcao = leia.next().toUpperCase().charAt(0);
					
						if(opcao == 'S'){
							CC1.pedirTalao();
							
						}else if(opcao == 'N'){
							System.out.println("OK, se mudar de ideia volte aqui!");
							
						}else{
							System.out.println("\nOp��o invalida!");
							
						}
 
					}
					
					System.out.print("Deseja continuar fazendo as transa��es? [S-> SIM] [N-> N�O] -> "); 
				    sair = leia.next().toUpperCase().charAt(0);
				    System.out.println();
				    
        	}while(sair != 'N' || ((contador + 1) == movimento.length));
        	
        	if(contador == movimento.length){
				
				System.out.println("Voc� atingiu o limite diario de transa��es.");
				System.out.println();
        	}
        	
			do{
				System.out.println("Voc� gostaria de usar um cheque  de R$: 1000");//AQUI
				System.out.println();
				
				System.out.println("[S-> SIM] [N-> N�O]");
				opcao = leia.next().toUpperCase().charAt(0);
			
				if(opcao == 'S'){
					CC1.pedirTalao();
					
				}else if(opcao == 'N'){
					System.out.println("programa finalizado!");
					opcao = 'N';
					
				}else{
					System.out.println("\nOp��o invalida!");
					
				}
				
			}while (CC1.getContadorTalao() != 0 && opcao != 'N');
        }
        
        //contaEspecial Laro
        if (escolhaConta == 3) 
        {
        	char continua;
        	
        	System.out.println(" 3 -> [ Conta Especial   ]  ");
    		System.out.println();
    		System.out.println("Vamos abrir a conta? ");
    		
    		System.out.println("Digite o n�mero da conta: ");
    		int numero1 = leia.nextInt();
    		System.out.println("Digite o cpf da conta: ");
    		String cpf1 = leia.next();
    		System.out.println("Digite 1 - conta ativa ou 2 - conta inativa: ");
    		char tipo = leia.next().charAt(0);
    		boolean ativa;
    			if(tipo == '1') {
    				ativa = true;
    			}else {
    				ativa = false;
    				
    			}

    	
    		ContaEspecial contaTeste = new ContaEspecial (numero1,cpf1,ativa,1000.00);
    		 
    		
    		
    		
    		//retorno
    		
    		contaTeste.movimento();
    		
    		
    		
    		do {
    		
    						
    			
    			System.out.println("Digite o valor: ");
    			valor = leia.nextDouble();
    		
    			System.out.println("[D-> D�BITO] [C-> CR�DITO] -> ");
    			opcao = leia.next().toUpperCase().charAt(0);
    		
    				if (opcao == 'D') {
    					contaTeste.debito(valor);
    					System.out.printf("D�bito: %.2f",valor);
    					movimento2[contador] = "Debito " + valor;
    								
    					
    				} else if (opcao == 'C') {
    					contaTeste.credito(valor);	
    					System.out.printf("Cr�dito: %.2f",valor);
    					movimento2[contador] = "Cr�dito " + valor;
    					
    				}else {
    					System.out.println("Op��o Invalida");
    					break;
    				}contador++;
    				
    			System.out.println();
    			System.out.println("Deseja continuar fazendo as transa��es? [S-> SIM] [N-> N�O] ->");
    			continua = leia.next().toUpperCase().charAt(0);
    			
    			
    			 if(contador == movimento.length)
    	    		{
    	    			System.out.println("                    [!!!!!ATEN��O!!!!!]                    ");
    	    			System.out.println("[Voc� utilizou todas as 10 transa��es disponiveis para sua conta]");
    	    			break;
    	    		}
    			}while (continua == 'S' && contador<10);
    		
    		//fim
    		
    		/*for (String movimentos : movimento) {
    			System.out.println("Os movimentos da conta especial: " + movimentos);
    		}*/
    		
    		
    		
    		System.out.println("Saldo atual da conta: " + contaTeste.getSaldo());
    		System.out.println("O valor do Limite atual: " + contaTeste.getLimite());
    		
    	}
        
    
                        
        //contaEmpresa Fabio
        if(escolhaConta == 4)
        {
        	System.out.println("           [BEM VINDO]         ");
    		System.out.println("  Vamos abrir sua Conta Empresa?  ");
    		System.out.println();
    		System.out.print("Informe o numero da sua conta -> ");
    		numero = leia.nextInt();
    		CE.setNumero(numero);
    		System.out.println("Informe o seu CPF -> ");
    		cpf = leia.next();
    		CE.setCpf(cpf);
    		
        	System.out.printf("\nSeu saldo inicial � de R$: %.2f",CE.getSaldo());
        	System.out.printf("\nCPF da conta: %s",CE.getCpf());
        	System.out.printf("\nNumero da conta: %d",CE.getNumero());
        	System.out.println();
        	do
        	{		
        		
        		
        		if(contador == movimento.length)
        		{
        			System.out.println("                    [!!!!!ATEN��O!!!!!]                    ");
        			System.out.println("[Voc� utilizou todas as 10 transa��es disponiveis para sua conta]");
        			break;
        		}
        		
        		CE.ofereceEmprestimo();
        		
        		System.out.println();
        		System.out.println("                    [TRANSA��ES]                    ");
        		System.out.println("Voc� gostaria de fazer uma transa��o de d�bito ou de cr�dito?");
        		System.out.print("\n[D-> D�BITO] [C-> CR�DITO] -> ");
				opcao = leia.next().toUpperCase().charAt(0);
				
				if(opcao == 'C') 
				{
					CE.credito(0);
					
				}
					else if(opcao == 'D') 
					{
						CE.debito(0);
					}
				
					
				
    			System.out.println();
			    System.out.print("Deseja continuar fazendo as transa��es? [S-> SIM] [N-> N�O] -> "); 
			    sair = leia.next().toUpperCase().charAt(0);
				contador++;  
					
        	}while(sair == 'S');  
        	
        	
        	CE.ofereceEmprestimo();
        
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
    		System.out.println("Sua conta � ativa? (Digite 1) Sua conta � inativa? (Digite 2)");
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
    			System.out.println("Voc� n�o respondeu corretamente...");
    			
    		}
    		
    		
        	do 
        	{
        		if (ativo == 2)
        		{
        			System.out.println("N�o fazemos opera��es com conta inativa");
        			break;
        		}
        		
        		System.out.println("Seu saldo �: "+ CEE.getEmprestimo());
        		System.out.println("Seu limite da transa��o �: "+ CEE.getLimiteEstudantil());
		    	System.out.print("\nDigite o valor da transa��o: ");
		    	valor = leia.nextDouble();
		    	if (valor > CEE.getLimiteEstudantil())
		    	{
		    		System.out.println("Ultrapassou o limite da transa��o...");
		    		break;
		    	}
				System.out.println();
				System.out.print("[D-> D�BITO] [C-> CR�DITO] -> ");
				opcao = leia.next().toUpperCase().charAt(0);
				
			
				
					if(opcao == 'D')
					{
					
						CEE.debito(valor);
						valor = CEE.getEmprestimoDebito();
						if (CEE.getEmprestimoFinal() < 0) 
						{
							break;
						}
						System.out.printf("D�bito: %.2f",CEE.getEmprestimoDebito(),movimento[contador]);
						}	
						
				
					else if(opcao == 'C')
					{
						CEE.credito(valor);
						valor = CEE.getEmprestimoCredito();
						System.out.printf("Cr�dito: %.2f",CEE.getEmprestimoCredito(),movimento[contador]);
					
					}else 
					{
						System.out.println("\nOp��o invalida!");
						break;
					}
			
		
					contador++;
					System.out.println();
					System.out.println();
			
					
				if (CEE.getLimiteEstudantil() != 0) {
					
				    System.out.print("Deseja continuar fazendo as transa��es? [S-> SIM] [N-> N�O] -> "); 
				    sair = leia.next().toUpperCase().charAt(0);
				}
				else 
				{
					break;
				}
        	}while(sair == 'S');
        	
        	System.out.println();
        	System.out.println("------------------------------------------------------------");
        	System.out.println();
        	
        	if (CEE.getEmprestimoFinal() < 0)
    		{
    			System.out.println();
    			System.out.println("Fim de programa");
    		}
        	else 
    		{
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
        		
        		System.out.println("Seu saldo: R$"+ CEE.getEmprestimoFinal());
        		System.out.println("Seu limite �: "+CEE.getLimiteEstudantil());
        		System.out.println("O emprestimo foi de: R$"+CEE.getEmprestimo());
        		System.out.println("Debito: "+CEE.getEmprestimoDebito());
        		System.out.println("Credito: "+CEE.getEmprestimoCredito());
        		}
        	
    	
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
            System.out.println("Op��o invalida!!!");
        }
        System.out.println("Saldo atual: "+conta3.getSaldo());
        */
    

        }
        }while(escolhaConta != 6);
    	System.out.println();
    	System.out.println("Obrigado por utilizar os nossos sistemas, o banco Horizonte agradece a prefer�ncia.");
   }
}