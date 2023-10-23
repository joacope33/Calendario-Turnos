
package com.mycompany.calendario.login;

import com.mycompany.calendario.login.IGU.LoginVentana;



public class CalendarioLogin {

    public static void main(String[] args) {
        LoginVentana loguearse = LoginVentana.getInstancia();
        loguearse.setVisible(true);
        loguearse.setLocationRelativeTo(null);
       
            
        }
}
