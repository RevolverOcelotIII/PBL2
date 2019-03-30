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
class Liquidificador extends Eletros{
        private String tampa;
        private String cor;
        private String descrição;
        private double quantidadeM;

        public String getTampa() {
            return tampa;
        }

        public void setTampa(String tampa) {
            this.tampa = tampa;
        }

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
        public void Desconto(int mes){
            if(mes==8){
                this.preço*=0.9;
            }
        }
        public void cQuantidadeM(int capacidade,int quantidade){
            this.quantidadeM=quantidade/capacidade;
        }
    }