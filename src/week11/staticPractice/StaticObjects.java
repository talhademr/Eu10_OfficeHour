package week11.staticPractice;

public class StaticObjects {

    static StaticPractice sp = new StaticPractice();
    static StaticPractice sp1 = new StaticPractice();
    static StaticPractice sp2 = new StaticPractice();
    static StaticPractice sp3 = new StaticPractice();


    public static void main(String[] args) {

        System.out.println(sp.a);
        //üstte bi hata var, büyük bir hata değil ama objec t üzerinden a variableını çağırmayı önermiyor complier
        //çünkü a static bir object ve, yeni bi obje oluşturup( new ile) bu obje üzerinden çağırsanda işi değişmiyor
        // mal yine aynı, her zaman a nın static değeri neyse o değeri bulucaz sonuç olarak
        System.out.println(sp.b);

        System.out.println(StaticPractice.a);
        StaticPractice.method2();

        sp.method1();
        sp.method2();

    }

}
