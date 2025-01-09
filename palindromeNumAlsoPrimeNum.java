package jspider.forLoop;
import java.util.Scanner;
public class palindromeNumAlsoPrimeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start range");
        int start= sc.nextInt();
        System.out.println("Enter ends range");
        int ends= sc.nextInt();
        int count=0;
        for (int i=start; i<=ends; i++){
            if (isPalindrome(i)&&isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n Total count is: "+count);
    }
    public static boolean isPalindrome(int num){
        int originalNum=num;
        int newNum=0;
        while (num>0){
            int rem=num%10;
            newNum=newNum*10+rem;
            num=num/10;
        }
        if (originalNum==newNum){
            return true;
        }
   return false;
    }
    public static boolean isPrime(int num){
        if(num<2)
            return false;
        if (num==2||num==3)
            return true;
        if (num%2==0)
            return false;
        for (int i=3; i*i<=num; i+=2){
            if (num%i==0)
            return false;
        }
        return true;
    }
}
