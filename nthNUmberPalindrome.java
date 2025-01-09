package jspider.forLoop;

import java.util.Scanner;
public class nthNUmberPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth number");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; ; i++) {
            if (isPalindrome(i)) {
                count++;
                if (count == num) {
                    System.out.println(num + " tn palindrome number is: " + i);
                    break;
                }
            }
        }
    }
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int newNum = 0;
        while (num > 0) {
            int rem = num % 10;
            newNum = newNum * 10 + rem;
            num = num / 10;
        }
        return originalNum == newNum;
    }
}

