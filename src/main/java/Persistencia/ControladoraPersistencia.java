
package Persistencia;

import Model.Paciente;
import Model.Usuario;
import PërsistenciaExcepciones.NonexistentEntityException;
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
            if(e.equals("1062")){
                System.out.println("Turnito duplicado pa");
        }

        
            
        }
    }
    public Paciente findTurno(int id){
        return pacJpa.findPaciente(id);
    }
 
}