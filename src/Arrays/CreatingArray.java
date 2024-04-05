package Arrays;

import java.util.Scanner;

public class CreatingArray {
    public static void main(String[] args) {
        int[] marks = new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();
        System.out.println("Length of array "+ marks.length);
        System.out.println(" physic "+ marks[0]);
        System.out.println(" chemistry "+ marks[1]);
        System.out.println(" math "+ marks[2]);

        int Avg = (marks[0]+marks[1]+marks[2])/3;

        System.out.println("Avg "+ Avg);


    }
}
