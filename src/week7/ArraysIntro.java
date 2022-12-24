package week7;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {
        //Array can hold multiple values
        // but variable can hold only one

        int [] nums;
        int number[];

        String [] names;
        String lastnames[];

        boolean [] isSunny = new boolean[7];
        boolean[] isSunnyAnkara = {true, false, true, false, true, false, true};

        System.out.println(Arrays.toString(isSunnyAnkara));
        System.out.println(Arrays.toString(isSunny));

        int numbers[] = new int[5];
        System.out.println(Arrays.toString(numbers));

        String gender[] = new String[6];
        System.out.println(Arrays.toString(gender));


//        int double boolean
//        String, Arrays

        numbers[0] = 5;
        numbers[1] = 50;
        numbers[2] = 500;
        numbers[3] = 5000;
        numbers[4] = 50000;
//        numbers[5] = 500000;
        System.out.println(Arrays.toString(numbers));


        isSunnyAnkara[0] = false;
        System.out.println(Arrays.toString(isSunnyAnkara));


    }
}
