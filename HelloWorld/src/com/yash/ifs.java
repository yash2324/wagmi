package com.yash;
import java.util.Scanner;

public class ifs {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int salary=25400;
        if(salary>10000){
            salary = salary+2000;
        }
        else {
            salary = salary +1000;
        }
        System.out.println(salary);
    }
}
