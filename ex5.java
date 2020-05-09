package gradleproject2;

import java.util.Scanner;

public class ex5 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe quantos km quer saber em milhas");
        int k = entrada.nextInt();
        int m = k / 1,60934
		System.out.println("a quantidade de km informada possui"+m "milhas");
    }
    
}
