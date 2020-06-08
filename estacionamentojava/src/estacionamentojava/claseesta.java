
package estacionamentojava;

import javax.swing.JOptionPane;

public class claseesta {

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getEnt() {
        return ent;
    }

    public void setEnt(double ent) {
        this.ent = ent;
    }

    public double getSai() {
        return sai;
    }

    public void setSai(double sai) {
        this.sai = sai;
    }

    public double getVtotal() {
        return vtotal;
    }

    public void setVtotal(double vtotal) {
        this.vtotal = vtotal;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    
    
    public String modelo,placa;
     public double ent,sai,vtotal,tempo;  
     
     public double tempousado(double ent, double sai) {
        
         this.tempo = this.sai - this.ent;
         return this.tempo;
     
     }
     
     public double pagamento (double tempo) {
     
         this.vtotal = Math.ceil(this.tempo);
         this.vtotal = this.vtotal * 4;
         return this.vtotal;
     
     }
     
     

    void ntfiscal(String modelo, double ent, String placa, double sai, double tempo, double vtotal) {
      
       JOptionPane.showMessageDialog(null,"entrada:"
               +this.ent +"\nsaída:"+this.sai+"\nmodelo:"+this.modelo+"\nplaca:"+this.placa+"\ntempo"+this.tempo+"\ntotal"+this.vtotal
     
       );
        
    }
     
     
}
