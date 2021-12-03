
package modelo;


public class Persona {
    int id;
    String nom;
    String correo;
    String contraseña;

    public Persona() {
    }

    public Persona(int id, String nom, String correo, String contraseña) {
        this.id = id;
        this.nom = nom;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    

  
    
}
