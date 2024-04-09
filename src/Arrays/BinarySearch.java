package Arrays;

public class BinarySearch {
    public int binarySearch(int [] numbers,int key){
        int start = 0, end = numbers.length-1;

        while(start <= end){

            int mid = (start + end )/2;

            //comparison
            if(numbers[mid]== key ){  //FOUND
                return  mid;
            }
            if(numbers[mid] < key ){   //RIGHT
                start = mid + 1;
            }else{            //LEFT
                end = mid - 1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,10,12,14};
        int key = 10;
        BinarySearch Bi = new BinarySearch();

        System.out.println("Index for key is : "+ Bi.binarySearch(numbers,key));
    }
}
