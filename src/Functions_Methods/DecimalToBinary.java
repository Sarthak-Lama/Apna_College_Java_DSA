package Functions_Methods;

import java.util.Scanner;

public class DecimalToBinary {
    public  void decToBi( int decNum){
        int myNumber = decNum;
        int pow = 0;
        int biNum = 0;
        while ( decNum > 0){
            int reminder = decNum % 2;
            biNum = biNum + (reminder * (int)Math.pow(10,pow));
            pow++;
            decNum= decNum/2;

        }
        System.out.println(" The decimal of "+ myNumber+ " = "+ biNum);
    }
    public static void main(String[] args) {
        DecimalToBinary dec = new DecimalToBinary();
        Scanner bi = new Scanner(System.in);
        System.out.println("Enter the Decimal number : ");
        int num = bi.nextInt();
        dec.decToBi(num);
    }
}
