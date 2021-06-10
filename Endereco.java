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
public class Endereco {
    private String lagradouro;
    private String bairro;
    private String cidade;
    private String estado;
    
    public Endereco(String lagradouro, String bairro, String cidade, String estado){
        this.lagradouro = lagradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getLagradouro() {
        return lagradouro;
    }

    public void setLagradouro(String lagradouro) {
        this.lagradouro = lagradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
