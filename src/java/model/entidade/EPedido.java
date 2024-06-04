/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ZENETO
 */
public class EPedido {
    private int codigo;
    private ECliente cliente;
    private Date dataPedido;
    private double valorTotal;
    private List<EItemPedido> listaItens;

   public EPedido(){
       
       cliente = new ECliente();
       listaItens = new ArrayList<EItemPedido>();
   }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ECliente getCliente() {
        return cliente;
    }

    public void setCliente(ECliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<EItemPedido> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<EItemPedido> listaItens) {
        this.listaItens = listaItens;
    }
    
   
    
}
