/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloPlato;
import Modelo.Platos;
import Vista.Plato;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class ControladorPlato {
    private Plato vistaPlato;
    private ModeloPlato model;

    public ControladorPlato(Plato vistaPlato, ModeloPlato model) {
        this.vistaPlato = vistaPlato;
        this.model = model;
        vistaPlato.setVisible(true);
        cargarDatos();
    }
    
    private void cargarDatos(){
        DefaultTableModel tb = (DefaultTableModel)vistaPlato.getTablePERSO().getModel();
        tb.setNumRows(0);
        List<Platos> litap = model.litaaaaa();
        litap.stream().forEach(p ->{
            String[]li = {p.getCedula(), p.getNombre()};
            tb.addRow(li);
        });
    }
    
}
