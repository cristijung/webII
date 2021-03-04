package aula02;

import java.util.Scanner;
public class Ex04Porcentagem {
    double n1, n2;
    double resultado;
        
    static Scanner ler = new Scanner(System.in);

    
    public static void main(String[] args) {
        System.out.println("Digite o valor do primeiro produto: ");
        double n1 = ler.nextDouble();
        
        System.out.println("Digite o valor do segundo produto: ");
        double n2 = ler.nextDouble();
        
        System.out.println("O valor da compra com desconto é: " + (n1 + n2)); 
        System.out.println("O valor do desconto é: " + (n1 + n2) * 0.02);    
        
        
    }
    
}
