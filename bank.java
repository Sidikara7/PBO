import java.util.Scanner;
public class bank {
      static void Menu() {
            Nasabah xx = new Nasabah();
            Deposit satu = new Deposit();
            Tabungan dua = new Tabungan();
            int selection;
            Scanner input = new Scanner(System.in);
            System.out.println("\nBANK KRUT main menu:");
            System.out.println("1 - Pendaftaran Nasabah Baru");
            System.out.println("2 - Deposito");
            System.out.println("3 - Cetak Deposito");
            System.out.println("4 - Tabungan");
            System.out.println("5 - Cetak Tabungan");
            System.out.println("6 - Penarikan Deposito");
            System.out.println("7 - Cetak Deposito");
            System.out.println("8 - Mengakhiri transaksi");
            System.out.print("Choice: ");
            selection =input.nextInt();
            switch(selection){
                case 1:
                    xx.indNasabah();
                    break;
                case 2:
                    satu.dep();
                    break;
                case 3:
                    satu.cetakdep();
                    break;
                case 4:
                    dua.tbg();
                    break;
                case 5:
                    dua.cetaktbg();
                    break;
                case 6:
                    satu.penarikan();
                    break;
                case 7:
                    satu.cetak_penarikan();
                    break;
                case 8:
                    System.out.println("Terima kasih sudah mengunakan ATM");
            }
        }
    public static void main(String[] args) {
        bank krut = new bank();
        krut.Menu();
    }
}