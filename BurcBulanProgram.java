package Pratik;
import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {

        int gun,ay;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ay: ");
        ay=input.nextInt();

        System.out.print("Doğduğunuz gün: ");
        gun= input.nextInt();
if(ay>0 && ay<=12)
{
    switch(ay)
    {

        case 1:
            if(gun>0 && gun<=31)
            {
                if(gun<=19)
                {
                    System.out.println("Oğlak Burcusunuz!");
                }
                else
                {
                    System.out.println("Kova Burcusunuz!");
                }

            }
            else
            {
                System.out.println("Hatalı gün girişi!");
            }
            break;
        case 2:
            if(gun>0 && gun<=28)
            {
                if(gun<=18)
                {
                    System.out.println("Kova Burcusunuz!");
                }
                else
                {
                    System.out.println("Balık Burcusunuz!");
                }

            }
            else
            {
                System.out.println("Hatalı gün girişi!");
            }
            break;
        case 3:
            if(gun>0 && gun<=31)
            {
                if(gun<=20)
                {
                    System.out.println("Balık Burcusunuz!");
                }
                else
                {
                    System.out.println("Koç Burcusunuz!");
                }

            }
            else
            {
                System.out.println("Hatalı gün girişi!");
            }
            break;
        case 4:
            if(gun>0 && gun<=30)
            {
                if(gun<=20)
                {
                    System.out.println("Koç Burcusunuz!");
                }
                else
                {
                    System.out.println("Boğa Burcusunuz!");
                }

            }
            else
            {
                System.out.println("Hatalı gün girişi!");
            }
            break;
        case 5:
            if(gun>0 && gun<=31)
            {
                if(gun<=21)
                {
                    System.out.println("Boğa Burcusunuz!");
                }
                else
                {
                    System.out.println("İkizler Burcusunuz!");
                }

            }
            else
            {
                System.out.println("Hatalı gün girişi!");
            }
            break;
        case 6:
            if(gun>0 && gun<=30)
            {
                if(gun<=20)
                {
                    System.out.println("İkizler Burcusunuz!");
                }
                else
                {
                    System.out.println("Yengeç Burcusunuz!");
                }

            }
            else
            {
                System.out.println("Hatalı gün girişi!");
            }
            break;
        case 7:
            if(gun>0 && gun<=31)
            {
                if(gun<=22)
                {
                    System.out.println("Yengeç Burcusunuz!");
                }
                else
                {
                    System.out.println("Aslan Burcusunuz!");
                }

            }
            else
            {
                System.out.println("Hatalı gün girişi!");
            }
            break;
        case 8:
            if(gun>0 && gun<=31)
            {
                if(gun<=22)
                {
                    System.out.println("Aslan Burcusunuz!");
                }
                else
                {
                    System.out.println("Başak Burcusunuz!");
                }

            }
            else
            {
                System.out.println("Hatalı gün girişi!");
            }
            break;
        case 9:
            if(gun>0 && gun<=30)
            {
                if(gun<=22)
                {
                    System.out.println("Başak Burcusunuz!");
                }
                else
                {
                    System.out.println("Terazi Burcusunuz!");
                }

            }
            else
            {
                System.out.println("Hatalı gün girişi!");
            }
            break;
        case 10:
            if(gun>0 && gun<=31)
            {
                if(gun<=22)
                {
                    System.out.println("Terazi Burcusunuz!");
                }
                else
                {
                    System.out.println("Akrep Burcusunuz!");
                }

            }
            else
            {
                System.out.println("Hatalı gün girişi!");
            }
            break;
        case 11:
            if(gun>0 && gun<=30)
            {
                if(gun<=22)
                {
                    System.out.println("Akrep Burcusunuz!");
                }
                else
                {
                    System.out.println("Yay Burcusunuz!");
                }

            }
            else
            {
                System.out.println("Hatalı gün girişi!");
            }
            break;
        case 12:
            if(gun>0 && gun<=31)
            {
                if(gun<=21)
                {
                    System.out.println("Yay Burcusunuz!");
                }
                else
                {
                    System.out.println("Oğlak Burcusunuz!");
                }
                break;
            }
            else
            {
                System.out.println("Hatalı gün girişi!");
            }

    }
}
else
{
    System.out.println("Hatalı Ay girişi!");
}

    }
}
