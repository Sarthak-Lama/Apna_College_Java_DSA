package Arrays;

public class LinearSearch {
    public int Search(int []numbers, int key){
        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i]==key){
                return  1;
            }

        }
        return  -1;
    }
    public static void main(String[] args) {
        LinearSearch S = new LinearSearch();
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};

        int key = 20;
        int index = S.Search(numbers,key);

        if(index == -1){
            System.out.println("Not Found");
        }else {
            System.out.println("Key is at index : "+ index);
        }

    }
}
