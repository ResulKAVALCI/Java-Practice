package Pratik;
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String password,username,WrongPassword="1234";
        System.out.print("Kullanıcı Adı: ");
        username=input.nextLine();
        System.out.print("Şifre: ");
        password=input.nextLine();

        switch(username){
            case "Ahmet":
                if(password.equals("1234"))
                {
                    System.out.println("Giriş Başarılı!");
                }
                else
                {
                    System.out.println("Şifre Hatalı!");

                }
                break;
            case "Resul":
                if(password.equals("Resul472!"))
                {
                    System.out.println("Giriş Başarılı");

                }
                else
                {
                    System.out.println("Şifre Hatalı");
                }
                break;
            default:
                System.out.println("Hatalı Kullanıcı Adı");
                break;
        }


    }




}
