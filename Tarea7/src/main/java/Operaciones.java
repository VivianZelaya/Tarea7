/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Operaciones {
    
    private double Valor, Resultado;
    private int Lista, ListaFinal;
   

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        this.Valor = valor;
    }

    public int getLista() {
        return Lista;
    }

    public void setLista(int Lista) {
        this.Lista = Lista;
    }

    public int getListaFinal() {
        return ListaFinal;
    }

    public void setListaFinal(int ListaFinal) {
        this.ListaFinal = ListaFinal;
    }

    public double getResultado() {
        return Resultado;
    }

    public void setResultado(double Resultado) {
        this.Resultado = Resultado;
    }

    public Operaciones() {
    }
    
    
    //Operaciones
    public double Convertir(){
        
        if (Lista==0 && ListaFinal==1){ //Lempiras a Dolares
            Resultado = Valor * 0.041; 
        } else if(Lista==0 && ListaFinal==0){
            Resultado = Valor;
        } else if(ListaFinal==0 && Lista==1){ //Dolares a Lempiras
            Resultado = Valor *24.66;
        }
         else if(ListaFinal==1 && Lista==1){
            Resultado = Valor;
        }
        return Resultado;
    }
    
    
    
    
}
