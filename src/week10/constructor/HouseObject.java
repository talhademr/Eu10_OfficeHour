package week10.constructor;

public class HouseObject {
    public static void main(String[] args) {

        /*
        House house = new House();
        house.address= "chiago";
        house.year = 1970;
        house.type ="mansion";
         */

        House house1 = new House("New York");
        System.out.println(house1.address);


        House house2= new House("ankara", 1990);
        System.out.println(house2.year);
        System.out.println(house2.address);


    }



}
