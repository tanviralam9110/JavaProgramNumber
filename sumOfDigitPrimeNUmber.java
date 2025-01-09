package jspider.forLoop;
import java.util.Scanner;
public class sumOfDigitPrimeNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number of range");
        int start = sc.nextInt();
        System.out.println("Enter the ends of number of range");
        int ends = sc.nextInt();
        int count=0;
        for (int i=start; i<=ends; i++) {
            if (isPrime(i)&&isPrime(sumDigit(i))){
//            if (isPrime(i)) {
//                if (isPrime(sumDigit(i))) {
                    System.out.println(i + " : sum of digit : " + sumDigit(i) + " ");
                    count++;
                }
            }
        System.out.println("\n Total prime number is "+count);
    }
    public static boolean isPrime(int num){
        if (num<2)
            return false;
        if (num==2||num==3)
            return true;
        if (num%2==0)
            return false;
        for (int i=3; i*i<=num; i +=2){
            if (num%i==0)
                return false;
        }
        return true;
    }
    public static int sumDigit(int num){
        int sum=0;
        while (num>0){
            int rem=num%10;
            sum=rem+sum;
            num=num/10;
        }
        return sum;
    }
}
