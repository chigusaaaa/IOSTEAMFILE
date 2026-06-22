// Nama: [isi nama kamu]
// NPM : [isi NPM kamu]
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        // Array kategori, ukuran tetap (sesuai instruksi: minimal 3)
        String[] kategori = {"Elektronik", "Makanan", "Pakaian"};
        System.out.println("== Daftar Kategori ==");
        for (String k : kategori) {
            System.out.println("- " + k);
        }
        System.out.println();

        // Membuat objek pengelola dan mengisinya (minimal 5 barang)
        Gudang gudang = new Gudang("barang.txt");
        gudang.tambahBarang(new Barang("Mouse", 50000, 20));
        gudang.tambahBarang(new Barang("Keyboard", 120000, 15));
        gudang.tambahBarang(new Barang("Indomie", 3500, 100));
        gudang.tambahBarang(new Barang("Kaos", 45000, 30));
        gudang.tambahBarang(new Barang("Sepatu", 250000, 10));

        gudang.tampilkanSemua();
        gudang.simpanKeBerkas();
        System.out.println();

        // Membuktikan data tersimpan: objek baru, muat ulang dari berkas
        Gudang gudangLain = new Gudang("barang.txt");
        gudangLain.muatDariBerkas();
        gudangLain.tampilkanSemua();
        System.out.println("Total nilai persediaan: Rp" + gudangLain.totalNilai());
    }
}