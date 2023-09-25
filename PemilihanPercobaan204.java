import java.util.Scanner;
/**
 * PemilihanPercobaan204
 */
public class PemilihanPercobaan204 {

    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);

        System.out.println("Nilai UAS   : ");
        float UAS = input04.nextFloat();
        System.out.println("Nilai UTS   : ");
        float UTS = input04.nextFloat();
        System.out.println("Nilai Kuis  : ");
        float Kuis = input04.nextFloat();
        System.out.println("Nilai Tugas : ");
        float Tugas = input04.nextFloat();

        float total = (UAS * 0.4F) + (UTS * 0.3F) + (Kuis * 0.1F) + (Tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak Remidi";

        System.out.println("Nilai Akhir = " + total + " sehingga " + message);
    }
}