public class PrimeiroPrograma {
  public static void main(String args[]) {
    float nota = 8.5f;
    String nome = "Senai";
    
    // Tipos de formatação dos números:

    // Nota com a foramatação original:
    System.out.println("Sua nota é " + nota);
    
    // Nota com a foramatação para +1 casa decimal:
    System.out.printf("\nSua nota é %.2f ", nota);
    
    // Nota com a foramatação para +2 casas decimais:
    System.out.printf("\nSua nota é %.3f ", nota);
    
    // Utilizando as duas varoiáveis:
    System.out.printf(nome +", sua nota é %.2f ", nota);
    
    System.out.format("\n%s, a sua nota é %.2f ", nome, nota);
    
  }
}