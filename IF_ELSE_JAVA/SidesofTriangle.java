package IF_ELSE_JAVA;

import java.util.Scanner;

public class SidesofTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER 1st SIDE OF TRIANGLE");
        int a = sc.nextInt();
        System.out.println("ENTER 2nd SIDE OF TRIANGLE");
        int b = sc.nextInt();
        System.out.println("ENTER 3rd SIDE OF TRIANGLE");
        int c = sc.nextInt();

        if (a+b>c && b+c>a && c+a>b)
        System.out.println("valid triangle");
        else System.out.println("not a valid triangle" );

    }
}
