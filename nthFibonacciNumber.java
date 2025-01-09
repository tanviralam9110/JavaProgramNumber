package jspider.forLoop;
import java.util.Scanner;
public class nthFibonacciNumber {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num= sc.nextInt();
   int nthTerm= getFibonacci(num);
        System.out.println(num+" th Fibonacci term is "+ nthTerm);
}
    public static int getFibonacci(int num){
        if (num==1)
            return 0;
        int n1=0;
        int n2=1;
        int n3=1;
        for (int i=1;i<=(num-2);i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        return n3;
    }
}
