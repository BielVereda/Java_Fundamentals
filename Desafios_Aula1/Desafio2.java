import java.util.Scanner;

public class Desafio2{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
  
    System.out.print("Digite o dia do seu aniversário: ");
    int dia = sc.nextInt();
  
    System.out.print("Digite o mês do seu aniversário: ");
    String mes = sc.next();

    System.out.print("Digite o ano do seu nascimento: ");
    int ano = sc.nextInt();

    System.out.println("\nVocê nasceu em "+ dia +" de "+ mes +" de "+ ano +".");
  }
}