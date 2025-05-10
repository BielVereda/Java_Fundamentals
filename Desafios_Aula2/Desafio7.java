import java.util.Scanner;

public class Exercicio07 {
  public static void main(String args[]) {
    
   Scanner teclado = new Scanner(System.in);
   
   System.out.println("..........PLACAR DE JOGO:.......... ");//Frescurinha
   
   
   // Declaração de Váriáveis e estrutura de entrada
    System.out.println("\n-----------------------------------"); //Frescurinha
    System.out.print("Qual o time 1? ");
    String nomeTime1 =  teclado.nextLine();
    
    System.out.print("Qual o placar do time 1? ");
    Integer placarTime1 =  teclado.nextInt();
    teclado.nextLine(); //Limpar o buffer para eliminar o carcter vazio deixado pelo teclado
    System.out.println("-----------------------------------");//Frescurinha
    System.out.print("Qual o time 2? ");
    String nomeTime2 =  teclado.nextLine();
    
    System.out.print("Qual o placar do time 2? ");
    Integer placarTime2 =  teclado.nextInt();
    System.out.println("----------------------------------");//Frescurinha
   
   //ESTRUTURA CONDICIONAL
   if (placarTime1>placarTime2){
       System.out.printf("Vitória do %s com o placar de %d x %d ", nomeTime1, placarTime1, placarTime2);
       
   } else if (placarTime2>placarTime1){
       System.out.printf("Vitória do %s com o placar de %d x %d ", nomeTime2, placarTime2, placarTime1);
   } else{
       System.out.printf("Empate entre  %s e %s com o placar de %d x %d ", nomeTime1, nomeTime2, placarTime1, placarTime2);
   }
   
  }
}