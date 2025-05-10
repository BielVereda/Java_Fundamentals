 import java.util.Scanner;

public class EstruturaCondicionalSimples {
    public static void main (String args[]) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a 1. Nota:");
        Float n1 = teclado.nextFloat();
        
        System.out.print("Digite a segunda Nota:");
        Float n2= teclado.nextFloat();
        
        
        Float m=(n1 + n2) / 2;
        
        System.out.println("A sua média foi: " + m);
        
        //Criando a estrutura condicao Encadeada
        
        if (m<5) {
            
             System.out.println("Reprovado");
             } else  if (m<7) {
              System.out.println("Recuperaçã");
             } else {
                  System.out.print("Aprovado");
            
             }
        }
        
    
}