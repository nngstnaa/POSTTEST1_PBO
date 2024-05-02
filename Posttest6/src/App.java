// NIM   : 2209106086
// Nama  : Agustina
// Kelas : Informatika B2 2022

import java.util.ArrayList;

import Utama.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface DataManagement {
    void tambahData(ArrayList<HarryPotter> Hp, BufferedReader br) throws IOException;
    void hapusData(ArrayList<HarryPotter> Hp, BufferedReader br) throws IOException;
}

public class App implements DataManagement {
    protected App () {} // Menggunakan protected untuk membatasi akses konstruktor
    static ArrayList<HarryPotter> Hp = new ArrayList<>();
    static ArrayList<Admin> admn = new ArrayList<>();
    static int jumlahBarang = 0;

    public static void main(String[] args) throws IOException {

        admn.add(new Admin("086", "Agustina"));
        DataManagement dataManager = new App();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        boolean loggedIn = false;
        Admin loggedInAdmin = null;

        try {
            // Login Admin
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

                // memeriksa apakah id atau password sudah benar
                for (Admin admin : admn) {
                    if (admin.getIdAdmin().equals(adminId) && admin.getPassword().equals(password)) {
                        loggedInAdmin = admin;
                        loggedIn = true;
                        break;
                    }
                }

                if (!loggedIn) {
                    System.out.println("ID atau Password yang Anda Masukkan Salah, Silahkan Coba lagi !");
                }
            }
        } catch (IOException e) {
            System.out.println("Terjadi Kesalahan dalam Membaca Input: " + e.getMessage());
            // Anda dapat menangani kesalahan ini dengan cara yang berbeda tergantung pada aplikasi Anda
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan: " + e.getMessage());
            // Tangani pengecualian lain jika diperlukan
        } finally {
            // Tutup aplikasi
            try {
                br.close();
                isr.close();
            } catch (IOException e) {
                System.out.println("Terjadi Kesalahan dalam Menutup Aplikasi : " + e.getMessage());
            }
        }
        
        // Menu Utama
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
            try {
                Pilihan = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Masukkan nomor menu.");
                Pilihan = 0; // Reset Pilihan menjadi 0 agar loop tetap berlanjut
                continue;
            }

            switch (Pilihan) {
                case 1:
                    tampilkanData(Hp);
                    break;
                case 2:
                    dataManager.tambahData(Hp, br);
                    break;
                case 3:
                    ubahData(Hp, br);
                    break;
                case 4:
                    dataManager.hapusData(Hp, br);
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
        for (HarryPotter barang : Hp) {
            if (barang instanceof Novel) {
                ((Novel) barang).tampil();

            } else if (barang instanceof PernakPernik) {
                ((PernakPernik) barang).tampil();
            }
            System.out.println("-------------------------------------------------------");
        }
        tampilkanJumlahBarang();
    }

    @Override
public void tambahData(ArrayList<HarryPotter> Hp, BufferedReader br) {
    try {
        System.out.println("----------------------------------------------------------");
        System.out.println("| Silahkan Memilih Jenis Barang yang Ingin Ditambahkan   |");
        System.out.println("----------------------------------------------------------");
        System.out.println("|   1. Novel                                             |");
        System.out.println("|   2. Pernak Pernik                                     |");
        System.out.println("----------------------------------------------------------");
        System.out.print("Pilih jenis barang yang ingin ditambahkan (1/2): ");
        int jenisBarang = Integer.parseInt(br.readLine());

        switch (jenisBarang) {
            case 1:
                tambahNovel(Hp, br);
                break;
            case 2:
                tambahPernakPernik(Hp, br);
                break;
            default:
                System.out.println("Pilihan Tidak Valid !");
                break;
        }
        jumlahBarang++;
    } catch (IOException e) {
        System.out.println("Terjadi kesalahan saat membaca input: " + e.getMessage());
    } catch (NumberFormatException e) {
        System.out.println("Masukan tidak valid. Harap masukkan angka yang benar.");
    } catch (Exception e) {
        System.out.println("Terjadi kesalahan: " + e.getMessage());
    }
}


