
package com.mycompany.calendario.login.Persistencia;

import com.mycompany.calendario.login.Logica.Paciente;
import com.mycompany.calendario.login.Logica.Usuario;
import com.mycompany.calendario.login.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ControladoraPersistencia {
    private static ControladoraPersistencia instancia;
    
    private ControladoraPersistencia (){
        
    }
    public static ControladoraPersistencia getInstancia(){
         if (instancia == null) {
            instancia = new ControladoraPersistencia();
        }
        return instancia;
    }
    
    
    UsuarioJpaController usuJpa= new UsuarioJpaController();
    PacienteJpaController pacJpa = new PacienteJpaController();
    
    public List<Usuario> traerUsuarios() {
        List<Usuario> listaUsuario= usuJpa.findUsuarioEntities();
        
        return listaUsuario;
    }
    public List<Paciente> traerPacientes(){
        List<Paciente> listaPaciente= pacJpa.findPacienteEntities();
        
        return listaPaciente;
    }
    public void crearTurno(Paciente paci){
      pacJpa.create(paci);
    }   
    public int numeroId(){
        
        return pacJpa.getPacienteCount();
    }
    
    public void eliminarTurno(int  id){
        try {
            pacJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void editarTurno(Paciente paci){
        try{
            pacJpa.edit(paci);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public Paciente findTurno(int id){
        return pacJpa.findPaciente(id);
    }
 
}