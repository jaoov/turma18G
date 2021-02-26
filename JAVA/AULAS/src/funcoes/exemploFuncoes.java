package funcoes;

import java.util.Scanner;

public class exemploFuncoes 
{
      public static void main(String[] args) 
      {
    	  
    	  int numero;
    	  
    	  Scanner leia = new Scanner (System.in);
    	  System.out.println("Digite um numero inteiro postivo: ");
    	  numero = leia.nextInt();
    	  parImpar(numero);
    	  
    	  pula();
      }
      
     public static void pula() 
     {
    	 System.out.println("");
     }
     
     public static void parImpar(int numero) 
     {
    	 if ((numero%2)==0) 
    	 {
    		 System.out.println("O " + numero + " é par !");
    		 pula();
    	 }
    	 else 
    	 {
    		 System.out.println("O " + numero + " é impar !");
    		 pula();
    	 }
     }
}
	