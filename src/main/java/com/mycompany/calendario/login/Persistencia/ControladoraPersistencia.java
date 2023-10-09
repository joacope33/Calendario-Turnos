
package com.mycompany.calendario.login.Persistencia;

import com.mycompany.calendario.login.Logica.Usuario;
import java.util.List;



public class ControladoraPersistencia {
    UsuarioJpaController usuJpa= new UsuarioJpaController();

    public List<Usuario> traerUsuarios() {
        List<Usuario> listaUsuario= usuJpa.findUsuarioEntities();
        
        return listaUsuario;
    }
    
}