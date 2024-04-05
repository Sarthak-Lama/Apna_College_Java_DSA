package VariablesAndDataTypesInJava;

public class TypePromotion {
    public static void main(String[] args) {
        //java automatically promotes each byte , short , or char operand to int when evaluating an expression
        char a = 'a';
        char b= 'b';
        System.out.println(b-a);//automatically converts expression into int
    }
}
