/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricardoeletro;


/**
 *
 * @author danpg
 */
class Batedeira extends Eletros{
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
