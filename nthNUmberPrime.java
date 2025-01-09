package jspider.forLoop;

import java.util.Scanner;

public class nthNUmberPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth number: ");
        int num=sc.nextInt();
        int count=0;
        for (int i=1; ; i++){
            if (isPrime(i)){
                count++;
                if (count==num){
                    System.out.println(num+ " th prime  number is: "+i);
                   // break;
                     return;
                }
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
        if (num == 2 || num == 3)
            return true;
        if (num % 2 == 0)
            return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }
        return  true;
    }
}
