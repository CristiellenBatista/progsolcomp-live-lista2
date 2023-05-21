package exercicio17;
import java.util.Scanner;
public class Exercicio17{ 
    public static void main(String[] args) {
        int numero = -7;System.out.print("informe um numero: ");
        Scanner teclado = new Scanner(System.in);
    teclado.close(); 

        
        do {
            if (numero % 7 == 0) {
                System.out.println(numero);
            }
            
            numero -= 7;
        } while (numero > -1000);
    }
}


    

