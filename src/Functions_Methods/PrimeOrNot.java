package Functions_Methods;

public class PrimeOrNot {
//    public static boolean check_Prime(int n){
////        boolean isPrime = true;
//        if (n == 2 ){
//return true;
//        }
//        for (int i = 2; i <= n-1; i++) {
//            if(n%i ==0){
////                isPrime = false;
////                break;
//                return false;
//            }
//
//        }
//        return true;
//    }
public static boolean check_Prime(int n){
    if (n == 2 ){
return true;
        }
    for (int i = 2; i <=Math.sqrt(n) ; i++) {
        if (n%i==0) {
            return false;

        }
    }return  true;
}
public static void primeInRange(int n){
    for (int i = 2; i <=n ; i++) {
        if(check_Prime(i)){
            System.out.println(i+" ");
        }

    }
    System.out.println();
}
    public static void main(String[] args) {
        System.out.println(check_Prime(2));
        primeInRange(20);
    }
}
