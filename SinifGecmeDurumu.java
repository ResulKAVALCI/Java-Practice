package Pratik;
import java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat, turkce, kimya, muzik, fizik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        double ortalama = (double) (mat + turkce + kimya + fizik + muzik) / 5;
        boolean GecerliNotmu=(mat>0 && mat<100);

        if (GecerliNotmu)
        {
            if (ortalama > 55)
            {
                System.out.println("Ortalamanız: " + ortalama);
                System.out.println("Tebrikler! Sınıfı Geçtiniz.");
            }
            else
            {
                System.out.println("Ortalamanız: " + ortalama);
                System.out.println("Maalesef kaldınız! ");
            }

        }
        else
        {
            System.out.println("Maalesef kaldınız!");
        }
    }
}
