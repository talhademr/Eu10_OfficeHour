package week5;

public class StringPractice {
    public static void main(String[] args) {

//        String s1 = "hat";
//        String s2 = new String("hat");
//
//        System.out.println(s1.equals(s2));

//        System.out.println(s1 == s2);
//
//        String s3 = "hat";
//        System.out.println(s1 == s3);
//
//        s3 = "bag";
//
//        System.out.println(s3);



//          checkLength();
//          trimMethod();
//          indexMethod();
//          substringMethod();
//          isEmptyBlank();



    }


    public static void checkLenght(){
        System.out.println("house".charAt(0));
        System.out.println("How much is the_lenght of this **** statement?".length());
    }

    public static void trimMethod(){
        System.out.println(" This is a .trim method, practice . ".trim());
        System.out.println(" This is a .trim method, practice . ".replace(" ", ""));
    }

    public static void indexMethod(){
        String data = "Hello, World";
        System.out.println(data.indexOf('o'));
        System.out.println(data.lastIndexOf("o"));
        char o = 'o';
        String o1 = "o";

    }

    public static void substringMethod(){
        String data = "This is substring practice";
        String subData1 = data.substring(5);
        String subData2 = data.substring(5,10); // not including ending index
        System.out.println(subData1);
        System.out.println(subData2);
        System.out.println(data.repeat(3));
    }

    public static void isEmptyBlank(){
        String data = "";
        String data1 = " ";
        System.out.println(data.isEmpty());
        System.out.println(data1.isEmpty());
//
        System.out.println(data1.isBlank());
        System.out.println(data.isBlank());

    }

    public static void equalsMethod() {
        String DATA = "PRACTICE";
        String data = "practice";
        System.out.println(DATA.equals(data));
        System.out.println(DATA.equalsIgnoreCase(data));
    }

    public static void containsMethod(){
        System.out.println("Umbrella".contains("e"));
        System.out.println("Umbrella".contains("Umb"));
        System.out.println("Umbrella".contains("umb"));
    }

    public static void startsOrEnds() {
        String data = "abcdefgh";
        System.out.println(data.startsWith("abc"));
        System.out.println(data.startsWith("A")); // false
        System.out.println(data.endsWith("h"));
        System.out.println(data.endsWith("H"));
    }



}
