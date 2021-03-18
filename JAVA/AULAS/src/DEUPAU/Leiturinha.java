package DEUPAU;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leiturinha 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		File arquivo = new File("C:\\temp\\lista.txt");
		Scanner sc = null;
			
		try 
		{
			sc = new Scanner(arquivo);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
		}
		catch (FileNotFoundException erro) 
		{
			System.out.println("Arquivo não encontrado...");	
		}
		finally 
		{
			if (sc != null) 
			{
				sc.close();
			}
		}
		
	}
}
