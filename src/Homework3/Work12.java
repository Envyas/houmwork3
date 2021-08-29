package Homework3;
import java.util.Random;
public class Work12 {
   public static void main(String[] args) {
       Random random = new Random();
       String resultFromString = "";
       int prog;
       for (int a = 0; a < 100; a++) {
           prog = (int) (Math.random() * 1000);
           int randomNumber = random.nextInt(1000);
           resultFromString = resultFromString + " " + randomNumber;
       }
       System.out.println(resultFromString);
          StringBuilder resultFromStringBuilder = new StringBuilder();
              int randomNumber = random.nextInt(1000);
              resultFromStringBuilder.append(randomNumber).append(" ");
              System.out.println(resultFromStringBuilder);
          }

      }





