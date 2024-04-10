package Arrays;

public class PairsInAnArray {

    public void pairs(int []numbers){
        int tp= 0;
        for(int i = 0 ; i  < numbers.length;i ++){
            int curr = numbers[i]; // curr == current numbers in an array

            for(int j = i +1; j < numbers.length; j ++){
                System.out.print("( "+ curr+","+ numbers[j]+" )");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total  numbers of pairs : "+ tp);
    }

    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,10};
    PairsInAnArray p = new PairsInAnArray();
    p.pairs(numbers);
    }
}
