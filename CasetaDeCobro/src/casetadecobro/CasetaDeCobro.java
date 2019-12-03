
package casetadecobro;

import Controler.Controler;
import Model.Caseta;
import View.MainView;
import javax.swing.JFrame;

public class CasetaDeCobro {

    // Test de la aplicación
    public static void main(String[] args) {
        Caseta model = new Caseta();
        MainView view = new MainView();
        Controler controler = new Controler(view, model);
        controler.start();
        controler.view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controler.view.setLocationRelativeTo(null);
        controler.view.setVisible(true);
       
    }
    
}
