package jspider.forLoop;
import java.util.Scanner;
public class palindromeNumRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start number range");
        int start= sc.nextInt();
        System.out.println("Enter the ends number range");
        int ends= sc.nextInt();
        int count=0;
        for (int i=start; i<=ends; i++){
            if (isPalindrome(i)){
                System.out.print(i+ " ");
                count++;
            }
        }
        System.out.println("\n Total count of palindrome is :"+count);
    }
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int newNum = 0;
        while (num > 0) {
            int rem = num % 10;
            newNum = newNum * 10 + rem;
            num = num / 10;
        }
        return originalNum==newNum;
    }
}
