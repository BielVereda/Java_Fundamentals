import java.util.Scanner;

public class Desafio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do colaborador: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário atual do colaborador: R$ ");
        double salarioAtual = scanner.nextDouble();

        double percentualReajuste = 0.15;
        double valorReajuste = salarioAtual * percentualReajuste;
        double novoSalario = salarioAtual + valorReajuste;

        System.out.println("\n--- Reajuste Salarial ---");
        System.out.println("Colaborador: " + nome);
        System.out.printf("Salário Antigo: R$ %.2f\n", salarioAtual);
        System.out.printf("Reajuste (15%%): R$ %.2f\n", valorReajuste);
        System.out.printf("Novo Salário: R$ %.2f\n", novoSalario);

        scanner.close();
    }
}