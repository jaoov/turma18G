package atividadePOO;

import java.util.Scanner;

public class exercicio2main 
{
	public static void main(String[] args) {
		
		exercicio2 aviao = new exercicio2();
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite a cor do avi�o: ");
		aviao.cor = leia.next();
		
		System.out.println("Digite o modelo do avi�o");
		aviao.modelo = leia.next();
		
		aviao.cor();
		aviao.modelo();
		
		
	}	
}
