package Test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double x;
        double y;

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie x ein:");
        x = Double.parseDouble(scan.nextLine());

        System.out.println("Geben Sie y ein: ");
        y = Double.parseDouble(scan.nextLine());

        System.out.println("Arithmeisches Mittel: " + (x + y)/2);
        System.out.println("Harmonisches Mittel: " + (2/((1/x)+(1/y))));



    }
}
