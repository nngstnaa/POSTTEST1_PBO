// Pada kelas Admin di package Utama
package Utama;

public class Admin {
    // ubah akses ke private
    private String IdAdmin;
    private String Password;

    // Konstruktor publik untuk inisialisasi dari luar package
    public Admin(String IdAdmin, String Password) {
        this.IdAdmin = IdAdmin;
        this.Password = Password;
    }

    // Getter dan setter lainnya
    public String getIdAdmin() {
        return IdAdmin;
    }

    public String getPassword() {
        return Password;
    }

    public void setIdAdmin(String idAdmin) {
        IdAdmin = idAdmin;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
