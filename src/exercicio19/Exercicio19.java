package exercicio19;
import java.util.Scanner;
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o volume inicial em centímetros cúbicos: ");
        int volumeInicial = scanner.nextInt();
        
        int tempo = 0;
        int volumeAtual = volumeInicial;
        
        if (volumeInicial <= 0) {
            System.out.println("O volume inicial deve ser maior que zero.");
        } else {
            while (volumeAtual <= 1000) {
                volumeAtual *= 2;
                tempo++;
            }
            System.out.println("O tempo necessário para o volume se tornar maior que 1000 cm³ é de " + tempo + " segundos.");
        }
    }
}

    

