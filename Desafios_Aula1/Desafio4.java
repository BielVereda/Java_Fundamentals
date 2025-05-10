import java.util.Scanner;

public class Desafio4{
  public static void main(String args[]) {
      
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Digite um número inteiro: ");
    int num = sc.nextDouble();

    System.out.println("\nAntecessor: "+ (num-1));
    System.out.println("Número: "+ num);
    System.out.println("Sucessor: "+ (num+1));

  }
}