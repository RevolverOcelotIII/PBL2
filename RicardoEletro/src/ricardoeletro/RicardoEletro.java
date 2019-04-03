package ricardoeletro;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.ImageIcon;
/**
 *
 * @author danpg
 */
public class RicardoEletro {
    public static void main(String[] args) {
        ArrayList <Liquidificador> ArrLiq = new ArrayList();
        ArrayList <Ferro> ArrFe = new ArrayList();
        ArrayList <Batedeira> ArrBat = new ArrayList();
        String optADD[]={"Liquidificador","Ferro de Passar","Batedeira","Voltar"};
        String optG[]={"Gerenciar","Adicionar","Sair"};
        int choiceADD,choiceG,choiceGE;
        ImageIcon RicShok = new ImageIcon("C:\\Users\\danpg\\OneDrive\\Área de Trabalho\\aaa\\git\\local\\PBL2\\RicardoEletro\\build\\classes\\ricardoeletro\\RicardoShokk.png");
        JOptionPane.showMessageDialog(null,null,"RICARDO SHOKK",JOptionPane.INFORMATION_MESSAGE,RicShok);
        int mes;
        do{
            mes=Integer.parseInt(JOptionPane.showInputDialog("Em que mês estamos?"));
            if(mes<=0||mes>12){
                JOptionPane.showMessageDialog(null,"Este mês é inválido");
            }
        }while(mes<=0||mes>12);
        switch(mes){ 
            case 5:
                JOptionPane.showMessageDialog(null,"Neste mês o ferro está com 15% de desconto!");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Neste mês o liquidificador está com 10% de desconto!");
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "Neste mês a batedeira está com 20% de desconto!");
        }
        boolean ops;
            do{
                choiceG=JOptionPane.showOptionDialog(null, "O que deseja fazer?", "RICARDO SHOKK", 0, 0, null, optG, null);
                switch(choiceG){
                    case 1:
                    
                        do{
                            choiceADD=JOptionPane.showOptionDialog(null, "O que deseja adicionar à loja?", "RICARDO SHOKK", 0, 0, null, optADD, null); 
                            if(choiceADD==0){
                                Liquidificador liq=new Liquidificador();
                                liq.setMarca(JOptionPane.showInputDialog("Insira a marca do Produto:\nMarcas no banco de dados:\nArno\nPhilips\nElectrolux\nCadence"));
                                liq.setCor(JOptionPane.showInputDialog("Insira a cor da tampa:"));
                                liq.setDescrição(JOptionPane.showInputDialog("Insira a descrição da tampa:"));
                                do{
                                   int volts=Integer.parseInt(JOptionPane.showInputDialog("Insira a Voltagem do Produto:"));
                                   ops=liq.defVoltagem(volts);
                                   if(ops==true){
                                       JOptionPane.showMessageDialog(null, "Esta Voltagem é inválida, por favor insira outra");
                                   }
                                }while(ops==true);
                                do{
                                    liq.setPreço(Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do Produto:")));
                                    if(liq.getPreço()<=0){
                                        JOptionPane.showMessageDialog(null,"Este preço é inválido, por favor insira outro");
                                    }
                                }while(liq.getPreço()<=0);
                                liq.Desconto(mes);
                                double quantidade=Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do produto"));
                                double capacidade=Integer.parseInt(JOptionPane.showInputDialog("Insira a capacidade do produto"));
                                liq.cQuantidadeM(capacidade, quantidade);
                                ArrLiq.add(liq);
                                JOptionPane.showMessageDialog(null, "Cabo");
                            }

                            if(choiceADD==1){
                                Ferro Fe=new Ferro();
                                Fe.setMarca(JOptionPane.showInputDialog("Insira a marca do Produto:\nMarcas no banco de dados:\nArno\nPhilips\nElectrolux\nCadence"));
                                do{
                                    Fe.setPreço(Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do Produto:")));
                                    if(Fe.getPreço()<=0){
                                        JOptionPane.showMessageDialog(null,"Este preço é inválido, por favor insira outro");
                                    }
                                }while(Fe.getPreço()<=0);
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
                                Bat.setMarca(JOptionPane.showInputDialog("Insira a marca do Produto:\nMarcas no banco de dados:\nArno\nPhilips\nElectrolux\nCadence"));
                                Bat.setQthelices(Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de hélices:")));
                                do{
                                    Bat.setPreço(Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do Produto:")));
                                    if(Bat.getPreço()<=0){
                                        JOptionPane.showMessageDialog(null,"Este preço é inválido, por favor insira outro");
                                    }
                                }while(Bat.getPreço()<=0);
                                Bat.Desconto(mes);
                                do{
                                   int volts=Integer.parseInt(JOptionPane.showInputDialog("Insira a Voltagem do Produto:"));
                                   ops=Bat.defVoltagem(volts);
                                   if(ops==true){
                                       JOptionPane.showMessageDialog(null, "Esta Voltagem é inválida, por favor insira outra");
                                   }
                                }while(ops==true);
                                double quantidade=Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do produto"));
                                double capacidade=Integer.parseInt(JOptionPane.showInputDialog("Insira a capacidade do produto"));
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
                                    switch (ArrLiq.get(vG-1).getMarca()){
                                        case "Philips":
                                            JOptionPane.showMessageDialog(null,"Liquidificador "+vG+":\nMarca: "+ArrLiq.get(vG-1).getMarca()+"\nPreço: "+ArrLiq.get(vG-1).getPreço()+"\nVoltagem: "+ArrLiq.get(vG-1).getVoltagem()+"v\nCor: "+ArrLiq.get(vG-1).getCor()+"\nQuantidade Média: "+ArrLiq.get(vG-1).getQuantidadeM()+"\nDescrição: "+ArrLiq.get(vG-1).getDescrição()+"",null,JOptionPane.INFORMATION_MESSAGE,ArrLiq.get(vG-1).FliqPh);
                                            break;
                                            
                                        case "Cadence":
                                            JOptionPane.showMessageDialog(null,"Liquidificador "+vG+":\nMarca: "+ArrLiq.get(vG-1).getMarca()+"\nPreço: "+ArrLiq.get(vG-1).getPreço()+"\nVoltagem: "+ArrLiq.get(vG-1).getVoltagem()+"v\nCor: "+ArrLiq.get(vG-1).getCor()+"\nQuantidade Média: "+ArrLiq.get(vG-1).getQuantidadeM()+"\nDescrição: "+ArrLiq.get(vG-1).getDescrição()+"",null,JOptionPane.INFORMATION_MESSAGE,ArrLiq.get(vG-1).FliqCa);
                                            break;
                                            
                                        case "Arno":
                                            JOptionPane.showMessageDialog(null,"Liquidificador "+vG+":\nMarca: "+ArrLiq.get(vG-1).getMarca()+"\nPreço: "+ArrLiq.get(vG-1).getPreço()+"\nVoltagem: "+ArrLiq.get(vG-1).getVoltagem()+"v\nCor: "+ArrLiq.get(vG-1).getCor()+"\nQuantidade Média: "+ArrLiq.get(vG-1).getQuantidadeM()+"\nDescrição: "+ArrLiq.get(vG-1).getDescrição()+"",null,JOptionPane.INFORMATION_MESSAGE,ArrLiq.get(vG-1).FliqAr);
                                            break;
                                            
                                        case "Electrolux":
                                            JOptionPane.showMessageDialog(null,"Liquidificador "+vG+":\nMarca: "+ArrLiq.get(vG-1).getMarca()+"\nPreço: "+ArrLiq.get(vG-1).getPreço()+"\nVoltagem: "+ArrLiq.get(vG-1).getVoltagem()+"v\nCor: "+ArrLiq.get(vG-1).getCor()+"\nQuantidade Média: "+ArrLiq.get(vG-1).getQuantidadeM()+"\nDescrição: "+ArrLiq.get(vG-1).getDescrição()+"",null,JOptionPane.INFORMATION_MESSAGE,ArrLiq.get(vG-1).FliqEl);
                                            break;
                                            
                                        default:
                                            JOptionPane.showMessageDialog(null,"Liquidificador "+vG+":\nMarca: "+ArrLiq.get(vG-1).getMarca()+"\nPreço: "+ArrLiq.get(vG-1).getPreço()+"\nVoltagem: "+ArrLiq.get(vG-1).getVoltagem()+"v\nCor: "+ArrLiq.get(vG-1).getCor()+"\nQuantidade Média: "+ArrLiq.get(vG-1).getQuantidadeM()+"\nDescrição: "+ArrLiq.get(vG-1).getDescrição()+"",null,JOptionPane.INFORMATION_MESSAGE,ArrLiq.get(vG-1).Fliq);                                                            
                                            break;
                                    }
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
                                    switch(ArrFe.get(vF-1).getMarca()){
                                        case "Philips":
                                            JOptionPane.showMessageDialog(null,"Ferro de Passar "+vF+":\nMarca: "+ArrFe.get(vF-1).getMarca()+"\nPreço: "+ArrFe.get(vF-1).getPreço()+"\nVoltagem: "+ArrFe.get(vF-1).getVoltagem()+"v",null,JOptionPane.INFORMATION_MESSAGE,ArrFe.get(vF-1).ImFePh);
                                            break;
                                            
                                        case "Cadence":
                                            JOptionPane.showMessageDialog(null,"Ferro de Passar "+vF+":\nMarca: "+ArrFe.get(vF-1).getMarca()+"\nPreço: "+ArrFe.get(vF-1).getPreço()+"\nVoltagem: "+ArrFe.get(vF-1).getVoltagem()+"v",null,JOptionPane.INFORMATION_MESSAGE,ArrFe.get(vF-1).ImFeCa);
                                            break;
                                            
                                        case "Arno":
                                            JOptionPane.showMessageDialog(null,"Ferro de Passar "+vF+":\nMarca: "+ArrFe.get(vF-1).getMarca()+"\nPreço: "+ArrFe.get(vF-1).getPreço()+"\nVoltagem: "+ArrFe.get(vF-1).getVoltagem()+"v",null,JOptionPane.INFORMATION_MESSAGE,ArrFe.get(vF-1).ImFeAr);
                                            break;
                                            
                                        case "Electrolux":
                                            JOptionPane.showMessageDialog(null,"Ferro de Passar "+vF+":\nMarca: "+ArrFe.get(vF-1).getMarca()+"\nPreço: "+ArrFe.get(vF-1).getPreço()+"\nVoltagem: "+ArrFe.get(vF-1).getVoltagem()+"v",null,JOptionPane.INFORMATION_MESSAGE,ArrFe.get(vF-1).ImFeEl);
                                            break;
                                            
                                        default:
                                            JOptionPane.showMessageDialog(null,"Ferro de Passar "+vF+":\nMarca: "+ArrFe.get(vF-1).getMarca()+"\nPreço: "+ArrFe.get(vF-1).getPreço()+"\nVoltagem: "+ArrFe.get(vF-1).getVoltagem()+"v",null,JOptionPane.INFORMATION_MESSAGE,ArrFe.get(vF-1).ImFe);
                                            break;
                                    }
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
                                    switch(ArrBat.get(vB-1).getMarca()){
                                        case "Philips":
                                            JOptionPane.showMessageDialog(null,"Batedeira "+vB+":\nMarca: "+ArrBat.get(vB-1).getMarca()+"\nPreço: "+ArrBat.get(vB-1).getPreço()+"\nVoltagem: "+ArrBat.get(vB-1).getVoltagem()+"v\nQuantidade Média: "+ArrBat.get(vB-1).getQuantidadeM()+"\nQuantidade de Hélices: "+ArrBat.get(vB-1).getQthelices()+"",null,JOptionPane.INFORMATION_MESSAGE,ArrBat.get(vB-1).ImBatPh);
                                            break;
                                        
                                        case "Arno":
                                            JOptionPane.showMessageDialog(null,"Batedeira "+vB+":\nMarca: "+ArrBat.get(vB-1).getMarca()+"\nPreço: "+ArrBat.get(vB-1).getPreço()+"\nVoltagem: "+ArrBat.get(vB-1).getVoltagem()+"v\nQuantidade Média: "+ArrBat.get(vB-1).getQuantidadeM()+"\nQuantidade de Hélices: "+ArrBat.get(vB-1).getQthelices()+"",null,JOptionPane.INFORMATION_MESSAGE,ArrBat.get(vB-1).ImBatAr);
                                            break;
                                            
                                        case "Electrolux":
                                            JOptionPane.showMessageDialog(null,"Batedeira "+vB+":\nMarca: "+ArrBat.get(vB-1).getMarca()+"\nPreço: "+ArrBat.get(vB-1).getPreço()+"\nVoltagem: "+ArrBat.get(vB-1).getVoltagem()+"v\nQuantidade Média: "+ArrBat.get(vB-1).getQuantidadeM()+"\nQuantidade de Hélices: "+ArrBat.get(vB-1).getQthelices()+"",null,JOptionPane.INFORMATION_MESSAGE,ArrBat.get(vB-1).ImBatEl);
                                            break;
                                            
                                        case "Cadence":
                                            JOptionPane.showMessageDialog(null,"Batedeira "+vB+":\nMarca: "+ArrBat.get(vB-1).getMarca()+"\nPreço: "+ArrBat.get(vB-1).getPreço()+"\nVoltagem: "+ArrBat.get(vB-1).getVoltagem()+"v\nQuantidade Média: "+ArrBat.get(vB-1).getQuantidadeM()+"\nQuantidade de Hélices: "+ArrBat.get(vB-1).getQthelices()+"",null,JOptionPane.INFORMATION_MESSAGE,ArrBat.get(vB-1).ImBatCa);
                                            break;
                                        
                                        default:
                                            JOptionPane.showMessageDialog(null,"Batedeira "+vB+":\nMarca: "+ArrBat.get(vB-1).getMarca()+"\nPreço: "+ArrBat.get(vB-1).getPreço()+"\nVoltagem: "+ArrBat.get(vB-1).getVoltagem()+"v\nQuantidade Média: "+ArrBat.get(vB-1).getQuantidadeM()+"\nQuantidade de Hélices: "+ArrBat.get(vB-1).getQthelices()+"",null,JOptionPane.INFORMATION_MESSAGE,ArrBat.get(vB-1).ImBat);
                                            break;
                                    }
                                    JOptionPane.showMessageDialog(null,"Batedeira "+vB+":\nMarca: "+ArrBat.get(vB-1).getMarca()+"\nPreço: "+ArrBat.get(vB-1).getPreço()+"\nVoltagem: "+ArrBat.get(vB-1).getVoltagem()+"v\nQuantidade Média: "+ArrBat.get(vB-1).getQuantidadeM()+"\nQuantidade de Hélices: "+ArrBat.get(vB-1).getQthelices()+"",null,JOptionPane.INFORMATION_MESSAGE,ArrBat.get(vB-1).ImBat);
                                    break;
                            }
                        }while(choiceGE!=3);
                        
                break;
            }
        }while(choiceG!=2);
    }
}