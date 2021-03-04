//criar um algoritmo onde o usuário digita 2 valores e o programa exibe a soma
package aula02;
import java.util.Scanner;

public class Ex02Soma {
    double n1, n2;
        
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Digite o primeiro número: ");
        double n1 = ler.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        double n2 = ler.nextDouble();
        
       System.out.println("O resulatdo da soma é? " + (n1 + n2));  
       
       
        
    }
}
        

