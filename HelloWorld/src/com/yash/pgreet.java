package com.yash;

import java.util.Scanner;

public class pgreet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String personalized = mygreet(name);
        System.out.println(personalized);
    }

    static String mygreet(String name) {
        String output = "Hello ,"+name+"!!! How are you ?";
        return output;
    }
}
