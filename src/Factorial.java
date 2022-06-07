import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, total = 1;

        System.out.print("Lutfen Faktoriyelini Hesaplamak Istediginiz Sayiyi Giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            total *= i;
        }

        if (n <= 0) {
            System.out.print("Hatali Bir Deger Girdiniz, Lutfen Tekrar Deneyiniz ! ");
        } else {
            System.out.print("Sonuc : " + total);
        }
    }
}