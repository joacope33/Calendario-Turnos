
package com.mycompany.calendario.login.Logica;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Paciente implements Serializable {
    // Obtener la fecha y hora actual en la zona horaria local

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private long DNI;
    private String nombre;
    private String  obraSocial;
    private long numeroCelular;
    private Date turno;
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