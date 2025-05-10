import java.util.Scanner;

public class Desafio6{
  public static void main(String args[]) {
      
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Digite o nome do produto que será comprado: ");
    String nome = sc.next();
    
    System.out.print("Digite o valor dele: ");
    double num = sc.nextDouble();
    
    double desconto = num*(5/100);
    double valor = num-desconto;

    System.out.printf("\nValor do desconto: "+ desconto);
    System.out.printf("\nValor a ser pago: "+ valor);

  }
}