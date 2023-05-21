package exercicio13;

import java.util.Scanner;

public class Exercicio13 {

        public static void main(String[] args) {
            int numero = 1;
            int soma = 0;
            System.out.print("informe um numero: ");
            Scanner teclado = new Scanner(System.in);
        teclado.close();
            while (numero <= 100) {
                soma += numero;
                numero++;
    
                if (numero > 100) {
                    break; 
                }
            }
    
            System.out.println("A soma dos números de 1 a 100 é: " + soma);
        }
    }   
    

