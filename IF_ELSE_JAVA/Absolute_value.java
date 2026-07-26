package IF_ELSE_JAVA;

import java.util.Scanner;

public class Absolute_value {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER");
        int n = sc.nextInt();
        if (n >= 0) System.out.println(n);
        else {
            System.out.println(-n);


        }

    }
}