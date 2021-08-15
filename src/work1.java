import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество дней");
        int day = scanner.nextInt();
        System.out.println("Введите месяц");
        int month = scanner.nextInt();
        int[] sanja = {28, 31, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (day > 1 && day < sanja[month]) {
            System.out.printf(day + "существует");
        } else {
            System.out.println("такого дня не существует");
        }
    }
}


























