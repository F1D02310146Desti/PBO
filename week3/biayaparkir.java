package Kalkulator;

import java.util.Scanner;

public class biayaparkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalBiaya = 0;
        int biayaMotor = 2000;
        int biayaMobil = 5000;

        System.out.print("Berapa hari masuk kampus mas? : ");
        int jumlahHari = input.nextInt();

        // perulangan untuk setiap hari
        for (int i = 1; i <= jumlahHari; i++) {
            System.out.print("Hari ke-" + i + " Ketik \n 1 = motor \n 2 = mobil : ");
            String jenis = input.next().toLowerCase();

            switch (jenis) {
                case "1" -> totalBiaya += biayaMotor;
                case "2" -> totalBiaya += biayaMobil;
                default -> System.out.println("Jenis kendaraan tidak valid. Lewati hari ini.");
            }
        }

        System.out.println("Total biaya parkir: Rp" + totalBiaya);

        input.close();
    }
}