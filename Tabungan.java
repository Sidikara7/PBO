import java.util.Scanner;
public class Tabungan extends Nasabah {
    private double bunga,S_awal,S_akhir,setor,tarik,ambil,ambils;
    Scanner input = new Scanner(System.in);

    public double getSaldoAwal(){
        return S_awal;
    }
    public double getSaldo(){
        S_akhir=getSaldoAwal()+setor;
        return S_akhir;
    }
    public double getSetor(){
        return setor;
    }
    public double setTarik(){

        return tarik;
    }

    @Override
    public void tbg() {
        System.out.println("Masukkan jumlah tabungan");
        setor = input.nextInt();
        S_awal=S_awal+setor;
        Menu();
    }
    @Override
    public void cetaktbg(){
        System.out.println("NAMA NASABAH    : "+getNama());
        System.out.println("ALAMAT          : "+getAlamat());
        System.out.println("JENIS KELAMIN   : "+getJk());
        System.out.println("NOMOR REKENING  : "+getNoRek());
        System.out.println("Saldo           : "+setor);
        Menu();
    }
}
