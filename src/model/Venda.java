/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Jaime Rungo
 */
public class Venda {
    private int codigoVenda;
    private int codigoVendedor;
    private String bi_cliente;
    private double preco_venda;

    public Venda() {
    }

    public Venda(int codigoVenda, int codigoVendedor, String bi_cliente, double preco_venda) {
        this.codigoVenda = codigoVenda;
        this.codigoVendedor = codigoVendedor;
        this.bi_cliente = bi_cliente;
        this.preco_venda = preco_venda;
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public int getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(int codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public String getBi_cliente() {
        return bi_cliente;
    }

    public void setBi_cliente(String bi_cliente) {
        this.bi_cliente = bi_cliente;
    }

    public double getPreco_venda() {
        return preco_venda;
    }
        
    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }

    @Override
    public String toString() {
        return "Venda{" + "codigoVenda=" + codigoVenda + ", codigoVendedor=" + codigoVendedor + ", bi_cliente=" + bi_cliente + ", preco_venda=" + preco_venda + '}';
    }
    
    
    
}
