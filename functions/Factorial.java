package functions;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int a) {
        int factoria=1;
        for (int i=1;i<=a;i++){
             factoria=factoria*i;
        }
        return factoria;
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fact  = factorial(a);
    
        System.out.println(fact);
        sc.close();
    }
}
