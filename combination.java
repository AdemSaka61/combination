import java.util.Scanner;


public class combination {
    public static void main(String[] args) {

        int n,r,total1=1, total2=1, total3=1;

        Scanner komp= new Scanner(System.in);

        System.out.print("İlk Kombinasyon Değerini Giriniz :");
        n= komp.nextInt();

        for(int i=1; i<=n; i++ ){
            total1=total1*i;
        }
        System.out.println(total1);


        System.out.print("İkinci Kombinasyon Değerini Giriniz :");
        r= komp.nextInt();
         for( int k=1; k<=r; k++){
             total2= total2*k;
         }
        System.out.println(total2);

         for (int t=1; t<=(n-r);t++){
             total3= total3*t;
         }
        System.out.println(total3);

         int comb;

         comb= total1/(total2*total3);
        System.out.println("Kombinasyon Sonucu :" +comb);

    }
}
