// biblioteca padrao para ajudar na entrada de dados
import java.util.Scanner;

public class SomaReais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número real: ");
      // leitura do primeiro numero
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número real: ");
      // leitura do segundo numero
        double numero2 = scanner.nextDouble();
        
        double soma = numero1 + numero2;
        // resultado
        System.out.println("A soma dos números é: " + soma);
        // boa pratica de fechar o scanner quando nao vai mais ser usado
        scanner.close();
    }
}
