package exercicio20;
import java.util.Scanner;
public class Exercicio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a carga máxima do elevador: ");
        int cargaMaxima = scanner.nextInt();
        
        System.out.print("Digite a quantidade máxima de pessoas: ");
        int quantidadeMaxima = scanner.nextInt();
        
        int cargaAtual = 0;
        int pessoas = 0;
        
        do {
            System.out.print("Digite o peso da pessoa em kg: ");
            int peso = scanner.nextInt();
            
            if (cargaAtual + peso > cargaMaxima) {
                System.out.println("Carga máxima atingida. Não é possível adicionar mais pessoas.");
                break;
            }
            
            cargaAtual += peso;
            pessoas++;
        } while (pessoas < quantidadeMaxima && cargaAtual < cargaMaxima);
        
        System.out.println("Número de pessoas no elevador: " + pessoas);
        System.out.println("Carga atual do elevador: " + cargaAtual + " kg");
    }
}    
    

