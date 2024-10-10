package Pratik;
import java.util.Scanner;
public class Etkinlik {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sicaklik;
        System.out.print("Hava kaç derece? ");
        sicaklik= input.nextInt();

        if(sicaklik<5)
        {
            System.out.println("Kayak yapabilirsiniz!");
        }
        else if(sicaklik>=5 && sicaklik<15)
        {
            System.out.println("Sinemaya Gidebilirsiniz!");
        }
        else if(sicaklik>=15 && sicaklik<25 )
        {
            System.out.println("Pikniğe Gidebilirsiniz!");
        }
        else
        {
            System.out.println("Yüzmeye gidebilirsiniz!");
        }
    }
}

