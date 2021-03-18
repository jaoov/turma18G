package ARRAYS;

import java.util.Scanner;

public class tarefa3 
{
	public static void main(String[] args) 
	{
		 int matriz1[][]= new int[3][3];
		    int linha,coluna;
		    Scanner ler = new Scanner (System.in);

		    for(linha =0;linha<3;linha++) {
		        for(coluna=0;coluna<3;coluna++) {
		            System.out.println("Digite o valor: ");
		                matriz1[linha][coluna] = ler.nextInt();
		        }
		    }
		        for(linha =0;linha<3;linha++) {
		            for(coluna=0;coluna<3;coluna++) {
		                System.out.printf("["+ matriz1[linha][coluna]+ ']');

		    }
		            System.out.println("\n");


		    }


	}
}
