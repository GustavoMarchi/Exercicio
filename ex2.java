package gradleproject2;

import java.util.Scanner;

public class ex2 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite seu nome");
        int n = entrada.nextInt();
        System.out.println("Digite sua primeira nota");
        int a = entrada.nextInt();
		System.out.println("Digite sua segunda nota");
		int b = entrada.nextInt();
		System.out.println("Digite sua terceira nota");
		int c = entrada.nextInt();
		System.out.println("Digite sua quarta nota");
		int d = entrada.nextInt();
		int m = (a + b + c + d) / 4
		System.out.println("Olá"+n" ,sua média é"+m);
    }
    
}
