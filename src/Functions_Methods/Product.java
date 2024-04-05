package Functions_Methods;

import java.util.Scanner;

public class Product {
public static  int  printProduct(int a , int b){
     return a * b;

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int product = printProduct(num1,num2);
        System.out.println(STR."Product : \{product}");

    }
}
