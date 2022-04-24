/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class ModeloPlato extends Platos{

    ConectionPg cp = new ConectionPg();

    public ModeloPlato() {
    }

    public ModeloPlato(String cedula, String nombre) {
        super(cedula, nombre);
    }

    public List<Platos> litaaaaa() {

        List<Platos> lpa = new ArrayList<Platos>();
        String sql = "select * from per;";
        ResultSet rs = cp.consulta(sql);
        try {
            while (rs.next()) {
                Platos pa = new Platos();
                pa.setCedula(rs.getString("nom"));
                pa.setNombre(rs.getString("ape"));
                lpa.add(pa);
            }
            rs.close();
            return lpa;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPlato.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
