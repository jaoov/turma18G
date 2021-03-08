package CLASSES;

public class ContaEspecial extends Conta {
	
	//*Usar o limite do saldo se no momento do movimento o saldo fica negativo, ajusta 
	//no saldo e diminuir no limite.
	
	//atributo
	private double limite;  //só pode ser usado depois do saldo
 
	 //construtor

	public ContaEspecial(int numero, double limite) {
		super(numero);
		this.limite = limite;
	}
	
//construtor - sobrecarga
	
	public ContaEspecial(int numero, String cpf, double limite) {
		super(numero, cpf);
		this.limite = limite;
	}
	
	//Construtor sobrecarga
	public ContaEspecial(int numero, String cpf, boolean ativa, double limite) {
		super(numero, cpf, ativa);
		this.limite = limite;
	}
	
	//encapsulamento 
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//metodo
	
	public void movimento() {
		System.out.println("Vamos começar a movimentação da Conta Especial!");
		System.out.println("Você tem direito a 10 movimentações sendo interrompido quando zera o limite da sua conta!");
		System.out.println();
		System.out.println("seu saldo é:" + super.getSaldo());
		System.out.println("Você tem o limite disponivel: " + this.limite);
		System.out.println("Você pode: [D-> DÉBITO] [C-> CRÉDITO]: ");
	}
	
		 
		@Override
		public double getSaldo() {
			return super.getSaldo();
		}
		
		
	/*	//override
		@Override
		public void credito(double valor) {
			this.saldo = this.saldo + valor;
		}*/
		
		@Override
		public void debito (double valor)  // só vai ter debito se tiver saldo
		{
			if (this.saldo>= valor) {
				this.saldo = this.saldo - valor;
			}
			else if  (super.getSaldo() < valor &&  valor <= (super.getSaldo() + limite))
				{
					System.out.println("/nVocê está usando o limite da conta Especial.");
					double dif = 0.00;
					dif = valor - super.getSaldo();
					
					limite = limite - dif;
					super.credito(dif);
					
					System.out.printf("Saque de R$ %.2f. \n", valor);
					System.out.printf("Saldo R$ %.2f \n", super.getSaldo());
					
				}
			
			
		}

		/*public void usarLimite (double valor) {
			
			if  (super.getSaldo() < valor &&  valor <= (super.getSaldo() + limite))
			{
				System.out.println("/nSeu saldo acabou, a partir de agora você está utilizando o limite da conta especial.");
				double dif = 0.00;
				dif = valor - super.getSaldo();
				
				limite = limite - dif;
				super.credito(dif);
				
				System.out.printf("Saque de R$ %.2f. Retire seu dinheiro abaixo! \n", valor);
				System.out.printf("Saldo R$ %.2f \n", super.getSaldo());
				
			}
			
			else if(super.getSaldo()== valor)
			{
				System.out.println("Seu saldo zerou... ");
				double zerar = 0.00;
				zerar = valor - super.getSaldo();
				super.credito(zerar);
			}
		}*/
		
}//fim
