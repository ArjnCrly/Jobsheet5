import java.util.Scanner;
public class Tugas5 {
    public static void main(String[] args) {
        Scanner input5 = new Scanner(System.in);

        System.out.println("Jarak Pertarungan: ");
        int Jarak = input5.nextInt();

        String result = (Jarak <= 5) ? "Melee Weapon" : "Ranged Weapon";
        System.out.println("Jarak Pertarungan " +Jarak+ "m Jenis Senjata " + result);
    }
}
