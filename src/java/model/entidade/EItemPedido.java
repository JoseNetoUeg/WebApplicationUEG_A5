/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidade;

/**
 *
 * @author ZENETO
 */
public class EItemPedido {
    private int codigo;
    private EPedido pedido;
    private int qtDeItem;
    private double valorVenda;
    private EProduto produto;

public EItemPedido(){
    
    pedido = new EPedido();
    produto = new EProduto();
}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public EPedido getPedido() {
        return pedido;
    }

    public void setPedido(EPedido pedido) {
        this.pedido = pedido;
    }

    public int getQtDeItem() {
        return qtDeItem;
    }

    public void setQtDeItem(int qtDeItem) {
        this.qtDeItem = qtDeItem;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public EProduto getProduto() {
        return produto;
    }

    public void setProduto(EProduto produto) {
        this.produto = produto;
    }


}
