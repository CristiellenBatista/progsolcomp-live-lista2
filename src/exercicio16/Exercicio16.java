package exercicio16;
import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args) {

   
Scanner sc = new Scanner(System.in);
int numero;

do {
    System.out.print("Digite um número (digite um número menor que 0 para sair): ");
    numero = sc.nextInt();

    if (numero < 0) {
        break; 
    }
} while (true);

System.out.println("Programa encerrado.");
}
}