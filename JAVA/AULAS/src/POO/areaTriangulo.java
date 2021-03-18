package POO;

import java.util.Scanner;

public class areaTriangulo 
{
	public static void main(String[] args) 
	{
		int base1, base2, base3;
		int altura1, altura2, altura3;
		int area1, area2, area3;
		int maior;
		Scanner leia = new Scanner(System.in);
		triangulo t3 = new triangulo ();
		
		System.out.println("Digite a base do primeiro triangulo: ");
		base1 = leia.nextInt();
		System.out.println("Digite a altura do primeiro triangulo: ");
		altura1 = leia.nextInt();
		System.out.println();
		System.out.println("Digite a base do segundo triangulo: ");
		base2 = leia.nextInt();
		System.out.println("Digite a altura do segundo triangulo: ");
		altura2 = leia.nextInt();
		System.out.println();
		System.out.println("Digite a base do terceiro triangulo: ");
		base3 = leia.nextInt();
		System.out.println("Digite a altura do terceiro triangulo: ");
		altura3 = leia.nextInt();
		
		//System.out.println("Base do terceiro triangulo");
		//t3.base = leia.nextDouble();
		
		
		area1 = (base1*altura1)*(base1*altura1);
		area2 = (base2*altura2)*(base2*altura2);
		area3 = (base3*altura3)*(base3*altura3);
		
		
		System.out.println("Primeiro triangulo: Base: "+ base1 +" Altura: "+altura1+" Area: "+area1);
		System.out.println();
		System.out.println("Segundo triangulo: Base: "+ base2 +" Altura: "+altura2+" Area: "+area2);
		System.out.println();
		System.out.println("Terceiro triangulo: Base: "+ base3 +" Altura: "+altura3+" Area: "+area3);
		System.out.println();
	
			if (area1 > area2 && area1 > area3)
			{
				System.out.println("A maior area é do primeiro triangulo: "+area1);
			}
			else if (area2 > area1 && area2 > area3) 
			{
				System.out.println("A maior area é do segundo triangulo: "+area2);
			}
			else if (area3 > area1 && area3 > area2) 
			{
				System.out.println("A maior area é do terceiro triangulo: "+area3);
			}
			else 
			{
				System.out.println("Areas iguais! ");
			}
	}
}
