package VariablesAndDataTypesInJava.QnsSolve;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        //wap tp find the area of square
        Scanner sq = new Scanner(System.in);
        System.out.println("Enter the length of side : ");
        int side = sq.nextInt();
        int area = side *side;
        System.out.println("The area of square is : "+area);
    }
}
