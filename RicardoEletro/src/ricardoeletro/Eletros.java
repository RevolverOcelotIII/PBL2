package ricardoeletro;

/**
 *
 * @author danpg
 */
public abstract class Eletros {
    protected String marca;
    protected double preço;
    protected int voltagem;
    
    public abstract void Desconto(int mes);

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
    
    public boolean defVoltagem(int volts){
        if(volts==110||volts==220){
            this.voltagem=volts;
            return false;
        }
        return true;
    }
}
