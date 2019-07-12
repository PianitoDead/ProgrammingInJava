package Clases;

/**
 *
 * @author Brando Taipe
 */
public class Usuarios {
    
    private int Id_Usuario;
    private String Nombre;
    private String ApellidoM;
    private String ApellidoP;
    private String Email;
    private String Username;
    private String Password;
    
    public Usuarios() {
    }

    public Usuarios(int Id_Usuario, String Nombre, String ApellidoM, String ApellidoP, String Email, String Username, String Password) {
        this.Id_Usuario = Id_Usuario;
        this.Nombre = Nombre;
        this.ApellidoM = ApellidoM;
        this.ApellidoP = ApellidoP;
        this.Email = Email;
        this.Username = Username;
        this.Password = Password;
    }

    public int getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(int Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    }