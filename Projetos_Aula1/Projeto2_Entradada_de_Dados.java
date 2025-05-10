import java.util.Scanner;

public class Entradada_de_Dados{
  public static void main(String args[]) {
    
    Scanner teclado = new Scanner (System.in);
    
    System.out.print("Digite o seu nome: ");
    String nome = teclado.nextLine();

    System.out.print("Digite a sua nota da prova: ");
    float nota = teclado.nextFloat();
    
    System.out.print("Digite sua idade: ");
    int idade = teclado.nextInt();
    
    System.out.print("Digite um número decimal: ");
    double numeroDecimal = teclado.nextDouble();
    
    System.out.println("\nNome: "+nome);
    System.out.println("Nota: "+nota);
    System.out.println("Idade: "+idade);
    System.out.println("Decimal: "+numeroDecimal);
    
  }
}