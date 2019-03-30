package ricardoeletro;

import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author danpg
 */
public class RicardoEletro {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "⚡⚡🤡🤡RICARDO SHOKK🤡🤡⚡⚡");
        int mes;
        do{
            mes=Integer.parseInt(JOptionPane.showInputDialog("Em que mês estamos?"));
            if(mes<=0||mes>12){
                JOptionPane.showMessageDialog(null,"Este mês é inválido");
            }
        }while(mes<=0||mes>12);
        String optADD[]={"Liquidificador","Ferro de Passar","Batedeira","Voltar"};
        String optG[]={"Gerenciar","Adicionar","Sair"};
        ArrayList <Liquidificador> ArrLiq = new ArrayList();
        ArrayList <Ferro> ArrFe = new ArrayList();
        ArrayList <Batedeira> ArrBat = new ArrayList();
        int choiceADD,choiceG,choiceGE;
        boolean ops;
            do{
                choiceG=JOptionPane.showOptionDialog(null, "O que deseja fazer?", "RICARDO SHOKK", 0, 0, null, optG, null);
                switch(choiceG){
                    case 1:
                    
                        do{
                            choiceADD=JOptionPane.showOptionDialog(null, "O que deseja adicionar à loja?", "RICARDO SHOKK", 0, 0, null, optADD, null); 
                            if(choiceADD==0){
                                Liquidificador liq=new Liquidificador();
                                liq.setMarca(JOptionPane.showInputDialog("Insira a marca do Produto:"));
                                liq.setCor(JOptionPane.showInputDialog("Insira a cor do Produto:"));
                                do{
                                   int volts=Integer.parseInt(JOptionPane.showInputDialog("Insira a Voltagem do Produto:"));
                                   ops=liq.defVoltagem(volts);
                                   if(ops==true){
                                       JOptionPane.showMessageDialog(null, "Esta Voltagem é inválida, por favor insira outra");
                                   }
                                }while(ops==true);
                                liq.setPreço(Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do Produto:")));
                                liq.Desconto(mes);
                                liq.setDescrição(JOptionPane.showInputDialog("Insira a descrição do Liquidificador:"));
                                liq.setTampa(JOptionPane.showInputDialog("Insira o tipo da tampa:"));
                                int quantidade=Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do produto"));
                                int capacidade=Integer.parseInt(JOptionPane.showInputDialog("Insira a capacidade do produto"));
                                liq.cQuantidadeM(capacidade, quantidade);
                                ArrLiq.add(liq);
                                JOptionPane.showMessageDialog(null, "Cabo");
                            }

                            if(choiceADD==1){
                                Ferro Fe=new Ferro();
                                Fe.setMarca(JOptionPane.showInputDialog("Insira a marca do Produto:"));
                                Fe.setPreço(Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do Produto:")));
                                Fe.Desconto(mes);
                                do{
                                   int volts=Integer.parseInt(JOptionPane.showInputDialog("Insira a Voltagem do Produto:"));
                                   ops=Fe.defVoltagem(volts);
                                   if(ops==true){
                                       JOptionPane.showMessageDialog(null, "Esta Voltagem é inválida, por favor insira outra");
                                   }
                                }while(ops==true);
                                ArrFe.add(Fe);
                                JOptionPane.showMessageDialog(null, "Cabo");
                            }

                            if(choiceADD==2){
                                Batedeira Bat= new Batedeira();
                                Bat.setMarca(JOptionPane.showInputDialog("Insira a marca do Produto:"));
                                Bat.setQthelices(Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de hélices:")));
                                Bat.setPreço(Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do Produto:")));
                                Bat.Desconto(mes);
                                do{
                                   int volts=Integer.parseInt(JOptionPane.showInputDialog("Insira a Voltagem do Produto:"));
                                   ops=Bat.defVoltagem(volts);
                                   if(ops==true){
                                       JOptionPane.showMessageDialog(null, "Esta Voltagem é inválida, por favor insira outra");
                                   }
                                }while(ops==true);
                                int quantidade=Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do produto"));
                                int capacidade=Integer.parseInt(JOptionPane.showInputDialog("Insira a capacidade do produto"));
                                Bat.cQuantidadeM(capacidade, quantidade);
                                ArrBat.add(Bat);
                                JOptionPane.showMessageDialog(null, "Cabo");
                            }
                        }while(choiceADD!=3);
                        break;
                        
                    case 0:
                        
                        do{
                            choiceGE=JOptionPane.showOptionDialog(null, "O que deseja gerenciar?", null, 0, 0, null, optADD, null);
                            switch (choiceGE){
                                case 0:
                                    if(ArrLiq.isEmpty()){
                                        JOptionPane.showMessageDialog(null,"Não há nenhum item para ser gerenciado, por favor adicione um para prosseguir");
                                        continue;
                                    }
                                    int vG;
                                    vG=Integer.parseInt(JOptionPane.showInputDialog("Ítens disponíveis: "+ArrLiq.size()+"\nInsira o número correspondente ao item que deseja gerenciar:"));
                                    if(vG>ArrLiq.size()||vG<=0){
                                        JOptionPane.showMessageDialog(null,"Não foi encontrado nenhum ítem com essa numeração");
                                        continue;
                                    }
                                    JOptionPane.showMessageDialog(null,"Liquidificador "+vG+":\nMarca: "+ArrLiq.get(vG-1).getMarca()+"\nPreço: "+ArrLiq.get(vG-1).getPreço()+"\nVoltagem: "+ArrLiq.get(vG-1).getVoltagem()+"v\nTampa: "+ArrLiq.get(vG-1).getTampa()+"\nCor: "+ArrLiq.get(vG-1).getCor()+"\nQuantidade Média: "+ArrLiq.get(vG-1).getQuantidadeM()+"\nDescrição: "+ArrLiq.get(vG-1).getDescrição()+"");                                                            
                                    break;
                                case 1:
                                    if(ArrFe.isEmpty()){
                                        JOptionPane.showMessageDialog(null,"Não há nenhum item para ser gerenciado, por favor adicione um para prosseguir");
                                        continue;
                                    }
                                    int vF;
                                    vF=Integer.parseInt(JOptionPane.showInputDialog("Ítens disponíveis: "+ArrFe.size()+"\nInsira o número correspondente ao item que deseja gerenciar:"));
                                    if(vF>ArrFe.size()||vF<=0){
                                        JOptionPane.showMessageDialog(null,"Não foi encontrado nenhum ítem com essa numeração");
                                        continue;
                                    }
                                    JOptionPane.showMessageDialog(null,"Ferro de Passar "+vF+":\nMarca: "+ArrFe.get(vF-1).getMarca()+"\nPreço: "+ArrFe.get(vF-1).getPreço()+"\nVoltagem: "+ArrFe.get(vF-1).getVoltagem()+"v");
                                    break;
                                case 2:
                                    if(ArrBat.isEmpty()){
                                        JOptionPane.showMessageDialog(null,"Não há nenhum item para ser gerenciado, por favor adicione um para prosseguir");
                                        continue;
                                    }
                                    int vB;
                                    vB=Integer.parseInt(JOptionPane.showInputDialog("Ítens disponíveis: "+ArrBat.size()+"\nInsira o número correspondente ao item que deseja gerenciar:"));
                                    if(vB>ArrBat.size()||vB<=0){
                                        JOptionPane.showMessageDialog(null,"Não foi encontrado nenhum ítem com essa numeração");
                                        continue;
                                    }
                                    JOptionPane.showMessageDialog(null,"Ferro de Passar "+vB+":\nMarca: "+ArrBat.get(vB-1).getMarca()+"\nPreço: "+ArrBat.get(vB-1).getPreço()+"\nVoltagem: "+ArrBat.get(vB-1).getVoltagem()+"v\nQuantidade Média: "+ArrBat.get(vB-1).getQuantidadeM()+"\nQuantidade de Hélices: "+ArrBat.get(vB).getQthelices()+"");
                                    break;
                            }
                        }while(choiceGE!=3);
                        
                break;
            }
        }while(choiceG!=2);
    }
}
