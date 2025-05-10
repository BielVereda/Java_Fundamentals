import java.util.Scanner;

public class Desafio7{
  public static void main(String args[]) {
      
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Digite um valor: ");
    double num = sc.nextDouble();

    System.out.println("\nTabuada: ");
    System.out.printf("\n%s X 1 = %s", num, (1*num));
    System.out.printf("\n%s X 2 = %s", num, (2*num));
    System.out.printf("\n%s X 3 = %s", num, (3*num));
    System.out.printf("\n%s X 4 = %s", num, (4*num));
    System.out.printf("\n%s X 5 = %s", num, (5*num));
    System.out.printf("\n%s X 6 = %s", num, (6*num));
    System.out.printf("\n%s X 7 = %s", num, (7*num));
    System.out.printf("\n%s X 8 = %s", num, (8*num));
    System.out.printf("\n%s X 9 = %s", num, (9*num));
    System.out.printf("\n%s X 10 = %s", num, (10*num));

  }
}