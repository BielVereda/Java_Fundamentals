import java.util.Scanner;

public class Desafio6{
  public static void main(String args[]) {
      
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Digite a primeira nota do aluno: ");
    double nota1 = sc.nextDouble();
    
    System.out.print("Digite a segunda nota do aluno: ");
    double nota2 = sc.nextDouble();
    
    double media = (nota1+nota2)/2;

    System.out.printf("\nPrimeira nota: "+ nota1);
    System.out.printf("\nSegunda nota: "+ nota2);
    System.out.printf("\nMédia: %.2f"+ media);

  }
}