    static void tambahNovel(ArrayList<HarryPotter> Hp, BufferedReader br) throws IOException {
        System.out.println("-----------------------------------------------------");
        System.out.println("| Silahkan Menambah Data Novel di Toko Wizardneeds  |");
        System.out.println("-----------------------------------------------------");

        System.out.print("Masukkan ID Novel       : "); String idNovel = br.readLine();
        System.out.print("Masukkan Judul Novel    : "); String judulNovel = br.readLine();
        System.out.print("Masukkan Stok Novel     : "); int stokNovel = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Harga Novel    : "); int hargaNovel = Integer.parseInt(br.readLine());

        Novel novel = new Novel(idNovel, judulNovel, stokNovel, hargaNovel);
        Hp.add(novel);
        System.out.println("------------------------------------------------------");
        System.out.println("|        Data Novel berhasil ditambahkan !           |");
        System.out.println("------------------------------------------------------");
    }

    static void tambahPernakPernik(ArrayList<HarryPotter> Hp, BufferedReader br) throws IOException {
        System.out.println("------------------------------------------------------------");
        System.out.println("| Silahkan Menambah Data Pernak Pernik di Toko Wizardneeds |");
        System.out.println("------------------------------------------------------------");
        System.out.print("Masukkan ID Pernak Pernik    : "); String idPernakPernik = br.readLine();
        System.out.print("Masukkan Nama Pernak Pernik  : "); String namaPernakPernik = br.readLine();
        System.out.print("Masukkan Stok Pernak Pernik  : "); int stokPernakPernik = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Harga Pernak Pernik : "); int hargaPernakPernik = Integer.parseInt(br.readLine());

        PernakPernik pernakPernik = new PernakPernik(idPernakPernik, namaPernakPernik, stokPernakPernik, hargaPernakPernik);
        Hp.add(pernakPernik);
        System.out.println("------------------------------------------------------------");
        System.out.println("|       Data Pernak Pernik berhasil ditambahkan !          |");
        System.out.println("------------------------------------------------------------");
    }

    static void ubahData(ArrayList<HarryPotter> Hp, BufferedReader br) throws IOException {
        System.out.println("----------------------------------------------------------------");
        System.out.println("| Mengubah Data Pernak Pernik Harry Potter di Toko Wizardneeds |");
        System.out.println("----------------------------------------------------------------");
        System.out.print("Masukkan ID Barang Yang Akan Diubah :");
        String idbarang = br.readLine();
        
        for (HarryPotter barang : Hp) {
            if (barang.getIdBarang().equals(idbarang)) {
                System.out.print("Masukkan Nama Barang Baru      :"); String namaBaru = br.readLine();
                System.out.print("Masukkan Stok Barang Baru      :"); int stokBaru = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Harga Barang Baru     :"); int hargaBaru = Integer.parseInt(br.readLine());

                if (barang instanceof Novel) {
                    // Ubah judul novel jika objek adalah instance dari Novel
                    Novel novel = (Novel) barang;
                    novel.setJudulNovel(namaBaru); // Mengubah judul novel
                } else if (barang instanceof PernakPernik) {
                    // Ubah nama pernak pernik jika objek adalah instance dari PernakPernik
                    ((PernakPernik) barang).setNamaPernakPernik(namaBaru); // Mengubah nama pernak pernik
                }

                barang.setStokBarang(stokBaru); // Mengubah stok
                barang.setHargaBarang(hargaBaru); // Mengubah harga


                System.out.println("----------------------------------------------------------------");
                System.out.println("|  Data Pernak Pernik di Toko Wizardneeds Berhasil Diubah !    |");
                System.out.println("----------------------------------------------------------------");
                return;
            }
        }
        System.out.println("Barang dengan ID " + idbarang + " Tidak Ditemukan !");
    }

    static void tampilkanJumlahBarang() {
        System.out.println("Jumlah barang saat ini: " + jumlahBarang);
    }

    @Override
    public void hapusData(ArrayList<HarryPotter> Hp, BufferedReader br) throws IOException {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("|     Menghapus Data Barang Harry Potter di Toko Wizardneeds    |");
            System.out.println("-----------------------------------------------------------------");
            System.out.print("Masukkan ID Barang Yang Akan Dihapus : "); String idbarang = br.readLine();
            for (int i = 0; i < Hp.size(); i++) {
                if (Hp.get(i).getIdBarang().equals(idbarang)) {
                    Hp.remove(i);
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("|       Data Barang di Toko Wizardneeds Berhasil Dihapus !      |");
                    System.out.println("-----------------------------------------------------------------");
                    return;
                }
            }
            System.out.println("Barang Dengan ID " + idbarang + " Tidak Ditemukan.");
        }
    }

