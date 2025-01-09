package jspider.forLoop;
import java.util.Scanner;
public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number");
        int num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is not Armstrong Number");
        }
    }
    public static boolean isArmstrong(int num){
        int count=getCount(num);
        int originalNum=num;
        int sum=0;
        while (num>0){
            int rem=num%10;
            sum=sum+getPower(rem,count);
            num=num/10;
        }
        return sum==originalNum;

    }
    public static int getCount(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
    public static int getPower(int a, int b) {
        int pow = 1;
        if(a==1) {
            return 1;
        }
        for (int i = 1; i <= b; i++) {
            pow = pow * a;
        }
        return pow;
    }
}

