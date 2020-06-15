package br.com.treinaweb.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int resultado;

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);

        int acao = 1; // 0 = Sair -1= Operação Matematica 2= Ver Histórico
        ArrayList<String> historico = new ArrayList<String>();
        while (acao > 0) {
            
            if (acao == 1) {
                System.out.println("=== Operação Matemática ===");
                System.out.println("Digite o primeiro numero: ");
                int numero1 = scanner1.nextInt();
                // System.out.println(numero1);

                System.out.println("Digite qual a operação: ");
                char operacao = scanner1.next().charAt(0);
                // System.out.println(operacao);

                System.out.println("Digite o segundo numero: ");
                int numero2 = scanner1.nextInt();
                // System.out.println(numero2);
                // System.out.println(String.format("Você que fazer a operação %d %c %d",
                // numero1, operacao, numero2));

                // int resultado = 0;

                /*
                 * if (operacao == '+') { resultado = numero1 + numero2; }else if (operacao ==
                 * '-'){ resultado = numero1 - numero2; }else if(operacao == 'x'){ resultado =
                 * numero1 * numero2; }else if(operacao == '/'){ resultado = numero1 / numero2;
                 * }else { System.out.println("Digite uma operação válida"); }
                 */

                switch (operacao) {
                    case '+':
                        resultado = numero1 + numero2;
                        break;
                    case '-':
                        resultado = numero1 - numero2;
                        break;
                    case '*':
                        resultado = numero1 * numero2;
                        break;
                    case '/':
                        resultado = numero1 / numero2;
                        break;
                    default:
                        System.out.println("Operação Inválida");
                        break;
                }

                String entradaHistorico = String.format("%d %c %d = %d", numero1, operacao, numero2, resultado);
                historico.add(entradaHistorico);

                System.out.println(entradaHistorico);

                
            }else if (acao == 2){
                System.out.println("=== Histórico ===");
                System.out.println(String.format("- Você já fez %d operações", historico.size()));
                for (int i = 0; i < historico.size(); i++) {
                    System.out.println(historico.get(i));
                    
                }
            }
            System.out.println("=== O que você deseja Fazer? ===");
            System.out.println("1. Realizar Operação Matemática");
            System.out.println("2. Visualizar Histórico");
            System.out.println("0. Sair");
            System.out.print("Sua Opção: ");
            acao = scanner1.nextInt();
        }
        scanner1.close();
    }
}