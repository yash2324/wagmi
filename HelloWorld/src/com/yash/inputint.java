package com.yash;
import java.util.Scanner;

public class inputint {
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
//        System.out.println("Please enter your rollno");
//        int rollno= input.nextInt();
//        System.out.println("Your roll no is "+rollno);
        String name= input.nextLine();
        System.out.println(name);
        float marks=input.nextFloat();
        System.out.println(marks);


    }
}
