package exercicio15;
import java.util.Scanner;
public class Exercicio15{ 

        public static void main(String[] args) {
            int[][] matriz = new int[10][10];
            System.out.print("informe um numero: ");
            Scanner teclado = new Scanner(System.in);
        teclado.close(); 
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = 0;
                }
            }
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }   

