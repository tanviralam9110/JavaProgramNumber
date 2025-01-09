package jspider.forLoop;
import java.util.Scanner;
public class strongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        if (isStrong(num))
            System.out.println(num+" is strong number");
        else
            System.out.println(num+" is Not strong number");
    }
    public static boolean isStrong(int num){
        int sum=0;
        int originalNum=num;
        while (num>0){
            int rem=num%10;
            sum=sum+getFactorial(rem);
            num=num/10;
        }
        return sum==originalNum;
    }
    public static int getFactorial(int num){
        int fact=1;
        for (int i=1; i<=num; i++){
            fact=fact*i;
        }
        return fact;
    }
}
