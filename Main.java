public class Main {
    public static void main(String[] args) {
        Kue[] daftarKue = new Kue[20];

        daftarKue[0] = new KuePesanan("Brownies Coklat", 50000, 2);
        daftarKue[1] = new KueJadi("Nastar", 3000, 10);
        daftarKue[2] = new KuePesanan("Kue Lapis", 60000, 1.5);
        daftarKue[3] = new KueJadi("Donat Mini", 2000, 20);
        daftarKue[4] = new KuePesanan("Bika Ambon", 45000, 1);
        daftarKue[5] = new KueJadi("Kue Soes", 3500, 15);
        daftarKue[6] = new KuePesanan("Lemper Ayam", 40000, 2.2);
        daftarKue[7] = new KueJadi("Kue Cubit", 2500, 18);
        daftarKue[8] = new KuePesanan("Dadar Gulung", 30000, 1.8);
        daftarKue[9] = new KueJadi("Kue Serabi", 4000, 12);
        daftarKue[10] = new KuePesanan("Kue Mangkok", 28000, 2);
        daftarKue[11] = new KueJadi("Kue Putri Salju", 3200, 10);
        daftarKue[12] = new KuePesanan("Kue Klepon", 25000, 2.5);
        daftarKue[13] = new KueJadi("Kue Akar Kelapa", 3000, 14);
        daftarKue[14] = new KuePesanan("Kue Sus", 35000, 1.7);
        daftarKue[15] = new KueJadi("Kue Kering", 4500, 9);
        daftarKue[16] = new KuePesanan("Putu Ayu", 27000, 1.3);
        daftarKue[17] = new KueJadi("Kue Lemper", 3800, 17);
        daftarKue[18] = new KuePesanan("Onde-onde", 33000, 2);
        daftarKue[19] = new KueJadi("Kue Coklat", 5000, 11);

        double totalHargaSemua = 0;
        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;
        Kue kueHargaTerbesar = daftarKue[0];

        System.out.println("\n=== Daftar KuePesanan ===");
        for (Kue kue : daftarKue) {
            if (kue instanceof KuePesanan) {
                System.out.println(kue);

                double hargaKue = kue.hitungHarga();
                totalHargaSemua += hargaKue;
                totalHargaPesanan += hargaKue;
                totalBeratPesanan += ((KuePesanan) kue).getBerat();

                if (hargaKue > kueHargaTerbesar.hitungHarga()) {
                    kueHargaTerbesar = kue;
                }
            }
        }

        System.out.println("\n=== Daftar KueJadi ===");
        for (Kue kue : daftarKue) {
            if (kue instanceof KueJadi) {
                System.out.println(kue);

                double hargaKue = kue.hitungHarga();
                totalHargaSemua += hargaKue;
                totalHargaJadi += hargaKue;
                totalJumlahJadi += ((KueJadi) kue).getJumlah();

                if (hargaKue > kueHargaTerbesar.hitungHarga()) {
                    kueHargaTerbesar = kue;
                }
            }
        }

        System.out.println("\n=== Ringkasan Data ===");
        System.out.println("Total Harga Semua Kue: " + totalHargaSemua);
        System.out.println("Total Harga KuePesanan: " + totalHargaPesanan);
        System.out.println("Total Berat KuePesanan: " + totalBeratPesanan + " kg");
        System.out.println("Total Harga KueJadi: " + totalHargaJadi);
        System.out.println("Total Jumlah KueJadi: " + totalJumlahJadi + " pcs");
        System.out.println("\nKue dengan Harga Terbesar:");
        System.out.println(kueHargaTerbesar);
    }
}
