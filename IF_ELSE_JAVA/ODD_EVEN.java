package IF_ELSE_JAVA;

import java.util.Scanner;

public class ODD_EVEN {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("EVEN NUMBER");
            System.out.println("vishii weds atharv");
        }
        else{
            System.out.println("ODD NUMBER");
            System.out.println("sradhha wed shanu");
        }


    }
}

