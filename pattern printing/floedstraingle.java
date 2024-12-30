import java.util.Scanner;

public class floedstraingle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int x = 1;
        int  n= sc.nextInt();
        
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print(x );
            x++;
        }
        System.out.println();
    }
        sc.close();    
    }
}