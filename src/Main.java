
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Ücret değerini giriniz:");


        double KDVsiz,KDVli,KDV;
        KDVsiz=input.nextInt();

        if (KDVsiz<1000)
        {

            System.out.println("KDV'siz fiyat:" + KDVsiz);
            System.out.println("KDV'li fiyat:" + (KDVsiz * 1.18));
            System.out.println("KDV orani:" + 1.8);
        }
       else{
            System.out.println("KDV'siz fiyat:" + KDVsiz);
            System.out.println("KDV'li fiyat:" + (KDVsiz * 1.08));
            System.out.println("KDV orani:" + 0.8);
        }


    }
}