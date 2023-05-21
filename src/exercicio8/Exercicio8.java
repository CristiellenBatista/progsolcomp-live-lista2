package exercicio8;
import java.util.Scanner;
public class Exercicio8 {
 
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;

        System.out.print("Digite um número entre 1 e 12 correspondente ao mês: ");
        mes = sc.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("Número inválido. Digite um número entre 1 e 12.");
        } else {
            String nomeMes;
            String estacao;

            switch (mes) {
                case 1:
                    nomeMes = "Janeiro";
                    estacao = "Verão";
                    break;
                case 2:
                    nomeMes = "Fevereiro";
                    estacao = "Verão";
                    break;
                case 3:
                    nomeMes = "Março";
                    estacao = "Outono";
                    break;
                case 4:
                    nomeMes = "Abril";
                    estacao = "Outono";
                    break;
                case 5:
                    nomeMes = "Maio";
                    estacao = "Outono";
                    break;
                case 6:
                    nomeMes = "Junho";
                    estacao = "Inverno";
                    break;
                case 7:
                    nomeMes = "Julho";
                    estacao = "Inverno";
                    break;
                case 8:
                    nomeMes = "Agosto";
                    estacao = "Inverno";
                    break;
                case 9:
                    nomeMes = "Setembro";
                    estacao = "Primavera";
                    break;
                case 10:
                    nomeMes = "Outubro";
                    estacao = "Primavera";
                    break;
                case 11:
                    nomeMes = "Novembro";
                    estacao = "Primavera";
                    break;
                default:
                    nomeMes = "Dezembro";
                    estacao = "Verão";
                    break;
            }

            System.out.println(nomeMes + " é um mês de " + estacao + ".");
        }

        sc.close();
    }
}    

