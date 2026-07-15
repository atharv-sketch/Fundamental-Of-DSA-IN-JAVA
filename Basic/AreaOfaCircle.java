package Basic.DirectResult;

import java.util.Scanner;

public class AreaOfaCircle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        double r = sc.nextDouble();
        double a = 3.141592 * r * r;
        System.out.println("Area is:");
        System.out.println(a);


    }
}
// sc .next double is directly used to calculate the value in the output box

