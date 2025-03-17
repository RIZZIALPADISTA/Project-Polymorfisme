import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===== Sistem Transfer Bank =====");

        BankBNI bni = new BankBNI();
        BankBCA bca = new BankBCA();
        Bank bank = null;

        System.out.print("\nMasukkan jumlah transfer: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Masukkan rekening tujuan: ");
        String rekeningTujuan = scanner.nextLine();

        System.out.print("Masukkan nama bank tujuan (BNI/BCA/Lainnya): ");
        String bankTujuan = scanner.nextLine().toUpperCase();

        System.out.print("Masukkan berita transfer: ");
        String berita = scanner.nextLine();

        if (bankTujuan.equals("BNI")) {
            bank = bni;
        } else if (bankTujuan.equals("BCA")) {
            bank = bca;
        } else {
            bank = new Bank();
        }

        double biayaTransfer = bank.hitungBiayaTransfer(jumlah);
        double totalTransfer = jumlah + biayaTransfer;

        System.out.println("\n=== Menghitung Biaya Transfer ===");
        System.out.println("Biaya transfer ke " + bankTujuan + ": Rp" + biayaTransfer);
        System.out.println("Total jumlah yang harus dibayar: Rp" + totalTransfer);

        System.out.println("");

        System.out.println("Transfer Rp" + totalTransfer + " ke rekening " + rekeningTujuan + " ke bank " + bankTujuan + " dengan berita: " + berita);
    }
}
