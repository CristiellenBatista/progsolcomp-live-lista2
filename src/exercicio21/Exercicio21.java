package exercicio21;
import java.util.Scanner;
public class Exercicio21 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número positivo: ");
        int numero = scanner.nextInt();
        
        if (numero <= 0) {
            System.out.println("O número deve ser positivo.");
        } else {
            for (int i = 1; i <= numero; i++) {
                System.out.println("Tabuada do " + i + ":");
                for (int j = 1; j <= 10; j++) {
                    int resultado = i * j;
                    System.out.println(i + " x " + j + " = " + resultado);
                }
                System.out.println();
            }
        }
    }
  
}
