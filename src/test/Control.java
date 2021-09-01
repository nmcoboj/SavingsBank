package test;

import dominio.cajaAhorro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import vista.InterfazPrincipal;

public class Control implements ActionListener{
    
    private InterfazPrincipal IPrincipal;
    private cajaAhorro cAhorro;

    public Control(InterfazPrincipal IPrincipal, cajaAhorro cAhorro) {
        this.IPrincipal = IPrincipal;
        this.cAhorro = cAhorro;
    }
   

    @Override
    public void actionPerformed(ActionEvent evento) {
       if (evento.getActionCommand().equals(InterfazPrincipal.INSERTAR)) {
                IPrincipal.insertarDatos();
        }
        if (evento.getActionCommand().equals(InterfazPrincipal.PROCESAR)) {
                IPrincipal.actualizarDatos();
        }
    }
    
    
    
    
    
    
}
