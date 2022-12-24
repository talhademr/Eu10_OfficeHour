package week4;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you browser name:");
        String browserType = scanner.nextLine();;

        switch (browserType){
            case "firefox":
                System.out.println("firefox is being set up");
                break;
            case "chrome":
                System.out.println("chrome is being set up");
                break;
            case "edge":
                System.out.println("edge is being set up");
                break;
            default:
                System.out.println("please enter a valid browser name");
        }


    }
}
