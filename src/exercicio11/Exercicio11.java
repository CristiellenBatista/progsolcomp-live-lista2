package exercicio11;

import java.util.Scanner;

public class Exercicio11{  

        public static void main(String[] args) {

            System.out.print("informe um numero: ");
            Scanner teclado = new Scanner(System.in);
        int numero = 0;
        teclado.close();



        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;

            if (numero % 7 == 0) {
                break; 
            }
        } while (true);
    }
}
