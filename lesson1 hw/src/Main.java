/**
 * Created by Doron on 11/05/2016.
 */
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int x;
        int y;

        System.out.println("The distance is " + distance(0, 0));
        System.out.println("The sum is " + getSum(-5, 8));
        System.out.println("The product is " + getProduct(5, 2));
        System.out.println("The quatient is " + getQuatient(31, 10));
        System.out.println("The max is " + getMax(507, 951));
        System.out.println("The rimainder is " + getReminder(31,10) );
        System.out.println ("The power is " + getPower(10,4));
        System.out.println("The sqrt is " + getSqrt(11));
        System.out.println("Is true? "+ isTrue(false));

        /*Scanner scan =new Scanner(System.in);
        System.out.println("Enter value for Z:");
        int z;
        z= scan.nextInt();
        System.out.println("z="+z);*/


        Scanner scan = new Scanner(System.in);
        int v;
        v=scan.nextInt();
        System.out.println("sqwer v is: " +getPower(v,2));
        System.out.println("cube v is: "+getPower(v,3));

        Scanner scan1 = new Scanner(System.in);
        final int DAY=86400,HOUR=3600, MINUTE=60;
        int second, minute, hour, day;
        System.out.println("Pleas enter second:");
        second = scan.nextInt();
        day = second/DAY;
        second%=DAY;
        hour=second/HOUR;
        second%=HOUR;
        minute=second/MINUTE;
        second%=MINUTE;
        System.out.println("day= " + day+ " hour= "+ hour+ " minute= "+ minute+" second="+second);

        Scanner scan2 = new Scanner(System.in);
        int ahadot, asarot, meot;
        System.out.println("Pleas enter 3 digit number:");
        ahadot=scan.nextInt();
        meot= ahadot/100;
        ahadot%=100;
        asarot=ahadot/10;
        ahadot%=10;
        System.out.println("meot= " + meot+ " asarot= "+ asarot+ " ahadot= "+ahadot);



    }

    public static int getSum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static int distance(int x, int y) {
        int smaller = x;
        int bigger = y;
        if (smaller > bigger) {
            smaller = y;
            bigger = x;
        }
        int distance = 0;
        for (int i = smaller + distance; i < bigger; i++) {
            distance++;
        }
        return distance;

    }

    public static int getProduct(int x, int y) {
        int smaller = x;
        int bigger = y;
        if (smaller > bigger) {
            smaller = y;
            bigger = x;
        }
        int product = 0;
        for (int i = 0; i < smaller; i++) {
            product += bigger;
        }
        return product;
    }

    public static int getQuatient(int x, int y) {
        if (y == 0) {
            return -1;
        }
        int count = 0;
        int num = y;
        for (int i = 0; num <= x; i++) {
            count++;
            num += y;
        }
        return count;
    }

    public static int getMax(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

   /* public static int gtRemainder (int x, int y){
        int num = y;
        for(int i=0; num<=x; i++ ){
            num+=y
        }

    }*/

    public static int getReminder(int x, int y){
        return distance(x,getProduct(getQuatient(x,y),y));
    }

    public static int getPower (int x, int y){

        int num = 1;
        if (x==0&y==0){
            num=-1;
        }
        for (int i=1; i<=y; i++){
        num= getProduct(x,num);
        }
        return num;
    }

    public static int getSqrt (int x){
        if(x==0)return -1;
        int i;
            for(i=0; i*i<=x; i++){

        }
        return i-1;

    }
    public static String isTrue (boolean x) {
        if (x) {
            return "Yes";
        }
        return "No";
    }


}