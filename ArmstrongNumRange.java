package jspider.forLoop;
import java.util.Scanner;
public class ArmstrongNumRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a starting point");
        int start= sc.nextInt();
        System.out.println("Enter a ending point");
        int ends=sc.nextInt();
        int count=0;
        for (int i=start;i<=ends;i++){
        if (isArmstrong(i)) {
            System.out.print(i + " ");
            count++;
        }
        }
        System.out.println(" \n Total Armstrong number is: "+count);
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
    public static int getCount(int num){
        int count=0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }
    public static int getPower(int a,int b){
        int pow=1;
        for (int i=1;i<=b;i++){
           pow=pow*a;
        }
        return pow;
    }
}
