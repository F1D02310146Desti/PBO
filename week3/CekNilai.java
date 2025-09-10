package Kalkulator;

import java.util.Scanner;

class CekNilai {
    // Fungsi untuk mengecek nilai
    public void cekNilai(int nilai) {
        // Cek Lulus / Tidak Lulus
        if (nilai >= 60) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Tidak Lulus");
        }

        // Cek Grade
        if (nilai >= 85 && nilai <= 100) {
            System.out.println("Grade: A");
        } else if (nilai >= 70 && nilai <= 84) {
            System.out.println("Grade: B");
        } else if (nilai >= 60 && nilai <= 69) {
            System.out.println("Grade: C");
        } else if (nilai >= 50 && nilai <= 59) {
            System.out.println("Grade: D");
        } else if (nilai >= 0 && nilai <= 49) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Nilai tidak valid!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CekNilai program = new CekNilai();

        System.out.println("Masukkan nilai mahasiswa (0-100).");
        System.out.println("Ketik -1 untuk berhenti.\n");

        while (true) {
            System.out.print("Masukkan nilai: ");
            int nilai = scanner.nextInt();

            if (nilai == -1) { // tanda berhenti
                break;
            }

            program.cekNilai(nilai);
            System.out.println(); // biar output rapi
        }

        System.out.println("Program selesai. Terima kasih!");
        scanner.close();
    }
}
