import java.util.Random;
import java.util.Scanner;
public class Nasabah extends bank {
    Scanner input = new Scanner(System.in);

    private String nama, alamat, jk,jenistab,noRek;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getJenistab() {
        return jenistab;
    }

    public void setJenistab(String jenistab) {
        this.jenistab = jenistab;
    }

    public String getNoRek() {
        return noRek;
    }

    public void setNoRek(String noRek) {
        this.noRek = noRek;
    }
    public void indNasabah(){
        Scanner input = new Scanner(System.in);
            System.out.println("PENDATAAN NASABAH BARU" + "PENDATAAN");
            this.nama=("Masukkan Nama         : ");
            nama= input.next();
            this.alamat=("Masukkan Alamat     : ");
            alamat=input.next();
            this.jk=("Masukkan Jenis Kelamin  : ");
            jk=input.next();
            this.noRek=("Masukkan No Rek      : ");
            noRek=input.next();
        Menu();
    }
    public void penyetoran(){
    }
    public void penarikan() {
    }
    public void tbg(){
    }
    public void dep(){
    }
    public void cetakdep(){
    }
    public void cetaktbg(){
    }
    public void cetak_penarikan(){
    }
}
