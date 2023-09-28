import java.util.Scanner;
/**
 * PemilihanPerobaan304
 */
public class PemilihanPerobaan304 {

    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);
        
        double angka1, angka2, hasil;
        char operator;

        System.out.println("Masukkan angka pertama: ");
        angka1 = input04.nextDouble();
        System.out.println("Masukkan angka kedua: ");
        angka2 = input04.nextDouble();
        System.out.println("Masukkan operator (+ - * /): ");
        operator = input04.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + "=" + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + "=" + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + "=" + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + "=" + hasil);
                break;
        }

    }
}