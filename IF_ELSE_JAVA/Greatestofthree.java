package IF_ELSE_JAVA;

import java.util.Scanner;

public class Greatestofthree {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER 1st NUMBER");
        int a = sc.nextInt();
        System.out.println("ENTER 2nd NUMBER");
        int b = sc.nextInt();
        System.out.println("ENTER 3rd NUMBER");
        int c = sc.nextInt();

        if (a>b && a>c )
        {
            System.out.println("a");
        }
        else if (b>a && b>c)System.out.println("b" );
        else System.out.println(c);

    }
}
