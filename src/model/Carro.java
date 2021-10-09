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
public class Carro implements Serializable{
    private int codigo;
    private String marca;
    private String cor;
    private String chassi;
    private double preco;
    private String data;

    
    public Carro(){
        
    }
    public Carro(int codigo, String marca, String cor, String chassi, double preco, String data) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.chassi = chassi;
        this.preco = preco;
        this.data = data;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Carro{" + "codigo=" + codigo + ", marca=" + marca + ", cor=" + cor + ", chassi=" + chassi + ", preco=" + preco + ", data=" + data + '}';
    }
    
    
}
