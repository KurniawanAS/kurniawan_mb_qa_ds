public class Kalkulator {
    public double hitung(int pilihan, double angka1, double angka2) {
        switch (pilihan) {
            case 1:
                return penjumlahan(angka1, angka2);
            case 2:
                return pengurangan(angka1, angka2);
            case 3:
                return perkalian(angka1, angka2);
            case 4:
                return pembagian(angka1, angka2);
            case 5:
                return modulus(angka1, angka2);
            default:
                return Double.NaN;
        }
    }

    private double penjumlahan(double angka1, double angka2) {
        return angka1 + angka2;
    }

    private double pengurangan(double angka1, double angka2) {
        return angka1 - angka2;
    }

    private double perkalian(double angka1, double angka2) {
        return angka1 * angka2;
    }

    private double pembagian(double angka1, double angka2) {
        if (angka2 == 0) {
            System.out.println("Error: Pembagian dengan nol tidak dapat dilakukan");
        }
        return angka1 / angka2;
        // } else {
        //     return angka1 / angka2;
        // }
    }

    private double modulus(double angka1, double angka2) {
        return angka1 % angka2;
    }
}
