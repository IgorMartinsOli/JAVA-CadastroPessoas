/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastropessoas;

import java.util.Date;
import java.util.InputMismatchException;

/**
 *
 * @author igor_
 */
public class PessoaJuridica extends Pessoa{
    private String rasaoSocial;
    private String nomeFantasia;
    private Cnpj cnpj;
    private PessoaFisica representante;
    
    public PessoaJuridica(Date dataCadastro, String rasao, String nomeFantasia, PessoaFisica representante, String cnpj, String lagradouro, String bairro, String cidade, String estado) throws Exception{
        super(dataCadastro, lagradouro, bairro, cidade, estado);
        if(validar(cnpj)){
            Cnpj cnpjCadastrar = new Cnpj(cnpj);
            this.cnpj = cnpjCadastrar;
            this.rasaoSocial = rasao;
            this.nomeFantasia = nomeFantasia;
            this.representante = representante;
        }else{
            throw new Exception ("CNPJ não procede");
        }
    }
    
    public String getRasaoSocial() {
        return rasaoSocial;
    }

    public void setRasaoSocial(String rasaoSocial) {
        this.rasaoSocial = rasaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }
    
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public PessoaFisica getRepresentante() {
        return representante;
    }

    public void setRepresentante(PessoaFisica representante) {
        this.representante = representante;
    }
    
    public static void CNPJ(){
    }
    
    //metodo para verificar cnpj, nao consegui colocar na classe de cnpj depois buscar no construtor, ai coloquei aqui
    public static boolean validar(String CNPJ){
    // considera-se erro CNPJ's formados por uma sequencia de numeros iguais
    if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") ||
        CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333") ||
        CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555") ||
        CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") ||
        CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999") ||
       (CNPJ.length() != 14))
       return(false);

    char dig13, dig14;
    int sm, i, r, num, peso;

    // "try" - protege o código para eventuais erros de conversao de tipo (int)
    try {
    // Calculo do 1o. Digito Verificador
      sm = 0;
      peso = 2;
      for (i=11; i>=0; i--) {
    // converte o i-ésimo caractere do CNPJ em um número:
    // por exemplo, transforma o caractere '0' no inteiro 0
    // (48 eh a posição de '0' na tabela ASCII)
        num = (int)(CNPJ.charAt(i) - 48);
        sm = sm + (num * peso);
        peso = peso + 1;
        if (peso == 10)
           peso = 2;
      }

      r = sm % 11;
      if ((r == 0) || (r == 1))
         dig13 = '0';
      else dig13 = (char)((11-r) + 48);

    // Calculo do 2o. Digito Verificador
      sm = 0;
      peso = 2;
      for (i=12; i>=0; i--) {
        num = (int)(CNPJ.charAt(i)- 48);
        sm = sm + (num * peso);
        peso = peso + 1;
        if (peso == 10)
           peso = 2;
      }

      r = sm % 11;
      if ((r == 0) || (r == 1))
         dig14 = '0';
      else dig14 = (char)((11-r) + 48);

    // Verifica se os dígitos calculados conferem com os dígitos informados.
      if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13)))
         return(true);
      else return(false);
    } catch (InputMismatchException erro) {
        return(false);
    }
  }

  public static String imprimeCNPJ(String CNPJ) {
    // máscara do CNPJ: 99.999.999.9999-99
    return(CNPJ.substring(0, 2) + "." + CNPJ.substring(2, 5) + "." +
      CNPJ.substring(5, 8) + "." + CNPJ.substring(8, 12) + "-" +
      CNPJ.substring(12, 14));
  }
}
