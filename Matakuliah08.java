public class Matakuliah08 {
    String kodeMK,namaMK;
    int sks, jumlahJam;

    public Matakuliah08() {
    }

    public Matakuliah08(String kodeMK, String namaMK, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    
    void tampilkanInformasi() {
        System.out.println("Kode Matakuliah     : " + kodeMK);
        System.out.println("Nama Matakuliah     : " + namaMK);
        System.out.println("SKS                 : " + sks);
        System.out.println("Jumlah Jam          : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi " + sks);
    }

    void tambahJam(int jumlahJamBaru) {
        jumlahJam += jumlahJamBaru;
        System.out.println("Jumlah jam berhasil ditambah. Jam setelah penambahan: " + jumlahJam);
    }
    
    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi. Jam setelah pengurangan: " + jumlahJam);
        } else {
            System.out.println("Pengurangan gagal! Jumlah jam awal (" + jumlahJam + ") lebih kecil dari jam pengurang (" + jam + ").");
        }
    }
}