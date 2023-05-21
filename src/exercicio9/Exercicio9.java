package exercicio9;

import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args){  

    
                Scanner scanner = new Scanner(System.in);
        
                System.out.print("Digite o valor da venda: ");
                double valorVenda = scanner.nextDouble();
        
                System.out.println("Selecione a condição de pagamento:");
                System.out.println("1 - Venda à vista");
                System.out.println("2 - Venda a prazo 30 dias");
                System.out.println("3 - Venda a prazo 60 dias");
                System.out.println("4 - Venda a prazo 90 dias");
                System.out.println("5 - Venda com cartão de débito");
                System.out.println("6 - Venda com cartão de crédito");
        
                System.out.print("Opção: ");
                int opcao = scanner.nextInt();
        
                double totalVenda = 0;
        
                switch (opcao) {
                    case 1:
                        totalVenda = valorVenda * 0.9;
                        break;
                    case 2:
                        totalVenda = valorVenda * 0.95;
                        break;
                    case 3:
                        totalVenda = valorVenda;
                        break;
                    case 4:
                        totalVenda = valorVenda * 1.05;
                        break;
                    case 5:
                        totalVenda = valorVenda * 0.92;
                        break;
                    case 6:
                        totalVenda = valorVenda * 0.93;
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        return;
                }
        
                System.out.println("Total da venda: R$" + totalVenda);
            }
        }
