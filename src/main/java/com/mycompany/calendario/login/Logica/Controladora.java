
package com.mycompany.calendario.login.Logica;

import com.mycompany.calendario.login.Persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    ControladoraPersistencia controlPersis;// = new ControladoraPersistencia();
    
    public Controladora(){
        controlPersis= new ControladoraPersistencia();
    }
    public String validarUsuario(String usuario, String contrasenia) {
         String mensaje="";
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        
       
        for(Usuario usu: listaUsuarios){
            if(usu.getNombreUsuario().equals(usuario)){
                if(usu.getContrasenia().equals(contrasenia)){
                    mensaje="Usuario y contrasenia correctos. Bienvenidos/as!";
                }
                else{
                    mensaje="Contrasenia Incorrecta";
                }
                
            }
            else{
                mensaje="Usuario no encontrado";
            }
        }
        return mensaje;
    }
    
}
