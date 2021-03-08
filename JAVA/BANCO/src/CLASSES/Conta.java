package CLASSES;

public class Conta 
{
    // ATRIBUTOS DA CLASSE
    protected int numero;
    protected String cpf;
    protected double saldo;
    private boolean ativo;
    private double valor;

        	
    // CONSTRUTOR
    public Conta ( int numero , String cpf ) 
    {
        this.numero = numero;
        this.cpf = cpf;
    }

    // CONSTRUTOR - SOBRECARGA

    public Conta (int numero ) {

        this.numero = numero;
    }

    public Conta (int numero , String cpf , boolean  ativa ) {

        this. numero = numero;
        this.cpf= cpf;
        this.ativo = ativa;
        this.saldo= saldo;
        this.valor=valor; 
    }

    

    public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	// METODOS
    public  void  credito ( double valor ) {
        this.saldo =  this.saldo + valor;

    }

    	public  void  debito (double valor )
    {	
        if ( this.saldo >=valor)
        {
            this.saldo =  this.saldo - valor;
        }
		

    }	
  
}