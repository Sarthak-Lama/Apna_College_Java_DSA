package Functions_Methods;

public class FunctionOverloading {
    public  static int sum( int a , int b){
        return a + b;

    }
    public  static int sum( int a , int b, int c){
        return a + b+c;

    }
    public  static float  sum( float  a , float b, float c,float d){
        return a + b+c+d;

    }

    public static void main(String[] args) {
        System.out.println(sum(4,2));
        System.out.println(sum(4,2,2));
        System.out.println(sum(4.2f,6.2f,3.5f,4.4f));
    }

}
