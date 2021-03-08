package CLASSES;

public class ContaCorrente extends Conta {
	//construtor
    private int contadorTalao=3;

    public ContaCorrente(int numero, String cpf, int contadorTalao) 
    {
        super(numero, cpf);
        this.contadorTalao = contadorTalao;
    }
    
    public ContaCorrente(int numero, String cpf) 
    {
        super(numero, cpf);
    }
    
    //encapsulamento
    public int getContadorTalao() {
        return contadorTalao;
    }

    public void setContadorTalao(int contadorTalao) {
        this.contadorTalao = contadorTalao;
    }
    public void pedirTalao()
    {
        contadorTalao--;
        System.out.println("Talao solicitado com sucesso!!");
        System.out.printf("Voce tem %d taloes disponivel!\n",contadorTalao);
    }


    @Override
     public void debito(double valor)
        {
            if (this.saldo>=valor)
            {
                this.saldo = this.saldo - valor;
                
                /*if(0<this.saldo) 
                {
                	System.out.println("esse valor ñ pode ser sacado");
                }*/
                
                System.out.println("Saldo atual R$ "+ this.getSaldo());
                
            }else {
            	System.out.println("esse valor ñ pode ser sacado");
            	
            }


        }}
    

