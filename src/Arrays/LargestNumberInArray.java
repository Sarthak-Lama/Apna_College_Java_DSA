package Arrays;

import java.util.Scanner;

public class LargestNumberInArray {

    public int getLargest(int []numbers){
        int largest = Integer.MIN_VALUE; // -infinity
        int Smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(Smallest> numbers[i]){
                Smallest = numbers[i];
            }

        }
        System.out.println("The samllest values is "+ Smallest);
        return  largest;
    }
    public static void main(String[] args) {
        LargestNumberInArray L = new LargestNumberInArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size :");
        int size = sc.nextInt();
        int [] numbers = new int[size];
        System.out.println("Enter the numbers :");
        for (int i = 0; i < numbers.length; i++) {
            int num = sc.nextInt();
            numbers[i]=num;

        }
        System.out.println("The largest value is "+L.getLargest(numbers));
    }
}
