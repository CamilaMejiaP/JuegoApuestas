/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class apuestas {
    
    //ATRIBUTOS
    int numwin, totalwin,sum, moneywin, updatewallet, numround;
    String namehorse, namewin;  
    ArrayList<String> namewins = new ArrayList<>();
    ArrayList<Apupersonas> AuxListPer = new ArrayList<>();
    
    //METODOS
    
    public void AuxListPer(Apupersonas P1, Apupersonas P2, Apupersonas P3, Apupersonas P4){
        
        AuxListPer.add(P1);
        AuxListPer.add(P2);
        AuxListPer.add(P3);
        AuxListPer.add(P4);
        
    }
            
    public int NumWin(){
        
        numwin = (int)(Math.random() * 4+1);
        
        return numwin;
        
    }
    
    public String NameHose(){
        
        switch(numwin){
            case 1 : namehorse = "¡El caballo ganador es Zeus!";
                break;
            case 2: namehorse = "¡El caballo ganador es Bucéfalos!";
                break;
            case 3: namehorse = "¡El caballo ganador es Millonario!";
                break;
            case 4: namehorse = "¡El caballo ganador es Relampago!";
                break;
            default: namehorse= "No hay caballo ganador";
                
        }
        
        return namehorse;
    }
    
    
    public int TotalWin(ArrayList<Apupersonas> ListPer){
        
        for (int i = 0; i < ListPer.size(); i++){
            
            if (numwin == ListPer.get(i).getNumCab()){
                
                totalwin += 1;
                
            }     
    }
        
        return totalwin;
        
    }
    
    public ArrayList<String> NameWin(ArrayList<Apupersonas> ListPer) {
        
        namewins.clear();
        
        if (totalwin == 0){
            
            namewin = "No hay ganadores";
            
            namewins.add(namewin);
            
            return namewins;
            
        } else {
            
            for (int i = 0; i < ListPer.size(); i++){
            
            if (numwin == ListPer.get(i).getNumCab()){
                               
                namewin = ListPer.get(i).getNombre();
                
                namewins.add(namewin);
                
            }
        }
            
            return namewins;
        }
       
    }
    
    
    public int Suma (ArrayList<Apupersonas> ListPer){
        
        for (int i = 0; i < ListPer.size(); i++){
            
            sum += AuxListPer.get(i).getValorApu();
                   
        }
        
        return sum;
            
    }
    
    
    public void UpdateMoney (ArrayList<Apupersonas> ListPer){
        
        for (int i = 0; i < ListPer.size(); i++){
            
            ListPer.get(i).setValorApu(10000 - ListPer.get(i).getValorApu());
        }
                
    }
    
    
    public int MoneyWin (){
        
        if (totalwin > 0){
            
            moneywin = sum/totalwin;
        
        return moneywin;
            
        } else{
            
            moneywin=0;
            
            return  moneywin;
            
        }  
        
    }
    
    
    public void UpdateWallet (ArrayList<Apupersonas> ListPer){
        
        for (int i = 0; i < ListPer.size(); i++){
            
            if (numwin == ListPer.get(i).getNumCab()){
                
                ListPer.get(i).setValorApu(ListPer.get(i).getValorApu()+moneywin);
                
            }
            
        }
           
    }
    
    
    public void RemovePlay (ArrayList<Apupersonas> ListPer){
        
        for (int i = 0; i < ListPer.size(); i++){
            
            if (ListPer.get(i).getValorApu() <= 0){
                
                ListPer.remove(i);
                AuxListPer.remove(i);
                
            }
            
        }
        
        
    }
    
    public void Reset(){
        totalwin = 0;
        sum = 0;
    }
    
    public void SUpdateMoney (ArrayList<Apupersonas> ListPer){
        
        for (int i = 0; i < ListPer.size(); i++){
            
            ListPer.get(i).setValorApu(ListPer.get(i).getValorApu() - AuxListPer.get(i).getValorApu());
        }
                
    }
    
    public int NumRound (){
        
        numround+=1;
        
        return numround;
        
    }
    
    
    public ArrayList<Apupersonas> IMP () {
        
        return AuxListPer;
}
    
    
    
    
    
}
