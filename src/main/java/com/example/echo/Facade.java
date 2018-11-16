/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.echo;

import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import com.google.api.server.spi.auth.EspAuthenticator;
import com.google.api.server.spi.auth.common.User;
import com.google.api.server.spi.config.AnnotationBoolean;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiIssuer;
import com.google.api.server.spi.config.ApiIssuerAudience;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.Nullable;
import com.google.api.server.spi.response.UnauthorizedException;

@Api(
    name = "facade",
    version = "v1",
    namespace =
    @ApiNamespace(
        ownerDomain = "echo.example.com",
        ownerName = "echo.example.com",
        packagePath = ""
    ),
    issuers = {
        @ApiIssuer(
            name = "firebase",
            issuer = "https://securetoken.google.com/proyectsoftwareii",
            jwksUri =
                "https://www.googleapis.com/service_accounts/v1/metadata/x509/securetoken@system"
                    + ".gserviceaccount.com"
        )
    }
// [END_EXCLUDE]
)

public class Facade {
    private ArrayList<Ruta> rutas;
    private ArrayList<Conjunto> sesiones;
    UsuarioFactory u;
    private static Facade instance;
    
    public static Facade getInstance() {
        if (instance == null) {
            instance = new Facade();
        }
        return instance;
    }
    
    @ApiMethod(name = "RegistrarRuta")
    public void registrarRuta(@Named("numeroPuestos") int numeroPuestos, @Named("placaCarro") String placaCarro, @Named("puntoSalida") String puntoSalida, @Named("puntoDestino") String puntoDestino, @Named("Identificacion") String identificacion, @Named("hora") Date hora, @Named("fecha") Date fecha, /*@Named("calles") ArrayList<Polyline> calles,*/ @Named("sesion") int sesion, @Named("precio") float precio){
    	String correo = "Prueba";
    	ArrayList<Polyline> calles = null;
        Ruta r = new Ruta(calles, correo, numeroPuestos, placaCarro, puntoSalida, puntoDestino, identificacion, hora, fecha, sesion, precio);
        rutas.add(r);
    }
    
    @ApiMethod(name = "listarRutas")
    public ArrayList<Ruta> listarRuta(@Named("correoConductor") String correo){
        ArrayList<Ruta> devolver = new ArrayList<>();
        for(Ruta r : rutas){
            if(r.getCorreoConductor() == correo){
                devolver.add(r);
            }
        }
        return devolver;
    }
    
    @ApiMethod(name = "eliminarRuta")
    public void eliminarRuta(@Named("correoConductor") String correo, @Named("hora") Date hora, @Named("fecha") Date fecha){
        for(Ruta r : rutas){
            if(r.getCorreoConductor() == correo){
                if(r.getFecha() == fecha && r.getHora() == hora){
                    rutas.remove(r);
                    break;
                }
            }
        }
    }
    
    @ApiMethod(name = "actualizarRuta")
    public void actualizarRuta(@Named("correoConductor") String correo, @Named("horaBuscada") Date horaBuscada, @Named("fechaBuscada") Date fechaBuscada, @Named("numeroPuestos") int numeroPuestos, @Named("placaCarro") String placaCarro, @Named("nuevaHora") Date hora, @Named("nuevoPrecio") float precio){
        for(Ruta r : rutas){
            if(r.getCorreoConductor() == correo){
                if(r.getFecha() == fechaBuscada && r.getHora() == horaBuscada){
                    r.setNumeroPuestos(numeroPuestos);
                    r.setPlacaCarro(placaCarro);
                    r.setHora(hora);
                    r.setPrecio(precio);
                }
            }
        }
    }
    
    @ApiMethod(name = "guardarSesion")
    public void guardarSesion(@Named("sesion") int sesion, @Named("correoConductor") String correo){
        Conjunto c = new Conjunto(sesion, correo);
        sesiones.add(c);
    }
    
    @ApiMethod(name = "verificarSesion")
    public Devolver verificarSesion(@Named("sesion") int sesion, @Named("correoConductor") String correo){
        int sesionb = 0;
        for(Conjunto c : sesiones){
            if(c.getSesion() == sesion && c.getCorreo().equals(correo)){
                sesionb = c.getSesion();
            }
        }
        String prueba = Integer.toString(sesionb);
        Devolver cosa = new Devolver(prueba);
        return cosa;
    }
}
