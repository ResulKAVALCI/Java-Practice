package Pratik;
import java.util.Scanner;
public class SayiYazdirma {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int limit,a=1,b=0;

        System.out.println("Limit sayıyı giriniz: ");
        limit=input.nextInt();

        for(int i=0;i<limit;i++)
        {
          b=a+=1;
          b++;


    }

        System.out.println("sonuç: "+b);








    }
}
