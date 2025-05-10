import java.util.Scanner;

public class Exercicio06 {
  public static void main(String args[]) {
    
   Scanner teclado = new Scanner(System.in);
   
    System.out.print("O veículo está com quantos litros? ");
    Float qtdLitros =  teclado.nextFloat();
    
    
   //Criando a estrutura condicional Encadeada
   
   if (qtdLitros<10){
       System.out.print("Está na reserva. Abasteça urgente!");
    }else if (qtdLitros<30){
        System.out.print("Está com meio tanque!");
    }else{
        System.out.print("Está com o tanque cheio ou quase cheio!");
    }
   
   teclado.close();
    
  }
}