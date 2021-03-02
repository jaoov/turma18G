package atividadePOO;

import java.util.Scanner;

public class exercicio2main 
{
	public static void main(String[] args) {
		
		exercicio2 aviao = new exercicio2();
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite a cor do avião: ");
		aviao.cor = leia.next();
		
		System.out.println("Digite o modelo do avião");
		aviao.modelo = leia.next();
		
		aviao.cor();
		aviao.modelo();
		
		
	}	
}
