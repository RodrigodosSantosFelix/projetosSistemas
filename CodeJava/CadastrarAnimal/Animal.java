/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadastrarAnimal;

/**
 *
 * @author 010617040
 */


public class Animal {
    private String especie;
    private String nome;
    
    public String getEspecie()
    {
        return especie;
    }
    public String getNome()
    {
        return nome;
    }
    public void setEspecie(String especie)
    {
        this.especie = especie;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    @Override
    public String toString()
    {
        return "Animal{" + "especie=" + especie + '}';
    }
}