package exercicio3;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int a, b;
                System.out.print("Digite o primeiro número: ");
                a = sc.nextInt();
                System.out.print("Digite o segundo número: ");
                b = sc.nextInt();
                if (a % b == 0 || b % a == 0) {
                    System.out.println("São múltiplos");
                } else {
                    System.out.println("Não são múltiplos");
                }
            }
        
        }




    
    
    
    
