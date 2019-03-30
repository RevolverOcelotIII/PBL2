package ricardoeletro;

import java.util.ArrayList;

/**
 *
 * @author danpg
 */
public class Eletros {
    protected String marca;
    protected double preço;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public ArrayList<Eletros> getNeletro() {
        return Neletro;
    }

    public void setNeletro(ArrayList<Eletros> Neletro) {
        this.Neletro = Neletro;
    }
    protected int voltagem;
    
    ArrayList<Eletros> Neletro = new ArrayList();
    
    
    public boolean defVoltagem(int volts){
        if(volts==110||volts==220){
            this.voltagem=volts;
            return false;
        }
        return true;
    }
}
