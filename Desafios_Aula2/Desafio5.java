import java.util.Scanner;

public class Exercicio05 {
  public static void main(String args[]) {
    
   Scanner teclado = new Scanner(System.in);
   
    System.out.print("Digite um número inteiro: ");
    Integer num =  teclado.nextInt();
    
    if (num % 2 == 0){
        System.out.print("O valor digitado é par");
    }else{
        System.out.print("O valor digitado é impar");
    }
    
    

  }
}