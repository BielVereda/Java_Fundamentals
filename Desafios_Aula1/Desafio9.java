import java.util.Scanner;

public class Desafio9{
  public static void main(String args[]) {
      
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Digite o valor que você tem em dinheiro (R$ -> Real) : ");
    double bufunfa = sc.nextDouble();
    
    double conversao = bufunfa/5.69;

    System.out.printf("\nCoversão para dólar: %.2f", conversao);
  }
}