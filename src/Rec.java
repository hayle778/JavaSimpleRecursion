public class Rec{

    public static void main(String[]args) {

                recursionSum(6);
    }

public static void recursionSum(  int h){
        if(h==0 ){
            System.out.println("Stop!");

        }
else{
            System.out.println(h);
            h--;
    recursionSum(h);

        }

    }











}