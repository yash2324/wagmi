package practice;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter Principal amt :");
        int p = in.nextInt();
        System.out.println("enter time :");
        int t= in.nextInt();
        System.out.println("enter rate :");
        int r = in.nextInt();
        int si= (p*r*t)/100;
        System.out.println(si);

    }
}
