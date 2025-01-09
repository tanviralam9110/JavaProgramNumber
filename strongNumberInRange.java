package jspider.forLoop;
import java.util.Scanner;
public class strongNumberInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting range");
        int start= sc.nextInt();
        System.out.println("Enter the ending range");
        int end=sc.nextInt();
        int count=0;
        for (int i=start; i<=end;i++) {
            if (isStrong(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n Total strong number is: "+count);
    }
    public static boolean isStrong(int num){
        int sum=0;
        int originalNum=num;
        while (num>0){
            int rem=num%10;
            sum+=getFactorial(rem);
            num=num/10;
        }
   return  sum==originalNum;
    }
    public static int getFactorial(int num){
        int fact=1;
        for (int i=1; i<=num; i++){
            fact=fact*i;
        }
        return fact;
    }
}
