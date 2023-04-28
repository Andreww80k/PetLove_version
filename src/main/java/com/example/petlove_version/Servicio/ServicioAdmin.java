package com.example.petlove_version.Servicio;

import com.example.petlove_version.Entidad.EntidadAdmin;
import com.example.petlove_version.Repositorio.RepositorioAdmin;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServicioAdmin {

    //Llamamos a nuestro repositorio
    private RepositorioAdmin repositorio;

    public  ServicioAdmin(RepositorioAdmin repositorio){this.repositorio=repositorio;}

    public ArrayList<EntidadAdmin> ListarAdmin() {
        return (ArrayList<EntidadAdmin>)repositorio.findAll();
    }

    public ArrayList<EntidadAdmin> listarClientes(){
        return (ArrayList<EntidadAdmin>) repositorio.findAll();
    }

    public EntidadAdmin BuscarAdmin(String id){
        if (repositorio.findById(id).isPresent())
            return repositorio.findById(id).get();
        else return null;
    }

    public String AgregarAdmin(EntidadAdmin adm){
        if (repositorio.findById(adm.getId()).isPresent())
            return "El administrador se encuentra ya registrado";

        else repositorio.save(adm);
        return "El administrador se registro satisfactoriamente";
    }

    public String ActualizarAdmin(EntidadAdmin adm){
        if(repositorio.findById(adm.getId()).isPresent()) {
            repositorio.save(adm);
            return "El Administrador se actualizo exitosamente";
        }
        else {return "El Administrador no se puede actualizar porque no existe";}
    }
}


