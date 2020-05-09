package gradleproject2;

import java.util.Scanner;

public class ex4i {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Descobrir imc");
        System.out.println("Informe sua altura");
		int h = entrada.nextInt();
		System.out.println("Informe seu peso");
		int p = entrada.nextInt();
		int i = p / (h . h)
		System.out.println("A imc e" +i);
    }
    
}
