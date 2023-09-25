import java.util.Scanner;
/**
 * PemilihanPercobaan104
 */
public class PemilihanPercobaan104 {

    public static void main(String[] args) {
        
        Scanner input04 = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = input04.nextInt();

        if (angka % 2 == 0)
            System.out.println("Angka "+angka+" bilangan genap");
        else
            System.out.println("Angka "+angka+" bilangan ganjil");
    }
}