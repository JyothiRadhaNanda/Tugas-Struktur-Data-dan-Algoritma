public class Tugas1 {
    public static void main(String[] args) {
    //============= 1 ==============//
    /*
    Pseudocode:
    1. Ketahui harga gula (misal: 11.000)
    2. Ketahui harga diskon (misal: 10%)
    3. Tentukan berapa banyak ingin membeli gula (misal: 2 kilo)
    4. Hitung total harga sebelum diskon: totalHarga = hargaGula * jumlahKilo
    5. Hitung potongan harga: potongan = totalHarga * diskon / 100
    6. Hitung harga akhir: hargaAkhir = totalHarga - potongan
    7. Tampilkan harga yang harus dibayar
    */
    int hargaGula = 11000;
    int diskon = 10;
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("Masukkan jumlah gula (dalam kilo): ");
    int banyakGula = scanner.nextInt();
    int totalHarga = hargaGula * banyakGula;
    int potongan = totalHarga * diskon / 100;
    int hargaAkhir = totalHarga - potongan;
    System.out.println("Harga yang harus dibayar: " + hargaAkhir);
    //============= 2 ==============//
    /*
    Pseudocode:
    1. Mulai
    2. Masukkan gaji pokok (misal: 4.000.000)
    3. Hitung tunjangan (20% x gaji pokok)
    4. Hitung pajak (15% x (gaji pokok + tunjangan))
    5. Hitung gaji bersih (gaji pokok + tunjangan - pajak)
    6. Tampilkan gaji bersih
    7. Selesai
    */
    int gajiPokok = 4000000;
    int tunjangan = gajiPokok * 20 / 100;
    System.out.print("Masukkan gaji pokok: ");
    gajiPokok = scanner.nextInt();
    tunjangan = gajiPokok * 20 / 100;
    int pajak = (gajiPokok + tunjangan) * 15 / 100;
    int gajiBersih = gajiPokok + tunjangan - pajak;
    System.out.println("Gaji bersih: " + gajiBersih);
    //============= 3 ==============//
    /*
    Pseudocode:
    1. Mulai
    2. Masukkan nilai jam
    3. Masukkan nilai menit
    4. Masukkan nilai detik
    5. Hitung total nilai detik: totalDetik = (jam * 3600) + (menit * 60) + detik
    6. Tampilkan total detik
    7. Selesai
    */
    System.out.print("Masukkan nilai jam: ");
    int jam = scanner.nextInt();
    System.out.print("Masukkan nilai menit: ");
    int menit = scanner.nextInt();
    System.out.print("Masukkan nilai detik: ");
    int detik = scanner.nextInt();
    int totalDetik = (jam * 3600) + (menit * 60) + detik;
    System.out.println("Total detik: " + totalDetik);
    //============= 4 ==============//
    /*
    Pseudocode:
    1. Mulai
    2. Masukkan total detik percakapan telepon
    3. Hitung jumlah jam: jam = totalDetik / 3600
    4. Hitung sisa detik setelah jam: sisaDetik = totalDetik % 3600
    5. Hitung jumlah menit: menit = sisaDetik / 60
    6. Hitung sisa detik setelah menit: detik = sisaDetik % 60
    7. Tampilkan hasil jam, menit, dan detik
    8. Selesai
    */
    System.out.print("Masukkan total detik percakapan telepon: ");
    totalDetik = scanner.nextInt();
    int jam1 = totalDetik / 3600;
    int sisaDetik = totalDetik % 3600;
    System.out.print("Masukkan nilai menit: ");
    int menit1 = scanner.nextInt();
    detik = sisaDetik % 60;
    System.out.println("Hasil: " + jam1 + " jam " + menit1 + " menit " + detik + " detik");
    scanner.close();
    }
}