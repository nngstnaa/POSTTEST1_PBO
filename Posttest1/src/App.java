// NIM   : 2209106086
// Nama  : Agustina
// Kelas : 2209106086

import java.util.ArrayList;

import Utama.Admin;
import Utama.HarryPotter;
    
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    static ArrayList<HarryPotter> Hp = new ArrayList<>();
    static ArrayList<Admin> admn = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        admn.add(new Admin("086", "Agustina"));

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        boolean loggedIn = false;
        Admin loggedInAdmin = null;

        // Login loop
        while (!loggedIn) {
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("| Selamat Datang di Program Pendataan Pernak Pernik Harry Potter di Toko Wizardneeds |");
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("|                            Silahkan Login Terlebih Dahulu !                        |");
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.print("Masukkan Id Admin       : ");
            String adminId = br.readLine();
            System.out.print("Masukkan Password Admin : ");
            String password = br.readLine();
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("|                                Anda Berhasil Login                                 |");
            System.out.println("--------------------------------------------------------------------------------------");

            // Check if admin credentials are correct
            for (Admin admin : admn) {
                if (admin.getIdAdmin().equals(adminId) && admin.getPassword().equals(password)) {
                    loggedInAdmin = admin;
                    loggedIn = true;
                    break;
                }
            }

            if (!loggedIn) {
                System.out.println(" Id atau Password Yang Anda Masukkan Salah, Silahkan Coba lagi ! ");
            }
        }
        
        //Menu Utama
        int Pilihan;
        do {
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("| Menu Utama Program Pendataan Pernak Pernik Harry Potter di Toko Wizardneeds |");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("==========================");
            System.out.println("|   1. Tampilkan Data    |");
            System.out.println("|   2. Tambah Data       |");
            System.out.println("|   3. Ubah Data         |");
            System.out.println("|   4. Hapus Data        |");
            System.out.println("|   5. Keluar Program    |");
            System.out.println("==========================");
            System.out.print  ("Pilih menu (1/2/3/4/5): ");
            Pilihan = Integer.parseInt(br.readLine());

            switch (Pilihan) {
                case 1:
                    tampilkanData(Hp);
                    break;
                case 2:
                    tambahData(Hp, br);
                    break;
                case 3:
                    ubahData(Hp, br);
                    break;
                case 4:
                    hapusData(Hp, br);
                    break;
                case 5:
                    System.out.println("Keluar Dari Program !");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid !");
                    break;
            }
        } while (Pilihan != 5);
    }

    static void tampilkanData(ArrayList<HarryPotter> Hp) {
        System.out.println("-------------------------------------------------------");
        System.out.println("| Data Pernak Pernik Harry Potter di Toko Wizardneeds |");
        System.out.println("-------------------------------------------------------");
        for (HarryPotter wizard : Hp) {
            System.out.println("Id Barang    : " + wizard.getIdBarang());
            System.out.println("Nama Barang  : " + wizard.getNamaBarang());
            System.out.println("Stok Barang  : " + wizard.getStokBarang());
            System.out.println("Harga Barang : " + wizard.getHargaBarang());
            System.out.println("-------------------------------------------------------");
        }
    }

    static void tambahData(ArrayList<HarryPotter> Hp, BufferedReader br) throws IOException {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("| Silahkan Menambah Data Pernak Pernik Harry Potter di Toko Wizardneeds |");
        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Masukkan ID Barang    :");
        String idbarang = br.readLine();
        System.out.println("Masukkan Nama Barang  :");
        String namabarang = br.readLine();
        System.out.println("Masukkan Stok Barang  :");
        int stokbarang = Integer.parseInt(br.readLine());
        System.out.println("Masukkan Harga Barang :");
        int hargabarang = Integer.parseInt(br.readLine());

        HarryPotter wizard = new HarryPotter(idbarang, namabarang, stokbarang, hargabarang);
        Hp.add(wizard);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|       Data Pernak Pernik Harry Potter berhasil ditambahkan !          |");
        System.out.println("-------------------------------------------------------------------------");
    }

    static void ubahData(ArrayList<HarryPotter> Hp, BufferedReader br) throws IOException {
        System.out.println("----------------------------------------------------------------");
        System.out.println("| Mengubah Data Pernak Pernik Harry Potter di Toko Wizardneeds |");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Masukkan ID  Barang Yang Akan Diubah :");
        String idbarang = br.readLine();
        for (HarryPotter harry : Hp) {
            if (harry.getIdBarang().equals(idbarang)) {
                System.out.println("Masukkan Nama Barang Baru      :");
                String namaBaru = br.readLine();
                System.out.println("Masukkan Stok Barang Baru      :");
                int stokBaru = Integer.parseInt(br.readLine());
                System.out.println("Masukkan Harga Barang Baru     :");
                int hargaBaru = Integer.parseInt(br.readLine());

                harry.setNamaBarang(namaBaru);
                harry.setStokBarang(stokBaru);
                harry.setHargaBarang(hargaBaru);

                System.out.println("----------------------------------------------------------------");
                System.out.println("|  Data Pernak Pernik di Toko Wizardneeds Berhasil Diubah !    |");
                System.out.println("----------------------------------------------------------------");
                return;
            }
        }
        System.out.println("Barang dengan ID " + idbarang + " Tidak Ditemukan !");
    }

    static void hapusData(ArrayList<HarryPotter> Hp, BufferedReader br) throws IOException {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("| Menghapus Data Pernak Pernik Harry Potter di Toko Wizardneeds |");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Masukkan ID Barang Yang Akan Dihapus : ");
        String idbarang = br.readLine();
        for (int i = 0; i < Hp.size(); i++) {
            if (Hp.get(i).getIdBarang().equals(idbarang)) {
                Hp.remove(i);
                System.out.println("-----------------------------------------------------------------");
                System.out.println("|  Data Pernak Pernik di Toko Wizardneeds Berhasil Dihapus !    |");
                System.out.println("-----------------------------------------------------------------");
                return;
            }
        }
        System.out.println("Barang Dengan ID " + idbarang + " Tidak Ditemukan.");
    }
}


