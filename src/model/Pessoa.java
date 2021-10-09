/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
/**
 *
 * @author Jaime Rungo
 */
public class Pessoa implements Serializable{
    private int codigo;
    private String nome;
    private String apelido;
    private String contacto;
    private String bi;

    public Pessoa() {
    }

    public Pessoa(int codigo, String nome, String apelido, String contacto, String bi) {
        this.codigo = codigo;
        this.nome = nome;
        this.apelido = apelido;
        this.contacto = contacto;
        this.bi = bi;
    }
    
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "codigo=" + codigo + ", nome=" + nome + ", apelido=" + apelido + ", contacto=" + contacto + ", bi=" + bi + '}';
    }
}
