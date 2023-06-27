package exceptiondemo;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        int a=10, b=0,c;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 2 number");
        a=sc.nextInt();
        b=sc.nextInt();
        try {
            c=a/b;
            System.out.println(c);
        } catch (ArithmeticException e){
            System.out.println("Division by zero !" + e.getMessage());
            // e.printStackTrace();
        }
        finally{
            System.out.println("Action systémique !");

        }
    }
}