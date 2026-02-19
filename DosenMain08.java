public class DosenMain08 {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("                       --- Informasi Dosen 1 ---");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("              --- Informasi Dosen Sebelum Dimodifikasi ---");
        System.out.println("--------------------------------------------------------------------------");
        Dosen08 dosen1 = new Dosen08();
        dosen1.idDosen = "D001";
        dosen1.namaDosen = "Budi Santoso, S.Kom., M.Kom.";
        dosen1.bidangKeahlian = "Sistem Informasi";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 1990;
        dosen1.tampilkanInformasi();
        
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("              --- Informasi Dosen Sesudah Dimodifikasi ---");
        System.out.println("--------------------------------------------------------------------------");
        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Teknologi Informasi");
        System.out.println("Masa Kerja          : " + dosen1.hitungMasaKerja(2026) + " tahun");
        System.out.println("--------------------------------------------------------------------------");
        dosen1.tampilkanInformasi();

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("                     --- Informasi Dosen ke 2 ---");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("              --- Informasi Dosen Sebelum Dimodifikasi ---");
        System.out.println("--------------------------------------------------------------------------");
        Dosen08 dosen2 = new Dosen08("D002", "Siti Aminah, S.T., M.T.", "Teknologi Informasi", true, 2010);
        dosen2.tampilkanInformasi();

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("              --- Informasi Dosen Sesudah Dimodifikasi ---");
        System.out.println("--------------------------------------------------------------------------");
        dosen2.ubahKeahlian("Teknik Informatika");
        System.out.println("Masa Kerja          : " + dosen2.hitungMasaKerja(2026) + " tahun");
        System.out.println("--------------------------------------------------------------------------");
        dosen2.tampilkanInformasi();
        System.out.println("--------------------------------------------------------------------------");

    }
}
