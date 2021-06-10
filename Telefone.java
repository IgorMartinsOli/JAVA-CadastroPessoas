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
public class Telefone extends Contato{
    private String ddd;
    
    public Telefone(String valor, String ddd){
        super(valor);
        this.ddd = ddd;
    }
    
    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    @Override
    public void print() {
        System.out.print("Numero "+super.getValor()+" \nDDD"+this.getDdd());
    }
}
