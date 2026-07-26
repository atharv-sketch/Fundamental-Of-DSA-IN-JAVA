package IF_ELSE_JAVA;

import java.util.Scanner;

public class isinteger
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        double n = sc.nextDouble();
        int x = (int) n;
        if (n - x > 0) System.out.println("Not an integer");
        else System.out.println("is a integer");
    }
}

