package Homework3;

import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {

        String c="";
        String b;
        int prog;
        for (int a = 0; a < 100; a++) {
            prog = (int) (Math.random() * 1000);
            b = String.valueOf(prog);
            c =String.join(" ", c, b);
        }
        System.out.println(c);
    }
}
