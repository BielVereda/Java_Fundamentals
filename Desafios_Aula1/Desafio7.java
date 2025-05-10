import java.util.Scanner;

public class Desafio7{
  public static void main(String args[]) {
      
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Digite um valor: ");
    double num = sc.nextDouble();
    
    double mili = num/1000;
    double centi = num/100;


    System.out.printf("\nValor em milímetreos: "+ mili);
    System.out.printf("\nValor em centímetros: "+ centi);
  }
}