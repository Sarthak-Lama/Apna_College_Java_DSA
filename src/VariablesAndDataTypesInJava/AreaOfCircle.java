package VariablesAndDataTypesInJava;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        final float pi = 3.14F;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        float radius = sc.nextFloat();
        float area = 2*pi*radius;

        System.out.println(STR."Area of circle : \{area}");
    }
}
