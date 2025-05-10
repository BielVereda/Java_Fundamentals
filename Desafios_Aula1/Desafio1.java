import java.util.Scanner;

public class Desafio1 {
  public static void main(String args[]) {
   
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite o deu nome: ");
    String nome = sc.nextLine();
    System.out.println("\nOlá, " + nome + ", seja bem-vindo!");
  }
}