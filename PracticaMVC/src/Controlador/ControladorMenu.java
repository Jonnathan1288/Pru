/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloPlato;
import Vista.MenuPrincipal;
import Vista.Plato;

/**
 *
 * @author DELL
 */
public class ControladorMenu {
    private MenuPrincipal vistap; 
    
    public ControladorMenu(MenuPrincipal vistap) {
        this.vistap = vistap;
        vistap.setVisible(true);
    }
    public void controlBoton(){
        vistap.getBurnPlato().addActionListener(l->Ventanaplatos());
    }
    private void Ventanaplatos(){
        Plato pt = new Plato();
        ModeloPlato mod = new ModeloPlato();
        vistap.getDesktop().add(pt);
        ControladorPlato cp = new ControladorPlato(pt, mod);
    }
    
    
}
