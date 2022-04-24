/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloPlato;
import Modelo.Platos;
import Vista.Plato;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JOptionPane;
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
        EventosPlatos();
        control();

    }

    public void control() {
        vistaPlato.getBtnCrear().addActionListener(l -> abrir());
    }

    public void abrir() {
        vistaPlato.getDialogoPlato().setSize(500, 500);
        vistaPlato.getDialogoPlato().setVisible(true);
    }

    private void EventosPlatos() {
        KeyListener cm = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                System.out.println(""+c);
                if(c == ','){
                    e.consume();
                }
//                if (c < '0' || c > '9'  c == '.') {
//                    e.consume();
//                }
//                if (Character.isLetter(c)) {
//                    e.consume();
//                    JOptionPane.showMessageDialog(vistaPlato.getDialogoPlato(), "Por favor, debe ingresar solo números en este campo.");
//                }
            }

            @Override

            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };
        vistaPlato.getTxtPrecio().addKeyListener(cm);
    }

    private void cargarDatos() {
        DefaultTableModel tb = (DefaultTableModel) vistaPlato.getTablePERSO().getModel();
        tb.setNumRows(0);
        List<Platos> litap = model.litaaaaa();
        litap.stream().forEach(p -> {
            String[] li = {p.getCedula(), p.getNombre()};
            tb.addRow(li);
        });
    }

}
