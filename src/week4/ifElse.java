package week4;

public class ifElse {
    public static void main(String[] args) {

        boolean isEmpty = true;
        if (isEmpty) {
            System.out.println("Please  go to gas station");

        } else {
            System.out.println("please go on");
        }

        int price = 1000;
        int cash = 900;

        if (cash >= price){
            System.out.println("I can afford it");
        }else{
            System.out.println("I can't afford it");
        }


    }
}
