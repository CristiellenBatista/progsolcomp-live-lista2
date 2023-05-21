package exercicio2;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args){

        int numA;
     
        System.out.print("informe um numero: ");
        Scanner teclado = new Scanner(System.in);
        numA = teclado.nextInt();
        
        
        int numB;
        System.out.print("informe um numero: ");
        numB = teclado.nextInt();

        int numC;
        System.out.print("informe um numero: ");
        numC = teclado.nextInt();
        teclado.close();
    if ( numA > numB && numA > numC && numB > numC){
        System.out.printf( " [%d], [%d], [%d]",numA, numB, numC );
    } else if(numB > numA && numB > numA && numA > numC){
        System.out.printf(" [%d], [%d], [%d]",numB, numA, numC);
    } else if(numC > numA && numC > numB && numA > numB){
        System.out.printf( " [%d], [%d], [%d]",numC,numA ,numB );
    }

    }
        
       
    }
    

    
    

