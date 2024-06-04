/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.negocio;

import java.util.List;
import model.entidade.EProduto;
import model.persistencia.PProduto;

/**
 *
 * @author ZENETO
 */
public class NProduto {
    PProduto pcl;
    
    //Metodo construtor
    public NProduto(){
        
        pcl = new PProduto();
        
    }
    
    //Metodo para salvar os dados do produto. Verifica se é para incluir um novo registro
    //ou se é para alterar algum registro existente
    public void salvar(EProduto produto){
        if( produto.getCodigo() == 0){
            pcl.inserir(produto);
        }else{
            pcl.alterar(produto);
        }
        
    }
    
    //Método para excluir
    public void excluir(int codigo){
        pcl.excluir(codigo);
    }
    
    //Método para consultar um produto
    public EProduto consultar(int codigo){
        return pcl.consultar(codigo);
    }
    
    //Método para consultar um produto
    public List<EProduto> listar(){
        return pcl.listar();
    }
    
    

    
}
