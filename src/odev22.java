import java.util.Scanner;

public class odev22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b=0, c = 0, d;
        System.out.print("Lutfen bir sayi giriniz : ");
        a = input.nextInt();
        d = a;
        while (a != 0){

            b += a % 10;
            a/=10;
            ++c;
        }
        // System.out.println(c); // basamak sayısı test
        System.out.println("\n" + d + " Sayisinin Rakamlarinin Toplami : " + b);
    }
}
