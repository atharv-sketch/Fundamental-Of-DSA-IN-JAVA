package IF_ELSE_JAVA;

import java.util.Scanner;

public class Divisible_by_5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive number");
        int n = sc.nextInt();
        if(n % 5 == 0)
        {
            System.out.println("TRUE");
        }
        else{
            System.out.println("False");
        }
    }

}
