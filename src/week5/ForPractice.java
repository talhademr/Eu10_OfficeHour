package week5;

import java.util.Scanner;

public class ForPractice {
    public static void main(String[] args) {

        // practice1();
        // practice2();
        // practice3();


    }



    // count from 0 to 10;
    public static void practice1(){
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
    }

    // Write a program to calculate the sum of first 10 natural number.
    public static void practice2(){
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    //Write a program that prompts the user to input a positive integer.
    // It should then print the multiplication table of that number.
    public static void practice3(){

        Scanner scan =new Scanner(System.in);
        int num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }



    }

    /*

     *
     **
     ***
     ****
     *****

     */
    public static void practice4(){
        for (int i = 1; i < 6; i++) {
            System.out.println("*".repeat(i));
        }
    }

           /*
          1 8boşluk
        222 5boşluk
      33333 3boşluk
    4444444 1boşluk
  555555555 0boşluk
     */

    public static void practice5(){
        for (int i = 0; i < 5; i++) {
            System.out.println(" ".repeat(9-i*2+1) + String.valueOf(i+1).repeat(i*2+1));
        }
    }

    // reverse a string
    // home   --> emoh
    public static void practice6(){
        String data = "laptop";
        String result = "";
        for (int i = data.length()-1; i >=0 ; i--) {
            result += data.charAt(i);
        }
        System.out.println("result = " + result);
    }





}
