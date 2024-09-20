package Raiz;
import java.util.Scanner;

public class Raiz {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

      
        System.out.print("Digite o valor de N: ");
        double N = input.nextDouble();

        
        double k = 1;

      
        System.out.println("Valores aproximados da raiz quadrada de " + N + ":");

        for (int i = 1; i <= 12; i++) {
            k = (k + N / k) / 2; 
            System.out.printf("%d: %.10f\n", i, k); 
        }

        
        System.out.printf("\nA raiz quadrada correta de %.2f e %.10f\n", N, Math.sqrt(N));
        
        input.close();
    }
}

