import java.util.Scanner;

public class EstruturaCondicionalEncadeada {
  public static void main(String args[]) {
    
   Scanner teclado = new Scanner(System.in);
   
    System.out.print("Digite a Primeira Nota: ");
    Float n1 =  teclado.nextFloat();
    
    System.out.print("Digite a Segunda Nota: ");
    Float n2 =  teclado.nextFloat();
    
    Float m = (n1 + n2) / 2;
    
    System.out.println("A sua média foi: " + m);
    
   //Criando a estrutura condicional Encadeada
   
   if (m<5){
       System.out.print("Reprovado");
   }else if (m<7){
       System.out.print("Recuperação");
   }else{
       System.out.print("Aprovado");
    }
       
  }