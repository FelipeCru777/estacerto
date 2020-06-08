
package estacionamentojava;

import javax.swing.JOptionPane;


public class Estacionamentojava {

    
    public static void main(String[] args) {
        
       claseesta obg = new claseesta ();
      
               
       obg.setModelo(JOptionPane.showInputDialog("Informe o modelo:"));
       
       obg.setPlaca(JOptionPane.showInputDialog("Informe a placa:"));
       
       obg.setEnt(Double.parseDouble(JOptionPane.showInputDialog("Informe a hora de entrada:")));
       
       obg.setSai(Double.parseDouble(JOptionPane.showInputDialog("Informe a hora de saida:")));
       
       
      obg.tempousado(obg.getEnt(),obg.getSai());
      
      obg.pagamento(obg.getVtotal());
      
      
       
       obg.ntfiscal(obg.getModelo(), obg.getEnt(), obg.getPlaca(), obg.getSai(), obg.getTempo(), obg.getVtotal());
       
     
      
      
       
        
    }
    
}
