public class Dosen08 {
    String idDosen, namaDosen, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    public Dosen08() {
    }

    public Dosen08(String idDosen, String namaDosen, String bidangKeahlian, boolean statusAktif, int tahunBergabung) {
        this.idDosen = idDosen;
        this.namaDosen = namaDosen;
        this.bidangKeahlian = bidangKeahlian;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
    }

    void tampilkanInformasi() {
        System.out.println("ID Dosen            : " + idDosen);
        System.out.println("Nama Dosen          : " + namaDosen);
        System.out.println("Bidang Keahlian     : " + bidangKeahlian);
        System.out.println("Status Aktif        : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung     : " + tahunBergabung);
    }

    void setStatusAktif(boolean statusBaru) {
        statusAktif = statusBaru;
        System.out.println("Status aktif telah diubah menjadi " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian telah diubah menjadi " + bidangKeahlian);
    }
}
