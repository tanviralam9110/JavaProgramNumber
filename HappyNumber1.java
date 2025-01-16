package jspider.forLoop;
import java.util.Scanner;
public class HappyNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (isHappyNumber(num))
            System.out.println(num+ " is Happy number");
        else
            System.out.println(num+" is Not Happy Number");
    }
        public static boolean isHappyNumber(int num) {
            while (num > 9) {
                int sum=0;
                while (num>0) {
                    int rem=num%10;
                    sum =sum+rem*rem;
                    num =num/10;
                }
                num=sum;
            }
            return num == 1 || num == 7;
        }
}
