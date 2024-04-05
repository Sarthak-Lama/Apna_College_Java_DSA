package VariablesAndDataTypesInJava.QnsSolve;

import java.util.Scanner;

public class AverageOfNum {
    public static void main(String[] args) {
        //wap to find average of three numbers
        Scanner avg = new Scanner(System.in);
        System.out.println("Enter the three numbers ");
        float num1= avg.nextFloat();
        float num2= avg.nextFloat();
        float num3= avg.nextFloat();
        float average = (num1+num2+num3)/3;
        System.out.println("The average is : "+average);

    }
}
