package VariablesAndDataTypesInJava;

import java.util.Scanner;

public class SumOfNum {
    //code to calculate sum
    public static void main(String[] args) {
//
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1+num2;
        int product = num1*num2;
        System.out.println("The sum of two number is "+ sum);
        System.out.println("The product of two number is "+product);
    }
}
