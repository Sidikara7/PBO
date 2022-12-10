import java.awt.*;
import java.util.Scanner;
public class Deposit extends Nasabah{
    Scanner input = new Scanner(System.in);
    private String jenisdep;
    private double bunga,S_awal,S_akhir,setor,tarik,ambil,ambils;
    private int pilih;
    public double getSaldo(){
        return S_akhir;
    }
    public double setBunga(){
        return bunga;
    }
    public double setTarik(){
        return tarik;
    }
    @Override
    public void dep(){
        System.out.println("Masukkan jumlah deposito");
        setor = input.nextInt();
        System.out.println("Pilih Jenis Deposito");
        System.out.println("1. 6 bulan");
        System.out.println("2. 12 bulan");
        System.out.print("Choice: ");
        pilih =input.nextInt();
        switch (pilih){
            case 1:
                bunga=0.01*setor;
                break;
            case 2:
                bunga=0.02*setor;
                break;
        }
        this.S_akhir=bunga;
        Menu();
    }
    @Override
    public void cetakdep(){
        System.out.println("Nomor Rekening : "+getNoRek());
        System.out.println("Nama           : "+getNama());
        System.out.println("Alamat         : "+getAlamat());
        System.out.println("Deposito       : "+getSaldo());
        Menu();
    }
    public void penarikan(){
        if(getSaldo()==0){
            System.out.println("belum ada data");
        }else{
            System.out.println("PENARIKAN DEPOSIT");
            ambils=S_akhir-S_awal;
            System.out.println("Jumlah Dana yang bisa diambil adalah Rp. "+ambils);
            String a=("Masukkan jumlah penarikan");
            this.tarik=Double.parseDouble(a);
            if(tarik>ambils){
                System.out.println("Dana tidak cukup");
            }else{
                this.ambils=ambils-tarik;
                S_akhir=S_akhir-tarik;
            }
        }
        Menu();
    }
    @Override
    public void cetak_penarikan(){
        System.out.println("DATA PENARIKAN DEPOSIT");
        System.out.println("Penarikan "+setTarik()+"\n"
                + getSaldo()+"\n");
        Menu();
    }
}
