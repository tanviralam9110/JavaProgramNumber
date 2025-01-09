package jspider.forLoop;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        getFibonacci(num);
    }
    public static void getFibonacci(int num){
        int n1=0;
        int n2=1;
        System.out.print(n1+" "+n2+" ");
        for (int i=1;i<=(num-2);i++){
            int n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}
