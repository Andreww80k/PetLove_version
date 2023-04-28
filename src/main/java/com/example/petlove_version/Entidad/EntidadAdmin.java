package com.example.petlove_version.Entidad;
import jakarta.persistence.*;

public class EntidadAdmin {

    @Id // llave primaria
    @Column(nullable = false)
    private  int Id;

    @Column(nullable = false,length = 50)
    private String Nombre_Adm;

    @Column(nullable = false,length = 50)
    private String Apellido_Adm;

    @Column(nullable = false,length = 50)
    private String Telefono_Adm;

    @Column(nullable = false,length = 50)
    private String Direccion_Adm;

    //Constructor vacio
    public EntidadAdmin() {

    }

    public EntidadAdmin(int id, String nombre_Adm, String apellido_Adm, String telefono_Adm, String direccion_Adm) {
        Id = id;
        Nombre_Adm = nombre_Adm;
        Apellido_Adm = apellido_Adm;
        Telefono_Adm = telefono_Adm;
        Direccion_Adm = direccion_Adm;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre_Adm() {
        return Nombre_Adm;
    }

    public void setNombre_Adm(String nombre_Adm) {
        Nombre_Adm = nombre_Adm;
    }

    public String getApellido_Adm() {
        return Apellido_Adm;
    }

    public void setApellido_Adm(String apellido_Adm) {
        Apellido_Adm = apellido_Adm;
    }

    public String getTelefono_Adm() {
        return Telefono_Adm;
    }

    public void setTelefono_Adm(String telefono_Adm) {
        Telefono_Adm = telefono_Adm;
    }

    public String getDireccion_Adm() {
        return Direccion_Adm;
    }

    public void setDireccion_Adm(String direccion_Adm) {
        Direccion_Adm = direccion_Adm;
    }

    @Override
    public String toString() {
        return "EntidadAdmin{" +
                "Id=" + Id +
                ", Nombre_Adm='" + Nombre_Adm + '\'' +
                ", Apellido_Adm='" + Apellido_Adm + '\'' +
                ", Telefono_Adm='" + Telefono_Adm + '\'' +
                ", Direccion_Adm='" + Direccion_Adm + '\'' +
                '}';
    }
}
