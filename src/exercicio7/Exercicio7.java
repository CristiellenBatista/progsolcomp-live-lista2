package exercicio7;

import java.util.Scanner;

public class Exercicio7 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Digite a nota do aluno (entre 0 e 100): ");
            int nota = scanner.nextInt();
    
            if (nota < 0 || nota > 100) {
                System.out.println("Nota inválida.");
            } else if (nota < 50) {
                System.out.println("Insuficiente");
            } else if (nota < 65) {
                System.out.println("Regular");
            } else if (nota < 85) {
                System.out.println("Bom");
            } else {
                System.out.println("Ótimo");
            }
        }
    }


