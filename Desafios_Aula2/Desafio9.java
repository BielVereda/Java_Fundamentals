import java.util.Scanner

public class Desafio9{
  public static void main(String args[]){
    Scanner teclado = new Scanner(System.in)
    
    System.out.println("Cálculo de IMC:");
    
    System.out.println("\nDigite o seu peso: ");
    Float peso = teclado.nextFloat();
    
    System.out.println("\nDigite o sua altura: ");
    Float altura = teclado.nextFloat();
    
    Float imc = peso/(altura*altura);
    
    System.out.println("O seu IMC é igual a: "+ imc);
    
    if (imc<18.5){
      System.out.println("Você está abaixo do peso ideal.")
    }
    
    else if (imc<24.9){
      System.out.println("Você está no peso ideal.")
    }
    
    else if (imc<29.9){
      System.out.println("Você está acima do peso ideal.")
    }
    
    else if (imc<35){
      System.out.println("Você está na faixa de obesidade.")
    }
    
    else{
      System.out.println("Você está na faixa de obesidade extrema.")
    }
  }
}
