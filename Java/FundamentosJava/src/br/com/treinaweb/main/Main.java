package br.com.treinaweb.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        int resultado = 0;

        if (operacao == '+') {
            resultado = numero1 + numero2;
        }else if (operacao == '-'){
            resultado = numero1 - numero2;
        }else if(operacao == 'x'){
            resultado = numero1 * numero2;
        }else if(operacao == '/'){
            resultado = numero1 / numero2;
        }else {
            System.out.println("Digite uma operação válida");
        }
        System.out.println(String.format("%d %c %d = %d", numero1, operacao, numero2, resultado));

        scanner1.close();
    }
}