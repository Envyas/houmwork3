package com.company;

import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        int a=2;
        int b=8;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диапозон чисел");
        int number = scanner.nextInt();
        switch (number) {
            case 0:
            case 1:
                System.out.println("Менье двух");
                break;
            case 3:
            case 4:
                System.out.println("Меньше восьми");
                break;
            case 2:
            case 5:
                case 6:
            case 7:
            System.out.println("От двух до воьсми");
            default:
                System.out.println("Не принадлежит диапозону");





    }
}
    }
