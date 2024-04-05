package Arrays;

public class PassingArraysAsArg {
    public void update(int[] marks){
for(int i = 0; i < marks.length;i++){
    marks[i]+=1;
}
    }
    public static void main(String[] args) {
        PassingArraysAsArg arr = new PassingArraysAsArg();
        int [] marks ={50,60,80};
        arr.update(marks);


        for(int i = 0; i < marks.length;i++){
            System.out.print(STR."\{marks[i]} ");
        }
        System.out.println();
    }

}
