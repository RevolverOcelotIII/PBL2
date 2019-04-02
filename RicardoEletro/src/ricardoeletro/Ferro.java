
package ricardoeletro;

import javax.swing.ImageIcon;


/**
 *
 * @author danpg
 */
    class Ferro extends Eletros{
        ImageIcon ImFe = new ImageIcon(getClass().getResource("Ferro.png"));
        ImageIcon ImFePh = new ImageIcon(getClass().getResource("Ferro Philips.png"));
        ImageIcon ImFeCa = new ImageIcon(getClass().getResource("Ferro Cadence.png"));
        ImageIcon ImFeEl = new ImageIcon(getClass().getResource("Ferro Electrolux.png"));
        ImageIcon ImFeAr = new ImageIcon(getClass().getResource("Ferro Arno.png"));
        public void Desconto(int mes){
            this.preço*=0.85;
        }
        @Override
        public boolean defVoltagem(int volts){
            if(volts==110||volts==220||volts==5){
                this.voltagem=volts;
                return false;
            }
            return true;
        }
    }
