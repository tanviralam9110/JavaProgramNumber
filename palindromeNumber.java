package jspider.forLoop;
import java.util.Scanner;
public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        if (isPalindrome(num)){
            System.out.println(num+" is palindrome number");
        }
        else
            System.out.println(num+ " is Not Palindrome number");
    }
    public static boolean isPalindrome(int num){
        int originalNum=num;
        int newNum=0;
        while (num>0){
            int rem=num%10;
            newNum =newNum*10+rem;
            num=num/10;
        }
   return originalNum==newNum;
    }
}
