import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class FOURDIGIT_NUMBER {
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FOUR DIGIT NUMBER");
        int n= sc.nextInt();
        if (n>999 && n<10000) System.out.println("yes,it is a 4 digit number");
        else System.out.println("not a four digit number");
        sc.close();

    }
}
