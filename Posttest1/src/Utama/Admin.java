package Utama;

public class Admin {
    String IdAdmin;
    String Password;

    public Admin(String IdAdmin, String Password) {
        this.IdAdmin = IdAdmin;
        this.Password = Password;
    }

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


