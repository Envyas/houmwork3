package Homework3;
import java.util.Scanner;
import java.util.Date;
public class work3 {
    public static void main(String[] args) {
        //Вводим данные
        String user,age;
        Scanner in = new Scanner(System.in);
        System.out.print("Fill in your name:");
        user = in.nextLine();
        System.out.print("Fill in your age:");
        age = in.nextLine();
        //Вывести сообщение, приветствующее пользователя
        String template ="%s";
        String formattedStr=String.format(template,"Hello  "+user+" "+ age);
        System.out.println(formattedStr);
        Date date = new Date();
        // Вывод текущей даты и времени с использованием toString()
        System.out.println(date.toString());

    }
}