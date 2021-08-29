package Homework3;

public class work2 {
    public static void main(String[] args) {

        //String c="";
       // String b;
       // int prog;
        int [] prog=new int [100];
        for (int a = 0; a < 100; a++) {
            prog[a] = (int) (Math.random() * 1000);
                String result = prog[a] + "  ";
                if (prog[a] > 9 && prog[a] < 99) {
                    System.out.print(result.replaceAll("[1-9][0-9]", "-1"));
                } else
                    System.out.print(result);
            }
        }
    }




 //     String c="";
 //     String b;
 //     int prog;
 //     for (int a = 0; a < 100; a++) {
 //         prog = (int) (Math.random() * 1000);
 //         b = String.valueOf(prog);
 //         //c =String.join(" ", c, b);

 //       String[] numbs = c.split(" ");
 //     if (numbs[a] > 9 && numbs[a] < 99) {
 //         System.out.print(numbs.replaceAll("[1-9][0-9]", "-1"));
 //     } else
 //         System.out.print(numbs);

 ////  // String [] numbs
 ////   for (String string:String )


 ////   System.out.println(c.replaceAll("[1-9][0-9]", "-1"));

   //   System.out.println(c);

//    }
//}
