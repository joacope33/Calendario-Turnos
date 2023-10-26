
package Model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



@Entity
@Table(name = "paciente", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"turno", "Hora"})
})
public class Paciente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private long DNI;
    private String nombre;
    private String  obraSocial;
    private long numeroCelular;
    @Column(name = "turno")
    private Date turno;
    @Column(name = "hora")
    private Time hora; 

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }




    

    public Date getTurno() {
        return turno;
    }

    public void setTurno(Date turno) {
        this.turno = turno;
    }

    public Paciente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }






    public Paciente(String nombre, long DNI, String obraSocial, long numeroCelular) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.obraSocial = obraSocial;
        this.numeroCelular = numeroCelular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public long getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(long numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", DNI=" + DNI + ", nombre=" + nombre + ", obraSocial=" + obraSocial + ", numeroCelular=" + numeroCelular + ", turno=" + turno + ", hora=" + hora + '}';
    }


    
    
}
