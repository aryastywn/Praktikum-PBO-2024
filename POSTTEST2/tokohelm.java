package POSTTEST2;
import java.util.ArrayList;
import java.util.Scanner;

class Helm {
    private String kode;
    private String merk;
    private int stok;

    public Helm(String kode, String merk, int stok) {
        this.kode = kode;
        this.merk = merk;
        this.stok = stok;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}

public class tokohelm {
    private static ArrayList<Helm> dataHelm = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void cls() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("======================================");
            System.out.println("Selamat datang di Jamal's Store");
            System.out.println("======================================");
            System.out.println("1. Tambah Data Helm");
            System.out.println("2. Lihat Data Helm");
            System.out.println("3. Update Data Helm");
            System.out.println("4. Hapus Data Helm");
            System.out.println("5. Keluar");
            System.out.println("======================================");

            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine();
            cls();

            switch (menu) {
                case 1:
                    tambahDataHelm();
                    break;
                case 2:
                    lihatDataHelm();
                    break;
                case 3:
                    updateDataHelm();
                    break;
                case 4:
                    hapusDataHelm();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    System.out.print("Tekan Enter untuk melanjutkan...");
                    scanner.nextLine();
                    cls();
            }
        }

        System.out.print("================================================================");
        System.out.print("| Terima kasih telah menggunakan program Jamal's Store <3 ^-^. |");
        System.out.print("================================================================");
        scanner.nextLine();
        cls();
    }

    public static void tambahDataHelm() {
        lihatDataHelm();
        System.out.println("\n====================");
        System.out.println("| Tambah Data Helm |");
        System.out.println("====================");
        System.out.print("Kode Helm: ");
        String kode = scanner.nextLine();
        System.out.print("Merk Helm: ");
        String merk = scanner.nextLine();
        System.out.print("Stok Helm: ");
        int stok = scanner.nextInt();

        Helm helm = new Helm(kode, merk, stok);
        dataHelm.add(helm);
        System.out.println("\nData helm berhasil ditambahkan.");
        System.out.print("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        scanner.nextLine();
        cls();
    }

    public static void lihatDataHelm() {
        if (dataHelm.isEmpty()) {
            System.out.println("Tidak ada data helm.");
            System.out.print("Tekan Enter untuk melanjutkan...");
            scanner.nextLine();
            cls();
        } else {
            System.out.println("\n=======================================");
            System.out.println("     Data Helm di Jamal's Store");
            System.out.println("=======================================");
            System.out.println("Kode\t\tMerk\t\tStok");
            System.out.println("=======================================");
            for (Helm helm : dataHelm) {
                System.out.println(helm.getKode() + "\t\t" + helm.getMerk() + "\t\t" + helm.getStok());
            }
            System.out.println("\n");
        }
    }

    public static void updateDataHelm() {
        lihatDataHelm();
        System.out.println("\n====================");
        System.out.println("| Update Data Helm |");
        System.out.println("====================");
        System.out.print("Masukkan kode helm yang akan diupdate: ");
        String kode = scanner.nextLine();

        for (Helm helm : dataHelm) {
            if (helm.getKode().equals(kode)) {
                System.out.print("Masukkan kode baru: ");
                String newKode = scanner.nextLine();
                System.out.print("Masukkan merk baru: ");
                String newMerk = scanner.nextLine();
                System.out.print("Masukkan stok baru: ");
                int newStok = scanner.nextInt();

                helm.setKode(newKode);
                helm.setMerk(newMerk);
                helm.setStok(newStok);

                System.out.println("\nData helm berhasil diupdate.");
                System.out.print("Tekan Enter untuk melanjutkan...");
                scanner.nextLine();
                scanner.nextLine();
                cls();
                return;
            }
        }

        System.out.println("\nData helm dengan kode " + kode + " tidak ditemukan.");
        System.out.print("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        cls();
    }

    public static void hapusDataHelm() {
        lihatDataHelm();
        System.out.println("\n===================");
        System.out.println("| Hapus Data Helm |");
        System.out.println("===================");
        System.out.print("Masukkan kode helm yang akan dihapus: ");
        String kode = scanner.nextLine();

        for (int i = 0; i < dataHelm.size(); i++) {
            if (dataHelm.get(i).getKode().equals(kode)) {
                dataHelm.remove(i);
                System.out.println("\nData helm berhasil dihapus.");
                System.out.print("Tekan Enter untuk melanjutkan...");
                scanner.nextLine();
                // scanner.nextLine();
                cls();
                return;
            }
        }

        System.out.println("\nData helm dengan kode " + kode + " tidak ditemukan.");
        System.out.print("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        cls();
    }
}
