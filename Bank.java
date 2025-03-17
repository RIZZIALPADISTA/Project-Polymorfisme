public class Bank {
   
    public void transferUang(int jumlah, String rekeningTujuan) {
       System.out.println("Transfer Rp" + jumlah + " ke rekening " + rekeningTujuan);
    }
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer Rp" + jumlah + " ke rekening " + rekeningTujuan + "ke bank " + bankTujuan);
    }
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        System.out.println("Transfer Rp" + jumlah + " ke rekening " + rekeningTujuan + " ke bank " + bankTujuan + " dengan berita: " + berita);
    }

    public void sukuBunga() {
        System.out.println("Suku Bunga standar adalah 3%");
    }

    public double hitungBiayaTransfer(int jumlah) {
        return 0;
    }
}
