public class BankBCA extends Bank {
    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga BCA adalah 4.5%");
    }
    
    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer Rp" + jumlah + "ke rekening " + rekeningTujuan + "di BNI");
    }

    @Override
    public double hitungBiayaTransfer(int jumlah) {
        return jumlah * 0.001;
    }   
}
