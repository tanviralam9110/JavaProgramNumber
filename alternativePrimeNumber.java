package jspider.forLoop;
import java.util.Scanner;
public class alternativePrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start of range number");
        int start = sc.nextInt();
        System.out.println("Enter end of range number");
        int ends = sc.nextInt();
        int count = 0;
        for (int i = start; i <= ends; i++) {
            if (isPrime(i)) {
                count++;
                if (count % 2 != 0)
                    System.out.print(i + " ");
            }
        }
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
