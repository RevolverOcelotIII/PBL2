/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricardoeletro;

import java.util.ArrayList;

/**
 *
 * @author danpg
 */
    class Ferro extends Eletros{
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
