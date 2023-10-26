package Controller;




import Model.Paciente;
import Model.Usuario;
import Persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    ControladoraPersistencia controlPersis;// = new ControladoraPersistencia();
    
    public Controladora(){
        controlPersis= ControladoraPersistencia.getInstancia();
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
    public String validarPaciente(String nombre, long DNI) {
         String mensaje="";
        List<Paciente> listaPaciente = controlPersis.traerPacientes();
        
       
        for(Paciente pac: listaPaciente){
            if(pac.getNombre().equals(nombre)){
                if(pac.getDNI()==(DNI)){
                    mensaje="Paciente encontrado";
                }
                else{
                    mensaje="Paciente Incorrecta";
                }
                
            }
            else{
                mensaje="Paciente no encontrado";
            }
        }
        return mensaje;
    }
    public void crearTurno(Paciente paci){
        controlPersis.crearTurno(paci);
    }    
    public int numeroId(){
        return controlPersis.numeroId();
    }
    public void eliminarTurno(int id){
        controlPersis.eliminarTurno(id);
    }
    public void editarTurno(Paciente paci){
        controlPersis.editarTurno(paci);
    }
    public Paciente findTurno(int id){
        return controlPersis.findTurno(id);
    }
}   
