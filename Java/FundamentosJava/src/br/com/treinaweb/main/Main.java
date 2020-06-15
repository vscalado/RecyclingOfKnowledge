package br.com.treinaweb.main;

import java.util.Scanner;

public class Main {

    static int resultado;

    public static void main(String[] args) {
        System.out.println(resultado);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner1.nextInt();
        //System.out.println(numero1);
        
        System.out.println("Digite qual a operação: ");
        char operacao = scanner1.next().charAt(0);
        //System.out.println(operacao);
        
        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner1.nextInt();
        //System.out.println(numero2);
        //System.out.println(String.format("Você que fazer a operação %d %c %d", numero1, operacao, numero2));

        //int resultado = 0;

        /*if (operacao == '+') {
            resultado = numero1 + numero2;
        }else if (operacao == '-'){
            resultado = numero1 - numero2;
        }else if(operacao == 'x'){
            resultado = numero1 * numero2;
        }else if(operacao == '/'){
            resultado = numero1 / numero2;
        }else {
            System.out.println("Digite uma operação válida");
        }*/

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

        System.out.println(String.format("%d %c %d = %d", numero1, operacao, numero2, resultado));

        scanner1.close();
    }
}