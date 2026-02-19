public class MataKuliahMain08 {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("                       --- Informasi Matakuliah 1 ---");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("              --- Informasi Matakuliah Sebelum Dimodifikasi ---");
        System.out.println("--------------------------------------------------------------------------");
        Matakuliah08 mk1 = new Matakuliah08();
        mk1.kodeMK = "SI123";
        mk1.namaMK = "Algoritma dan Pemrograman";
        mk1.sks = 3;
        mk1.jumlahJam = 2;

        mk1.tampilkanInformasi();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("              --- Informasi Matakuliah Sesudah Dimodifikasi ---");
        System.out.println("--------------------------------------------------------------------------");
        mk1.ubahSKS(4);
        mk1.tambahJam(3);
        mk1.kurangiJam(2);
        System.out.println("--------------------------------------------------------------------------");
        mk1.tampilkanInformasi();
        
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("                     --- Informasi Matakuliah ke 2 ---");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("              --- Informasi Matakuliah Sebelum Dimodifikasi ---");
        System.out.println("--------------------------------------------------------------------------");
        Matakuliah08 mk2 = new Matakuliah08("TI456", "Aljabar Linier", 4, 5);
        mk2.tampilkanInformasi();
        
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("              --- Informasi Matakuliah Sesudah Dimodifikasi ---");
        System.out.println("--------------------------------------------------------------------------");
        mk2.ubahSKS(3);
        mk2.kurangiJam(6);
        System.out.println("--------------------------------------------------------------------------");
        mk2.tampilkanInformasi();
        System.out.println("--------------------------------------------------------------------------");

    }
}
