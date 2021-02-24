import java.util.Scanner;

public class Exercicio7 {

		public static void main(String [] args ) 
		{
			int a;
			int b;
			int c;
			int d;
			int e;
			int f;
			int x;
			int y;
			
			Scanner ler = new Scanner (System.in);
			
			System.out.println("De o valor de a: ");
			a = ler.nextInt();
		    System.out.println("De o valor de b: ");
			b = ler.nextInt();
			System.out.println("De o valor de c: ");
			c = ler.nextInt();
			System.out.println("De o valor de d: ");
			d = ler.nextInt();
			System.out.println("De o valor de e: ");
			e = ler.nextInt();
			System.out.println("De o valor de f: ");
			f = ler.nextInt();
			
			
			x= ((c*e) - (b*f))/ ((a*e) - (b*d));
		    y= ((a*f) - (c*d))/ ((a*e) - (b*d));
		    
		    System.out.println("O valor de x é: ");
		    System.out.println(x);
		    System.out.println("O valor de y é: ");
		    System.out.println(y);
		    


		

		

					
					
			
			
		}
}
