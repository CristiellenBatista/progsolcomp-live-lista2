package exercicio05;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Digite o sobrenome: ");
        String sobrenome = sc.nextLine();
        
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        sc.nextLine(); // Consome a quebra de linha deixada pelo nextInt()
        
        System.out.print("Digite a naturalidade: ");
        String naturalidade = sc.nextLine();
        
        System.out.print("Deseja visualizar dados completos? (S/N): ");
        char opcao = sc.nextLine().toUpperCase().charAt(0); // Lê o primeiro caractere digitado e converte para maiúsculas
        
        if (opcao == 'S') {
            System.out.println("Nome completo: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Naturalidade: " + naturalidade);
        } else if (opcao == 'N') {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade + " anos");
        } else {
            System.out.println("Digitação errada. Tente Novamente");
        }
        
        sc.close();
    }

        
        
        }
        
    

