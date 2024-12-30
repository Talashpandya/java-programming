// import java.util.Scanner;

// public class NUMBERpyramideSAMEline {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = n - i; j >= 1; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= (i * 2) - 1; j++) {
//                 if (i % 2 == 0) {
//                     if ((i + j) % 2 == 0)
//                     System.out.print(" ");    
                    
//                     else
//                     System.out.print(i);    
//                 } else {
//                     if ((i + j) % 2 == 0)
//                     System.out.print(i);
//                     else
//                     System.out.print(" ");
                        

//                 }
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }
import java.util.Scanner;

public class NUMBERpyramideSAMEline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {        

                 System.out.print(i+" ");   
            }
            System.out.println();
        }
        sc.close();
    }
}
