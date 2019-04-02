/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricardoeletro;

import javax.swing.ImageIcon;


/**
 *
 * @author danpg
 */
class Batedeira extends Eletros{
    ImageIcon ImBat = new ImageIcon(getClass().getResource("Batedeira.png"));
    ImageIcon ImBatPh = new ImageIcon(getClass().getResource("Batedeira Philips.png"));
    ImageIcon ImBatAr = new ImageIcon(getClass().getResource("Batedeira Arno.png"));
    ImageIcon ImBatCa = new ImageIcon(getClass().getResource("Batedeira Cadence.png"));
    ImageIcon ImBatEl = new ImageIcon(getClass().getResource("Batedeira Electrolux.png"));
    private int qthelices;
    private double quantidadeM;

    public int getQthelices() {
        return qthelices;
    }

    public void setQthelices(int qthelices) {
        this.qthelices = qthelices;
    }

    public double getQuantidadeM() {
        return quantidadeM;
    }

    public void setQuantidadeM(double quantidadeM) {
        this.quantidadeM = quantidadeM;
    }
    public void Desconto(int mes){
        if(mes==12){
            this.preço*=0.8;
        }
    }
    public void cQuantidadeM(int capacidade,int quantidade){
        this.quantidadeM=(quantidade/capacidade)*this.qthelices;
    }
}
