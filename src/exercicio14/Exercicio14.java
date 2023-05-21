package exercicio14;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){

   System.out.print("informe um numero: ");
            Scanner teclado = new Scanner(System.in);
        teclado.close(); 
                int[] vetor = new int[50];
        
                for (int i = 0; i < vetor.length; i++) {
                    if (i % 2 == 0) {
                        vetor[i] = 0;
                    }
                }
                for (int i = 0; i < vetor.length; i++) {
                    System.out.println("Posição " + i + ": " + vetor[i]);
                }
            }
        }
    