/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_10;

/**
 *
 * @author Usuario
 */
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    public void receberAumento(float aum){
        this.setSalario(getSalario()+1);
        
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
