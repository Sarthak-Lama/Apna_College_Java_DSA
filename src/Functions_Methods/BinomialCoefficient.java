package Functions_Methods;

import java.util.Scanner;

public class BinomialCoefficient {
    public  static int calculateFact(int num){
        int f=1;
        for(int i = 1; i<=num; i++){
            f*=i;
        }
        return f;


    }
    public  static int binCoeff(int n, int r){
        int fact_n = calculateFact(n);
        int fact_r = calculateFact(r);
        int fact_nmr = calculateFact(n - r);
        return fact_n/(fact_r * fact_nmr);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int r = sc.nextInt();
        int fact = binCoeff(num, r);
        System.out.println(STR."The binominal coeffeicient  is \{fact}");

    }



}
