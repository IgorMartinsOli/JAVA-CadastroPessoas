/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastropessoas;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author igor_
 */
public abstract class Pessoa {
   private Date dataCadastro;
   private ArrayList<Contato> contatos = new ArrayList();
   private Endereco endereco;
   
   Pessoa(Date dataCadastro, String lagradouro, String bairro, String cidade, String estado){
       this.dataCadastro = dataCadastro;
       Endereco enderecoCadastro = new Endereco(lagradouro, bairro, cidade, estado);
       this.endereco = enderecoCadastro;
   }
   
   Pessoa(Date dataCadastro, String lagradouro, String bairro, String cidade, String estado, Contato contato){
       this.dataCadastro = dataCadastro;
       contatos.add(contato);
       Endereco enderecoCadastro = new Endereco(lagradouro, bairro, cidade, estado);
       this.endereco = enderecoCadastro;
   }
   
   //criei um construtor para passar como parametro apenas um contato, depois na main teria uma parte para cadastrar mais contatos
   
    /*
    public void printPessoa(){
        System.out.println("Data de cadastro: "+this.dataCadastro+"\n Contatos: ");
    }*/
    
    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }
    
    public void setContato(Contato contato) {
        this.contatos.add(contato);
    }
    
    public Date getDataCadastro() {
        return dataCadastro;
    }
    
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    public void printaContatos(){
        contatos.forEach((cont) -> {
            System.out.println(cont);
       });
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
