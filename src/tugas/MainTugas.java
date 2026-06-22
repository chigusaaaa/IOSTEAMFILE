// Nama: Eldimas Eka Arista
// NPM : 2110010414
package tugas;

public class MainTugas {
    public static void main(String[] args) {
       
        String[] kategori = {"Elektronik", "Makanan", "Pakaian"};
        System.out.println("== Daftar Kategori ==");
        for (String k : kategori) {
            System.out.println("- " + k);
        }
        System.out.println();

       
        Gudang gudang = new Gudang("barang.txt");
        gudang.tambahBarang(new Barang("Mouse", 50000, 20));
        gudang.tambahBarang(new Barang("Keyboard", 120000, 15));
        gudang.tambahBarang(new Barang("Indomie", 3500, 100));
        gudang.tambahBarang(new Barang("Kaos", 45000, 30));
        gudang.tambahBarang(new Barang("Sepatu", 250000, 10));

        gudang.tampilkanSemua();
        gudang.simpanKeBerkas();
        System.out.println();

       
        Gudang gudangLain = new Gudang("barang.txt");
        gudangLain.muatDariBerkas();
        gudangLain.tampilkanSemua();
        System.out.println("Total nilai persediaan: Rp" + gudangLain.totalNilai());
    }
}
