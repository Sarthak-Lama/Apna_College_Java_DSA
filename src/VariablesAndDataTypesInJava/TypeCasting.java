package VariablesAndDataTypesInJava;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float marks = 99.99f;
        int marks2 = (int) marks;
        System.out.println(marks2);

        char ch ='b';
        int number = ch;
        System.out.println(number );
    }
}
