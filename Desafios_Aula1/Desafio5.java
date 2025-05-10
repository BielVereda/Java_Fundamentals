import java.util.Scanner;

public class Desafio5{
  public static void main(String args[]) {
      
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Digite um número inteiro: ");
    int num = sc.nextDouble();

    System.out.println("\nDobro do número: "+ (num*2));
    System.out.println("Triplo do número: "+ (num*3));

  }
}