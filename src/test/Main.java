package test;

import dominio.cajaAhorro;
import vista.InterfazPrincipal;
import vista.testCajaAhorro;

public class Main {

    public static void main(String args[]) {

        InterfazPrincipal IPrincipal = new testCajaAhorro();
        cajaAhorro cajaAhorro = new cajaAhorro();

        Control control = new Control(IPrincipal, cajaAhorro);

        IPrincipal.setControlador(control);



    }

}
