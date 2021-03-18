package ARRAYS;

import java.util.Scanner;

public class tarefaCalendario 
{
    public static void main(String[] args) {

        Scanner ler= new Scanner(System.in); 

       String[][]  agenda=new String [24][31];
       int dia, hora, opcao, mes, atividades=0;
       int linhas;
       int coluna;

       do {
       System.out.println("Minha agenda 2021");
       System.out.println( );

       System.out.println("Digite o número do dia [1-31]: ");
       dia=ler.nextInt();

       dia=dia-1;

       System.out.println("digite o número do mês [1-12]: ");
       mes=ler.nextInt();

       System.out.println("Digite o número da hora [0-23]: ");
       hora=ler.nextInt();

       System.out.println("Digite sua anotação: ");
       agenda[hora][dia]=ler.next();

       System.out.println("Desenja continuar? [1] - Sim / [0] - Nao");
       opcao=ler.nextInt();
       }

       while(opcao != 0);
       for(int i = 0; i < agenda.length; i++){
       for(int j = 0; j < agenda[i].length; j++){
       if (agenda[i][j] != null) {
       System.out.println("Minhas anotações: "+ (j + 1) +" as "+ (i) +"h : "+ agenda[i][j]);
       atividades++;
       }

       }
     }

       System.out.println("Voce tem "+ atividades +" nesse mês "+mes);


       }
  }