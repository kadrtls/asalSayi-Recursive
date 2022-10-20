import java.util.Scanner;

public class Main {

    static int asalMi(){
                Scanner scanner=new Scanner(System.in);
                int sayi=scanner.nextInt();
                boolean asalmi=true;
                //1 sayısı ve negatif sayılar asal olmadığından ekrana değildir yazdırırız
                if (sayi<1){
                    System.out.println("Negatif sayılar asal değildir");
                    return sayi;
                }

                if (sayi==1){
                    System.out.println("sayı asal değildir");
                    return 1;
                }
                //girilen sayıya kadar olan tüm sayılara bölüyoruz böylece asal olup olmadığını anlıyoruz
                for (int i=2;i<sayi;i++){
                    if (sayi % i==0){
                        asalmi=false;
                    }
                }
                if (asalmi){
                    System.out.println("sayı asladır");
                }else {
                    System.out.println("sayı asal değildir");
                }
        return 0;
    }


    public static void main(String[] args) {
        asalMi();
    }
}