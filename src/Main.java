import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int hak=2;
Scanner veri=new Scanner(System.in);
Random sayi=new Random ();



while (hak>=0)
{
    System.out.println("1-6 arası sayı giriniz..");
    int gelen=veri.nextInt();
    int zar=sayi.nextInt(6)+1;
    System.out.println("kullanici:"+gelen);
    System.out.println("zar:"+zar);
    if(gelen==zar)
    {
        System.out.println("tevrikler bildinz..");
System.out.println("oyun bitti");
 break;
    }
    if(hak==0)
    {  System.out.println("hakkınız kalmadı..");
        System.out.println("kullanici:"+gelen);
        System.out.println("zar:"+zar);
        System.out.println("oyun bitti");

    }
 System.out.println("kalan hakkınız:"+hak);
    hak--;

}

    }
}