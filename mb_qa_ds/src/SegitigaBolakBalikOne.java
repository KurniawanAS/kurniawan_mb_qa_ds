import java.util.Scanner;

/*
 Membuat segitiga sebagai berikut, dengan asumsi input 5 maka hasilnya akan:

 *
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 * 

 */

public class SegitigaBolakBalikOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = scanner.nextInt();
        
        for (int i = 1; i <= tinggi * 2 - 1; i++) {
            int batas = i;
            if (i > tinggi) batas = 2 * tinggi - i;
            for (int j = 0; j < batas; j++) System.out.print("*");
            System.out.println();
        }
    }
}