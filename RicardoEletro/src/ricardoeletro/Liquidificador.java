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
class Liquidificador extends Eletros implements Helicoidal{
        ImageIcon Fliq = new ImageIcon(getClass().getResource("Liquidificador.png"));
        ImageIcon FliqPh = new ImageIcon(getClass().getResource("Liquidificador Philips.png"));
        ImageIcon FliqEl = new ImageIcon(getClass().getResource("Liquidificador Electrolux.png"));
        ImageIcon FliqAr = new ImageIcon(getClass().getResource("Liquidificador Arno.png"));
        ImageIcon FliqCa = new ImageIcon(getClass().getResource("Liquidificador Cadence.png"));
        private String cor;
        private String descrição;
        private double quantidadeM;

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public String getDescrição() {
            return descrição;
        }

        public void setDescrição(String descrição) {
            this.descrição = descrição;
        }

        public double getQuantidadeM() {
            return quantidadeM;
        }

        public void setQuantidadeM(double quantidadeM) {
            this.quantidadeM = quantidadeM;
        }

        @Override
        public String getMarca() {
            return marca;
        }

        @Override
        public void setMarca(String marca) {
            this.marca = marca;
        }

        @Override
        public double getPreço() {
            return preço;
        }

        @Override
        public void setPreço(double preço) {
            this.preço = preço;
        }

        @Override

        public int getVoltagem() {
            return voltagem;
        }

        @Override
        public void setVoltagem(int voltagem) {
            this.voltagem = voltagem;
        }
        @Override
        public void Desconto(int mes){
            if(mes==8){
                this.preço*=0.9;
            }
        }
        @Override
        public void cQuantidadeM(double capacidade,double quantidade){
            this.quantidadeM=quantidade/capacidade;
        }
    }