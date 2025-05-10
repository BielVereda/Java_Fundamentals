import java.util.Scanner;

public class Exercicio04 {
  public static void main(String args[]) {
    
   Scanner teclado = new Scanner(System.in);
   
    System.out.print("Digite o primeiro número: ");
    Integer n1 =  teclado.nextInt();
    
    System.out.print("Digite o segundo número: ");
    Integer n2 =  teclado.nextInt();
    
    if (n1==n2){
        System.out.print("Os valores são iguais");
    }else{
        System.out.print("Os valores são diferentes");
    }

  }
}