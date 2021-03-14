/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leitura;

/**
 *
 * @author Rafael
 -idade
 -nome
 +fazAniver()
 */
public class Pessoa {
    
    //atributos
    private String nome;
    private int idade;
    
    //métodos
    public void fazAniver(){
        this.setIdade(getIdade()+1);
    }
    
    //especiais getters e setters

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
    
    
    
    
    
}
