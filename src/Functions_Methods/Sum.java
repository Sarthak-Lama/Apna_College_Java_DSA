package Functions_Methods;

import java.util.Scanner;

public class Sum {
    public static int  printSum(int a , int b){// parameters or formal parameters comes in function defination
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = printSum( a,  b);//arguments or actual_parameters comes in Function call
        System.out.println(STR ."The sum is \{sum}");


    }}

