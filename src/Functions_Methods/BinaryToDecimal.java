package Functions_Methods;

import java.util.Scanner;

public class BinaryToDecimal {
    public   void binToDec(int biNum){
        int myNum = biNum;
        int pow = 0;
        int decNum =0;
        while(biNum > 0){
            int lastDigit = biNum%10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            biNum  = biNum/10;
        }
        System.out.println(" The decimal of "+ myNum+ " = "+ decNum);
    }
    public static void main(String[] args) {
        Scanner bi = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
        int num = bi.nextInt();
        BinaryToDecimal by = new BinaryToDecimal();

        by.binToDec(num);
    }
}
