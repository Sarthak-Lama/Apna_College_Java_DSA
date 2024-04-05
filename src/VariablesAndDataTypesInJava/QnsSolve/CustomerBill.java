package VariablesAndDataTypesInJava.QnsSolve;

import java.util.Scanner;

public class CustomerBill {
    public static void main(String[] args) {
        Scanner B = new Scanner(System.in);
        System.out.println("Enter the price of Pencil, Pen and Eraser:  ");
        float pencil_cost = B.nextFloat();
        float pen_cost = B.nextFloat();
        float eraser_cost = B.nextFloat();
        float bill = pencil_cost+pen_cost+eraser_cost;
        float tax = bill * ((float) 13 /100);
        float cost_with_tax= bill+tax;

        System.out.println(" Bill is  : "+bill);
        System.out.println(" Bill with 13% tax : "+cost_with_tax);

        System.out.println("Thank you for Shopping with us ;) ");
    }
}
