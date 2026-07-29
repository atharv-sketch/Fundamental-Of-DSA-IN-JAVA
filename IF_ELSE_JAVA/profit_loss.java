package IF_ELSE_JAVA;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class profit_loss {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CP");
        int CP = sc.nextInt();
        System.out.println("Enter SP");
        int SP = sc.nextInt();
        //MTD--1
       if (SP > CP) System.out.println("Profit is "+(SP-CP));
       if (SP < CP) System.out.println("loss is" +(CP-SP) );
        if (CP == SP) System.out.println("No Return");
       // MTD--2
     // if (SP > CP) System.out.println("Profit is "+(SP-CP));
     //  else if (SP < CP) System.out.println("loss is" +(CP-SP) );
      // if (CP == SP) System.out.println("No Return");

    }
}