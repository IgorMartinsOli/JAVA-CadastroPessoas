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
public class Celular extends Telefone{  
    private String operadora;
    
    public Celular(String valor, String ddd, String operadora){
        super(valor, ddd);
        this.operadora = operadora;
    }
    
    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
    
    @Override
    public void print() {
        System.out.print("Numero "+super.getValor()+" \nDDD"+this.getDdd()+" \nOperadora: "+this.getOperadora());
    }
}
