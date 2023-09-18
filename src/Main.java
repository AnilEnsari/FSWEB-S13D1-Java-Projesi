import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("1. dog: " + shouldWakeUp(true, 1));
        System.out.println("2. dog: " + shouldWakeUp(false, 2));
        System.out.println("3. dog: " + shouldWakeUp(true, 8));
        System.out.println("4.dog: "+ shouldWakeUp(true,-1)) ;
       System.out.println("hasTeen1: "+ hasTeen(9, 99, 19)) ;
        System.out.println("hasTeen2: "+ hasTeen(23, 15, 42)) ;
        System.out.println("hasTeen3: "+ hasTeen(22, 23, 34)) ;




    }

    public static boolean shouldWakeUp(boolean b1, int hour) {
        if(b1 && (hour >=0 && hour < 8 || hour > 20 && hour <= 23)) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean hasTeen(int ...nums){
for ( int i = 0 ; i<nums.length;i++) {

if(nums [i]<=19&& nums[i]>=13){

    return true;



}

} return false;

    }
}