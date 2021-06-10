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
public abstract class IdentificadorUnico {
    private String numero;
    
    public IdentificadorUnico(String numero){
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public boolean validar(String numero){
        return false;
    }
}
