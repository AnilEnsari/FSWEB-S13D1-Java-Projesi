import java.sql.SQLOutput;
import java.util.Scanner;

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
        System.out.println("isCatPlaying1: "+ isCatPlaying(true, 10));
        System.out.println("isCatPlaying2: "+ isCatPlaying(false, 36)) ;
        System.out.println("isCatPlaying3: "+ isCatPlaying(false, 35)) ;
        System.out.println("areaSquare1: "+ area(5.0, 4.0)) ;
        System.out.println("areaSquare2: "+ area(-1.0, 4.0)) ;
        System.out.println("area2: "+ areaCircle()) ;

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

 public static boolean isCatPlaying (boolean isSummer,int degree)   {

       if(isSummer) {
          if(degree<=45&&degree>=25) {return true;}
          else return false ;



       }
       else { if(degree<=35 && degree>=25) return true;

           else return false ;
       }

 }
 public static double area(double line1,double line2){

        if (line1 <0 || line2 <0) return -1 ;
        else return line1*line2 ;


 }

    public static double areaCircle(){
Scanner scanner = new Scanner(System.in) ;
        System.out.println("Lütfen yarıçap değerini giriniz");
double radius = scanner.nextDouble() ;
        if (radius <0) return -1 ;
        else return  radius*radius*Math.PI ;


    }



}
