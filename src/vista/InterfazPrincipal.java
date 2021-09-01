
package vista;

import test.Control;

public interface InterfazPrincipal {
    
    void setControlador(Control c);
    void insertarDatos();
    void actualizarDatos();
    
    static final String INSERTAR="Insertar";
    static final String PROCESAR="Procesar";
    
}
