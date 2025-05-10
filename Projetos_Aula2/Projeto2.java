import java.util.Scanner;

public class EstruturaCondicionalSimples {
    public static void main (String args[]) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o 1. Inteiro ? ");
        Float n1 = teclado.nextFloat();
        
        System.out.print("Digite o 2. Numero ? ");
        Float n2= teclado.nextFloat();
        
         
         if (n1>n2) {
            System.out.print(n1 + " é Maior que=   " + n2);
         } 
         
         else { 
             System.out.print(n2 + " é Maior que=   " + n1);
         } 
        
        teclado.close();
        
        
    }
}