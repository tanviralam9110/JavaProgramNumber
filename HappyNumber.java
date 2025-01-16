package jspider.forLoop;
import java.util.Scanner;
public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        if (isHappyNumber(num))
            System.out.println(num+" is Happy number");
        else
            System.out.println(num+" is not happy number");
    }
    public static int sumOfSquare(int num){
        int sum=0;
        while (num>0){
            int rem=num%10;
            sum=sum+rem*rem;
            num=num/10;
        }
        return sum;
    }
    public static boolean isHappyNumber(int num){
        int sum=num;
        for (int i=1;i<=num;i++){
            sum=sumOfSquare(sum);
            if (sum==1)
                return true;
        }
        return false;
    }
}
