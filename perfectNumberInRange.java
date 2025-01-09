package jspider.forLoop;
import java.util.Scanner;
public class perfectNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start num range");
        int start = sc.nextInt();
        System.out.println("Enter the ends num range");
        int ends = sc.nextInt();
        int count = 0;
        for (int i = start; i <= ends; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n total perfect number count is " + count);
    }
    public static boolean isPerfect(int num){
        int sum=0;
        for (int i=1; i<=num/2; i++){
            if (num%i==0)
                sum+=i;
        }
        return num==sum;
    }
}
