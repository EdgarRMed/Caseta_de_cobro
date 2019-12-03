/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.Auto;
import Model.Autobus;
import Model.Caseta;
import Model.Moto;
import Model.Transporte;
import View.FTicket;
import View.MainView;
import View.PAgregarVehiculo;
import View.Pcobrar;
import View.Plogin;
import View.Pop;
import View.Pset;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sun.security.krb5.internal.Ticket;

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
    public FTicket ticket;
    
    public Controler(MainView view, Caseta model){
    
        this.view = view;
        this.model = model;
    }
    
    public void start(){    // Se inicia la aplicación
       view.setTitle("Caseta");
       view.setSize(280, 370);
       view.setLocationRelativeTo(null);
       view.setResizable(false);
       initComponents();
    }
    
    public void initComponents(){
        // Se instancian todos los paneles
        pagregaVehiculor = new PAgregarVehiculo();
        pCobrar = new Pcobrar();
        pLogin = new Plogin();
        pOp = new Pop();
        pSet = new Pset();
        ticket = new FTicket();
        // Fin instancia de componentes 
        
        // Se agrea el panel principal al Frame
        //pLogin.setSize(200,500);
        //pLogin.setLocation(0,0);
        view.MainPanel.removeAll();
        view.MainPanel.add(pLogin, BorderLayout.CENTER);
        view.MainPanel.revalidate();
        view.MainPanel.repaint();
        // Fin agregación 
        
        // Se agregan los ecuchas
        pLogin.btContaseña.addActionListener(this);
        pSet.btAceptar.addActionListener(this);
        pOp.btCobrar.addActionListener(this);
        pCobrar.btRegresar.addActionListener(this);
        pCobrar.cbUbicacion.addActionListener(this);
        pCobrar.btAceptar.addActionListener(this);
        pOp.btIngresar.addActionListener(this);
        pOp.btReinicio.addActionListener(this);
        pagregaVehiculor.btAuto.addActionListener(this);
        pagregaVehiculor.btCamion.addActionListener(this);
        pagregaVehiculor.btMoto.addActionListener(this);
        pagregaVehiculor.btRegresar.addActionListener(this);
        pagregaVehiculor.cbUbicacion.addActionListener(this);
        ticket.btAceptar.addActionListener(this);
        // Fin escuchas
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        // Eventos del panel LogIn
        if(e.getSource() == pLogin.btContaseña){
            // Exepción aquí
            if(pLogin.txContraseña.getText().equals(model.password)){
                view.MainPanel.removeAll();
                view.MainPanel.add(pSet, BorderLayout.CENTER);
                view.MainPanel.revalidate();
                view.setSize(400, 400);
                view.MainPanel.repaint();
                
            }
            // Exepción contraseña incorrecta 
        }
        // Fin eventos del panel LogIn

        
        // Eventos del Panel Set
        if(e.getSource() == pSet.btAceptar){
            
            view.MainPanel.removeAll();
            view.MainPanel.add(pOp, BorderLayout.CENTER);
            view.MainPanel.revalidate();
            view.MainPanel.repaint();
            model.setCaseta(Integer.valueOf(pSet.txLongitud.getText()),
                            Integer.valueOf(pSet.txUbicacion.getText()),
                            Integer.valueOf(pSet.txCobro.getText()));
        
        } // Excepcion de campo faltante 
        // Fin eventos del panel Set
        
        
        // Eventos del panel Pop
        if(e.getSource() == pOp.btReinicio){
            view.MainPanel.removeAll();
            view.MainPanel.add(pSet, BorderLayout.CENTER);
            view.MainPanel.revalidate();
            view.MainPanel.repaint();
        }
        
        if(e.getSource() == pOp.btIngresar){
            view.setSize(600, 390);
            view.MainPanel.removeAll();
            view.MainPanel.add(pagregaVehiculor, BorderLayout.CENTER);
            view.MainPanel.revalidate();
            view.MainPanel.repaint();
        }
        
        if(e.getSource() == pOp.btCobrar){
            view.setSize(600, 390);
            view.MainPanel.removeAll();
            view.MainPanel.add(pCobrar, BorderLayout.CENTER);
            view.MainPanel.revalidate();
            view.MainPanel.repaint();
        }
        // Fin eventos del panel Pop
        
        
        // Eventos del panel agregar vehiculo
        if(e.getSource() == pagregaVehiculor.btRegresar){
            view.MainPanel.removeAll();
            view.MainPanel.add(pOp, BorderLayout.CENTER);
            view.MainPanel.revalidate();
            view.MainPanel.repaint();
        }
        
        if(e.getSource() == pagregaVehiculor.btAuto){
            // Excepción aquí
            if(pagregaVehiculor.cbUbicacion.isSelected()){
                model.agregarTransporte(new Auto(pagregaVehiculor.txPlaca.getText()));
            }
            else
                model.agregarTransporte(new Auto(pagregaVehiculor.txPlaca.getText()),
                                        Integer.valueOf(pagregaVehiculor.txEntrada.getText()));
        }
        
        if(e.getSource() == pagregaVehiculor.btMoto){
            // Excepción aquí
            if(pagregaVehiculor.cbUbicacion.isSelected()){
                model.agregarTransporte(new Moto(pagregaVehiculor.txPlaca.getText()));
            }
            else
                model.agregarTransporte(new Moto(pagregaVehiculor.txPlaca.getText()),
                                        Integer.valueOf(pagregaVehiculor.txEntrada.getText()));
        }
        
        if(e.getSource() == pagregaVehiculor.btCamion){
            // Excepción aquí
            if(pagregaVehiculor.cbUbicacion.isSelected()){
                model.agregarTransporte(new Autobus(pagregaVehiculor.txPlaca.getText()));
            }
            else
                model.agregarTransporte(new Autobus(pagregaVehiculor.txPlaca.getText()),
                                        Integer.valueOf(pagregaVehiculor.txEntrada.getText()));
        }
        
        if(e.getSource() == pagregaVehiculor.cbUbicacion){
            if(pagregaVehiculor.cbUbicacion.isSelected()){
               pagregaVehiculor.txEntrada.setText(null);
               pagregaVehiculor.txEntrada.setEditable(false);
            }
            else{
                pagregaVehiculor.txEntrada.setEditable(true);
                pagregaVehiculor.txEntrada.setText(null);
           }
       }
        // Fin eventos de agregar vehiculo
        
        
        // Eventos del panel cobrar
        if (e.getSource() == pCobrar.btRegresar){
            view.MainPanel.removeAll();
            view.MainPanel.add(pOp, BorderLayout.CENTER);
            view.MainPanel.revalidate();
            view.MainPanel.repaint();   
        }
        
       if(e.getSource() == pCobrar.cbUbicacion){
            if(pCobrar.cbUbicacion.isSelected()){
               pCobrar.txSalida.setText(null);
               pCobrar.txSalida.setEditable(false);
            }
            else{
                pCobrar.txSalida.setEditable(true);
                pCobrar.txSalida.setText(null);
           }
       }
       
       if(e.getSource() == pCobrar.btAceptar){
           
           //model.cobrarTransporte(pCobrar.txPlaca.getText());
           for(Transporte t: model.transportes){
               if(pCobrar.txPlaca.getText().equals(t.getPlaca())){
                   int index = model.transportes.indexOf(t);
                   System.out.println("Lo enconto");
                   ticket.txPlaca.setText(t.getPlaca());
                   ticket.txEntrada.setText(String.valueOf(t.getEntradaKm()));
                   ticket.txKilometros.setText(String.valueOf(model.tarifa));
                   if(pCobrar.cbUbicacion.isSelected()){
                   ticket.txSalida.setText(String.valueOf(model.ubicacionCaseta));
                   ticket.txCobro.setText(String.valueOf(t.calcularTarifa(model.tarifa, model.ubicacionCaseta)));
                   }
                   else{
                   ticket.txSalida.setText(String.valueOf(pCobrar.txSalida.getText()));
                   ticket.txCobro.setText(String.valueOf(t.calcularTarifa(model.tarifa,Integer.valueOf(pCobrar.txSalida.getText()))));
                   }
                   ticket.setVisible(true);
                   
                   model.transportes.remove(t);
                   break;
               }
           }
       }
        // Fin eventos del panel cobrar
        if(e.getSource() == ticket.btAceptar)
            ticket.dispose();

        
    }
    
    
}
