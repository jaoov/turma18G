import java.util.Scanner;

public class Exercicio4 {

		public static void main(String [] args) 
		{
			int A;
			int B;
			int C;
			int R;
			int D;
			int S;
			
			Scanner ler = new Scanner (System.in);
			
			System.out.println("Escreva o valor de A: ");
			A = ler.nextInt();
			System.out.println("Escreva o valor de B: ");
			B = ler.nextInt();
			System.out.println("Escreva o valor de C: ");
			C = ler.nextInt();
			
			//processamento;
			
			R = (A + B)^2;
			S = (B + C)^2;
			
			D = (R + S)/2;
			
			System.out.println("O valor de D é: ");
			System.out.println(D);
			
			
		}
}
