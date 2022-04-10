import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //2 kenarı verilen üçgende hipotenüsü bulma..
        //değişkenlerimizi oluşturalım

     /*   int a,b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci kenari giriniz: ");
        a = input.nextInt();
        System.out.println("ikinci kenari giriniz: ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus: " + c); */

        int a,b,c, alan , cevre, u;
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci kenari giriniz: ");
        a = input.nextInt();
        System.out.println("Ikinci kenari giriniz: ");
        b = input.nextInt();
        System.out.println("Ucuncu kenari giriniz: ");
        c = input.nextInt();

        u = (a+b+c)/2;
        cevre = 2*u;

       alan = (int) Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Ucgenin cevresi: " + cevre);
        System.out.println("Ucgenin alani: " + alan);

    }
}
