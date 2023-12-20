import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        Scanner input = new Scanner(System.in);

        System.out.println("=== Kalkulator Sederhana ===");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        System.out.println("Pilih operasi yang diinginkan:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.println("5. Modulus (%)");
        System.out.print("Masukkan pilihan (1/2/3/4/5): ");
        int pilihan = input.nextInt();

        double hasil = kalkulator.hitung(pilihan, angka1, angka2);
        switch (pilihan) {
            case 1:
                System.out.println("Hasil dari " + angka1 + " + " + angka2 + " adalah: " + hasil);
                break;
            case 2:
                System.out.println("Hasil dari " + angka1 + " - " + angka2 + " adalah: " + hasil);
                break;
            case 3:
                System.out.println("Hasil dari " + angka1 + " x " + angka2 + " adalah: " + hasil);
                break;
            case 4:
                System.out.println("Hasil dari " + angka1 + " : " + angka2 + " adalah: " + hasil);
                break;
            case 5:
                System.out.println("Hasil dari " + angka1 + " % " + angka2 + " adalah: " + hasil);
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }
}