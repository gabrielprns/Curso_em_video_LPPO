/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_11;

/**
 *
 * @author Usuario
 */
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    
    public void fazerAniversario(){
        this.setIdade(getIdade()+1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    public String status() {
        return "Dados{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
    
}
