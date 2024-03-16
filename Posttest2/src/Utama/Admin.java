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

    // Getter untuk IdAdmin
    public String getIdAdmin() {
        return IdAdmin;
    }

    // Setter untuk idAdmin
    public void setIdAdmin(String idAdmin) {
        this.IdAdmin = idAdmin;
    }

    // Getter untuk Password
    public String getPassword() {
        return Password;
    }

    // Setter untuk Password
    public void setPassword(String password) {
        this.Password = password;
    }
}
