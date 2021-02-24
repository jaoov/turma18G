import java.util.Scanner;

public class Exercicio6 {

		public static void main(String [] args) 
		{
			int d;
			int p1;
			int p2;
			
			int x1;
			int x2;
			int y2;
			int y1;
			
			Scanner ler = new Scanner (System.in);
			
			System.out.println("Escreva o valor de x1: ");
			x1 = ler.nextInt();
			System.out.println("Escreva o valor de x2: ");
			x2 = ler.nextInt();
			System.out.println("Escreva o valor de y1: ");
			y1 = ler.nextInt();
			System.out.println("Escreva o valor de y2: ");
			y2 = ler.nextInt();
			
			
			p1 = (x2 - x1)^2;
			p2	= (y2 - y1)^2;
			
			d = (int) Math.sqrt(p1 + p2);
			
			System.out.println("O valor de d é: ");
			System.out.println(d);
			
			
			
					
					
		}
}
