package Pratik;
import java.util.Scanner;
public class UcakBiletFiyatHesaplama {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int mesafe,yas,yolculukTipi;
        double indirimliTutar;


        System.out.print("Uçuş mesafenizi KM cinsinden giriniz: ");
        mesafe=input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas=input.nextInt();

        System.out.print("Uçuşunuzun yolculuk tipini belirtiniz(Tek Yön => 1,Gidiş-Dönüş => 2 ): ");
        yolculukTipi=input.nextInt();

        double normalTutar = mesafe*0.10;
        double toplamTutar;
       if(mesafe>0)
       {
           if(yas>0)
           {
               if(yolculukTipi==1)
               {
                   if(yas<12)
                   {
                       toplamTutar=normalTutar-(normalTutar*0.50);
                       System.out.println("Toplam Tutar = "+toplamTutar);
                   }
                   else if(yas>12 && yas<24)
                   {
                       toplamTutar=normalTutar-(normalTutar*0.10);
                       System.out.println("Toplam Tutar = "+toplamTutar);
                   }
                   else if(yas>65)
                   {
                       toplamTutar=normalTutar-(normalTutar*0.30);
                       System.out.println("Toplam Tutar = "+toplamTutar);
                   }
                   else
                   {
                       toplamTutar=normalTutar;
                       System.out.println("Toplam Tutar = "+toplamTutar);
                   }
               }
               else if(yolculukTipi==2)
               {
                   if(yas<12)
                   {
                       indirimliTutar=normalTutar-(normalTutar*0.50);
                       toplamTutar=indirimliTutar-(indirimliTutar*0.20);
                       toplamTutar=toplamTutar*2;
                       System.out.println("Toplam Tutar = "+toplamTutar);
                   }
                   else if(yas>12 && yas<24)
                   {
                       indirimliTutar=normalTutar-(normalTutar*0.10);
                       toplamTutar=indirimliTutar-(indirimliTutar*0.20);
                       toplamTutar=toplamTutar*2;
                       System.out.println("Toplam Tutar = "+toplamTutar);
                   }
                   else if(yas>65)
                   {
                       indirimliTutar=normalTutar-(normalTutar*0.30);
                       toplamTutar=indirimliTutar-(indirimliTutar*0.20);
                       toplamTutar=toplamTutar*2;
                       System.out.println("Toplam Tutar = "+toplamTutar);
                   }
                   else
                   {
                       toplamTutar=(normalTutar-(normalTutar*0.20))*2;
                       System.out.println("Toplam Tutar = "+toplamTutar);
                   }
               }
               else
               {
                   System.out.println("Hatalı Veri Girişi! ");
               }

           }
           else
           {
               System.out.println("Hatalı Veri Girişi!");
           }

       }
       else
       {

           System.out.println("Hatalı Veri Girişi! ");


       }




    }
}
