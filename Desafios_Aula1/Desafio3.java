import java.util.Scanner;

public class Desafio3{
  public static void main(String args[]) {
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Digite o primeiro número: ");
    double num1 = sc.nextDouble();
    System.out.print("Digite o segundo número: ");
    double num2 = sc.nextDouble();
    double soma = num1 + num2;

    System.out.println(num1 +" + " + num2 +" = "+ soma);
  }
}