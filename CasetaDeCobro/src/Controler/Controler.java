/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.Caseta;
import View.MainView;
import View.PAgregarVehiculo;
import View.Pcobrar;
import View.Plogin;
import View.Pop;
import View.Pset;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Edgar Medina <edgarrmedinalozano at gmail.com>
 */
public class Controler implements ActionListener{
    
    // Atributos del controlador
    public MainView view;
    private Caseta model;
    public PAgregarVehiculo pagregaVehiculor;
    public Pcobrar pCobrar;
    public Plogin pLogin;
    public Pop pOp;
    public Pset pSet;
    
    public Controler(MainView view, Caseta model){
    
        this.view = view;
        this.model = model;
    }
    
    public void start(){    // Se inicia la aplicación
       view.setTitle("Graficador");
       view.setSize(400, 500);
       view.setLocationRelativeTo(null);
       initComponents();
    }
    
    public void initComponents(){
        // Se instancian todos los paneles
        pagregaVehiculor = new PAgregarVehiculo();
        pCobrar = new Pcobrar();
        pLogin = new Plogin();
        pOp = new Pop();
        pSet = new Pset();
        // Fin instancia de componentes 
        
        // Se agrea el panel principal al Frame
        pLogin.setSize(200,500);
        pLogin.setLocation(0,0);
        view.MainPanel.removeAll();
        view.MainPanel.add(pLogin, BorderLayout.CENTER);
        view.MainPanel.revalidate();
        view.MainPanel.repaint();
        // Fin agregación 
        
        // Se agregan los ecuchas
        pLogin.btContaseña.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Eventos del panel LogIn
        if(e.getSource() == pLogin.btContaseña){
            // Exepción aquí
            if(pLogin.txContraseña.getText() == model.password){
            view.MainPanel.removeAll();
            view.MainPanel.add(pSet, BorderLayout.CENTER);
            view.MainPanel.revalidate();
            view.MainPanel.repaint();
            }
        }
    }
}
