package Functions_Methods;

import java.util.Scanner;

public class Factorial {
    public  static int calculateFact(int num){
        int f=1;
        for(int i = 1; i<=num; i++){
            f*=i;
        }
        return f;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int fact = calculateFact(num);
        System.out.println("The factorial of "+ num + " is "+ fact);
    }
}
