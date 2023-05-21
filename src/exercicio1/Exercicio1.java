package exercicio1;

import java.util.Scanner;

public class Exercicio1  {

public static void main(String[] args){
int numbA;
numbA = teclado.nextInt();


int numB;
Scanner teclado = new Scanner(System.in);
System.out.print("informe um numero: ");
numB = teclado.nextInt();
teclado.close();

if (numbA > numB){
    System.out.println("o numero " + numbA + " e maior que o " + numB);

}else{
    System.out.println("o numero " + numbA + " e menor que o " + numB);
}

}
    
}
