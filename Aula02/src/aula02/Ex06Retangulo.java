package aula02;
import java.util.Scanner;

public class Ex06Retangulo {
    int lado1, lado2; 
    
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
       
        System.out.println("Digite o um Lado do retângulo: ");
        int lado1 = ler.nextInt();
        
        System.out.println("Digite o segundo Lado do retângulo: ");
        int lado2 = ler.nextInt();
        
        System.out.println("Visualizando os dados da forma geométrica:");
        System.out.println("A área do retângulo é: " + (lado1 * lado2));
        System.out.println("O perímetro do retângulo é: " + (lado1 + lado2) * 2);                
        
    }
    
}
