/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastropessoas;

/**
 *
 * @author igor_
 */
public abstract class Contato {

    private String valor;
    
    public Contato(String valor){
        this.valor = valor;
    }
    
    public void print(){
        System.out.println("Contato: "+getValor());
    }
    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
}
