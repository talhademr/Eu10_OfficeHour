package week12.inheritance;

public class TranslatorObject {

    public static void main(String[] args) {

        TranslatorAhmet ahmet = new TranslatorAhmet("Ahmet","Arabic","Eygpt");
        System.out.println(ahmet.name);
        System.out.println(ahmet.language);
        System.out.println(ahmet.country);

        TranslatorKim park = new TranslatorKim("Park","korean","South Korea");
        System.out.println(park.country);
        System.out.println(park.name);
        System.out.println(park.language);

    }


}
