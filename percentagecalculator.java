import java.util.Scanner;

public class percentagecalculator {
    public static void main(String[] args) {
        int sub1, sub2, sub3, sub4, sub5;
        float outOfMarks;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the out of marks");
        outOfMarks = sc.nextInt();
        System.out.println("enter the sub 1 marks");
        sub1 = sc.nextInt();
        System.out.println("enter the sub 2 marks");
        sub2 = sc.nextInt();
        System.out.println("enter the sub 3 marks");
        sub3 = sc.nextInt();
        System.out.println("enter the sub 4 marks");
        sub4 = sc.nextInt();
        System.out.println("enter the sub 5 marks");
        sub5 = sc.nextInt();
        outOfMarks = outOfMarks*5;
        int totalMarks=sub1+sub2+sub3+sub4+sub5;
        float percentage = (totalMarks/outOfMarks)*100;
        System.out.println("percentage of given student is : ");
        System.out.println(percentage);
    }
}
