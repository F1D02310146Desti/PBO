package Kalkulator;

import java.util.Scanner;

class Kalkulator {
    // Fungsi tambah dengan void
    public void tambah(int a, int b) {
        int hasil = a + b;
        System.out.println(a + " + " + b + " = " + hasil);
    }

    // Fungsi kali dengan void
    public void kali(int a, int b) {
        int hasil = a * b;
        System.out.println(a + " * " + b + " = " + hasil);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator calc = new Kalkulator();

        // Input untuk tambah
        System.out.print("Angka pertama Tambah: ");
        int x1 = scanner.nextInt();
        System.out.print("Angka kedua Tambah: ");
        int x2 = scanner.nextInt();

        // Panggil fungsi tambah (void)
        calc.tambah(x1, x2);

        // Input untuk kali
        System.out.print("Angka pertama Kali: ");
        int y1 = scanner.nextInt();
        System.out.print("Angka kedua Kali: ");
        int y2 = scanner.nextInt();

        // Panggil fungsi kali (void)
        calc.kali(y1, y2);

        scanner.close();
    }
}
