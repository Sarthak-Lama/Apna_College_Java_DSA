package VariablesAndDataTypesInJava;

public class TypePromotion2nd {
    public static void main(String[] args) {
        //if one operand is long ,float or double the whole expression is promoted to long,float,or double respectively
        int a=10;
        float b= 33.3f;
        long c= 24;
        double d=5;
        double ans = a+b+c+d;
        System.out.println(ans);
    }
}
