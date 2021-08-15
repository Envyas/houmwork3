package arrays.com;
import java.util.Scanner;
public class work3 {
    public static void main(String[] args) {
        int prog, user, i;
        // Генерируем случайное целое число от 0 до 100
        do {
            prog = (int) (Math.random() *100);
        } while (prog == 0);
        System.out.println("Programma zagadala chislo ");
        i = 0;
        user = 0;
        do {
            i++;
            System.out.print("Vvedite svoje chislo: ");
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                user = input.nextInt();
                if (user == prog) {
                    System.out.println("Vi ugadali!!! Chislo popitok - " + i);
                } else {
                    if (user <= 100 && user >= 1 ) {
                        System.out.println("Vi ne ugadali:");


                    } else {
                        System.out.println("Vi vveli nepravilnoje chislo");
                    }
                }
            } else {
            }
        } while (user != prog);
        System.out.printf("mimo");
    }
}