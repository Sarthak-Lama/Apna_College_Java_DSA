package Arrays;

public class KadanesAlgo {

    public int  kadanes(int []numbers){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < numbers.length; i++) {

            currSum +=numbers[i];
//            if( currSum <0){
//                currSum=0;
//            }
            maxSum = Math.max(currSum,maxSum);
            if( currSum <0){
                currSum=0;
            }
        }
     return maxSum;
    }


    public static void main(String[] args) {
//        int [] numbers = {-2,-3,4,-1,-2,1,5,-3};
        int [] numbers = {-2,1,-3,4,-1,2,1,-5,4};
        KadanesAlgo k = new KadanesAlgo();
       int a =  k.kadanes(numbers);
        System.out.println(a);
    }
}
