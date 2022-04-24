/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutar;

import Controlador.ControladorMenu;
import Vista.MenuPrincipal;

/**
 *
 * @author DELL
 */
public class Main_Ejecutar {
    public static void main(String[] args) {
        MenuPrincipal mp = new MenuPrincipal();
        ControladorMenu cp = new ControladorMenu(mp);
        cp.controlBoton();
    }
    
}
