package week4;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        String name = "Talha";

        Scanner input = new Scanner(System.in);

        System.out.println("please enter name");
        String nameUser = input.nextLine();
        System.out.println("nameUser =" + nameUser);

        System.out.println("enter age");
        int age = input.nextInt();
        System.out.println("age of user is "+ age);

        System.out.println("please enter full name");
        String fullName = input.next();
        System.out.println("fullName = " + fullName);

    }
}
