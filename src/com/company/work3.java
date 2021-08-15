package com.company;


import java.util.Scanner;


public class work3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа");
        int number = scanner.nextInt();


        int a = 50;
        int b = 10;
        int c = 70;
        int g = 0;

        if (a > b) {
            if (a > c) {
                System.out.println("max " + a);
            } else {
                System.out.println("max " + c);
            }
        } else {
            if (b > c) {
                System.out.println("max " + b);
            } else {
                System.out.println("max " + c);
            }
        }

//поиск максимального числа

        if (a < b) {
            if (a < c) {
                System.out.println("min " + a);
            } else {
                System.out.println("min " + c);
            }
        } else {
            if (b < c) {
                System.out.println("min " + b);
            } else {
                System.out.println("min " + c);
            }
        }

//поиск минимально числа

        g = (a + b + c) / 3;
    }
}





