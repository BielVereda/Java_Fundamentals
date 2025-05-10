import java.util.Scanner;

public class Exercicio02 {
  public static void main(String args[]) {
    
   Scanner teclado = new Scanner(System.in);
   
    System.out.print("Digite o valor 1: ");
    double n1 =  teclado.nextDouble();
    
    System.out.print("Digite o valor 2: ");
    double n2 =  teclado.nextDouble();
    
    if (n1>n2){
        System.out.printf("O valor 1: %.2f é maior que o valor 2: %.2f", n1, n2);
    }else{
        System.out.printf("O valor 2: %.2f é maior que o valor 1: %.2f", n2, n1);
    }
    
    
  }
}