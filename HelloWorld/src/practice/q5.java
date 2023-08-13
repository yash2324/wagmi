package practice;
import java.util.*;
public class q5 {
    public static void main(String[] args) {
        String c= "abcba";
        int s=0;
        int e= c.length()-1;
        boolean a;
        while(s<=e){
            if(c.charAt(s) != c.charAt(e)){

                System.out.println("False");
                break;
            }
            s++;
            e--;
            System.out.println("True");

        }



    }
}
