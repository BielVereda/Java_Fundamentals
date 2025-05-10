import java.util.Scanner;

public class Exercicio03 {
  public static void main(String args[]) {
    
   Scanner teclado = new Scanner(System.in);
   
    System.out.print("Digite o ano de nascimento: ");
    Integer anoNascimento =  teclado.nextInt();
    
    System.out.print("Digite o ano atual: ");
    Integer anoAtual =  teclado.nextInt();
    
    Integer idade = anoAtual - anoNascimento;
    
    System.out.printf("Você possui %d anos", idade);
    
    if (idade>=18){
        System.out.print("\nVocê é maior de idade");
    }else{
        System.out.print("\nVocê é menor de idade");
    }
    
    
  }
}