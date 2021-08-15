package arrays.com;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class work2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("zadaite vopros");
        System.out.println("10+10=?");

        int number=0;
        int a=2;
        int inc = 0;


        System.out.println("vi hotite sdatsa");
        System.out.println("sdatsa press 1, prodoljit  press 2");
        a=scanner.nextInt();
        if(a==2) {
        do {
            inc++;
            number=scanner.nextInt();
            if (number == 20) {
                System.out.println("pravilno");
                inc=4;
            } else {
                System.out.println("neverno");}
        }
            while (inc<3) ;
        }else {
            System.out.println("a zrja");
        }
    }
    }


