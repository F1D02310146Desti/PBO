package Kalkulator;
import java.util.Scanner;

public class hitung {
    // Fungsi tambah
    public int tambah(int a, int b) {
        return a + b;
    }

    // Fungsi kali
    public int kali(int a, int b) {
        return a * b;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        hitung calc = new hitung();

        // Input pertama (untuk tambah)
        System.out.print("Masukkan angka pertama untuk tambah: ");
        int x1 = scanner.nextInt();
        System.out.print("Masukkan angka kedua untuk tambah: ");
        int x2 = scanner.nextInt();

        // Panggil fungsi tambah
        int hasilTambah = calc.tambah(x1, x2);
        System.out.println(x1 + " + " + x2 + " = " + hasilTambah);

        // Input kedua (untuk kali)
        System.out.print("Masukkan angka pertama untuk kali: ");
        int y1 = scanner.nextInt();
        System.out.print("Masukkan angka kedua untuk kali: ");
        int y2 = scanner.nextInt();

        // Panggil fungsi kali
        int hasilKali = calc.kali(y1, y2);
        System.out.println(y1 + " * " + y2 + " = " + hasilKali);

        scanner.close();
    }
}
