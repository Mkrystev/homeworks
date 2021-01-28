package com.academy.secondhomework;

import java.util.Scanner;

public class WhichIsBigger {
    public static void biggerDigitIs() {
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 random digits and the biggest one wll be shown.");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if ((a > b && b >= c) || (a == b && b > c))
            System.out.println("The biggest one is " + a);
        else if ((b > a && a >= c) || (b == a && a > c))
            System.out.println("The biggest one is " + b);
        else if ((c > b && b >= a) || (c == b && b > a))
            System.out.println("The biggest one is " + c);
        else if (a == b && b == c)
            System.out.println("Ther are equal.");
    }
}
