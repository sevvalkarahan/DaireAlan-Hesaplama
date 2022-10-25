import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {
        double pi=3.14;
        Scanner klavye=new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        double r=klavye.nextDouble();
        System.out.print("Daire diliminin merkez açısını girinz: ");
        double a=klavye.nextDouble();
        double daire_alanı=pi*r*r;
        double alan=(pi*(r*r)*a)/360;
        System.out.println("Dairenin alanı "+daire_alanı+" derecedir.");
        System.out.println("Dairenin diliminin alanı "+alan+" derecedir.");


    }
}
