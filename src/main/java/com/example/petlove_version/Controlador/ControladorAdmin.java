package com.example.petlove_version.Controlador;

import com.example.petlove_version.Entidad.EntidadAdmin;
import com.example.petlove_version.Servicio.ServicioAdmin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

public class ControladorAdmin {


    private ServicioAdmin servicio;


    public ControladorAdmin(ServicioAdmin servicio){this.servicio=servicio;}
    @GetMapping("/ListarAdmin")
    public ArrayList<EntidadAdmin> Listarad(){return servicio.ListarAdmin();}


    @PostMapping("/ActualizarAdmin")
    public String ActualizarAdmin(@RequestBody EntidadAdmin adm){
        return servicio.ActualizarAdmin(adm);
    }

    @PostMapping("/AgregarAdmin")
    public String AgregarAdmin(@RequestBody EntidadAdmin adm){
        return servicio.AgregarAdmin(adm);
    }

}

