import java.util.Scanner;

public class Exercicio08 {
  public static void main(String args[]) {
    
   Scanner teclado = new Scanner(System.in);
   
   System.out.println("..........VERIFICAÇÃO DE CATEGORIA:.......... ");//Frescurinha
   
   
   // Declaração de Váriáveis e estrutura de entrada
   
    System.out.print("Qual a idade? ");
    Integer idade =  teclado.nextInt();
   
   
   //ESTRUTURA CONDICIONAL
   if (idade<=7){
       System.out.print("Infantil A ");
       
   } else if (idade<=11){
       System.out.print("Infantil B ");
   
   } else if (idade<=13){
       System.out.print("Juvenil A ");
   
   } else if (idade<=17){
       System.out.print("Juvenil B ");
       
   } else{
       System.out.print("Adulto ");
   }
   
  }
}