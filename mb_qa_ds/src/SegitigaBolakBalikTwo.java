import java.util.Scanner;

/*
 Membuat segitiga sebagai berikut, dengan asumsi input 5 maka hasilnya akan:

 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * *
 * * * *
 * * *
 * *
 * 

 */

public class SegitigaBolakBalikTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = scanner.nextInt();
        
        for (int i=0;i<=tinggi*2;i++) {
            for (int j=0;j<=i;j++) {
                if (i < tinggi || i+j < tinggi*2) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}