package jspider.forLoop;
import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
       if (isPrime(num))
        System.out.println(num+" is prime number");
        else
        System.out.println(num+" is not prime number");
    }
    public static boolean isPrime(int num){
        if (num<2)
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
