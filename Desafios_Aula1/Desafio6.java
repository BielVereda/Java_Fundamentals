import java.util.Scanner;

public class Desafio6{
  public static void main(String args[]) {
      
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Digite a lagura da parede: ");
    double largura = sc.nextDouble();
    
    System.out.print("Digite a altura da parede: ");
    double altura = sc.nextDouble();

    double area = largura * altura;
    double consumo = area/2;

    System.out.printf("\nÁrea total: %.2f", area);
    System.out.printf("\nConsumo: O consumo total de tinta para essa parede será de %s L por m². %.2f", consumo);
  }
}