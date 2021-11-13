/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 *
 * @author david
 */
public class Apupersonas {
    
    //Atributos
    private String Nombre;
    private int ValorApu;
    private int NumCab;
    
    
    public Apupersonas (String Nombre, int ValorApu, int NumCab){
        this.Nombre = Nombre;
        this.ValorApu = ValorApu;
        this.NumCab = NumCab;
    }
    
    public Apupersonas (){
        this.Nombre = null;
        this.ValorApu = 0;
        this.NumCab = 0;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getValorApu() {
        return ValorApu;
    }

    public void setValorApu(int ValorApu) {
        this.ValorApu = ValorApu;
    }

    public int getNumCab() {
        return NumCab;
    }

    public void setNumCab(int NumCab) {
        this.NumCab = NumCab;
    }
    
    @Override
    public String toString() {
        return "Nombre: "+Nombre+", Valor apuesta: "+ValorApu+", Caballo apostado: "+NumCab;
    }
    
    
    
}


