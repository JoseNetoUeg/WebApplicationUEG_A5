/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.negocio;

import model.persistencia.PCategoria;
import java.util.List;
import model.entidade.ECategoria;


/**
 *
 * @author ZENETO
 */
public class NCategoria {
    
     PCategoria pcl;
    
    //Metodo construtor
    public NCategoria(){
        
        pcl = new PCategoria();
        
    }
    
    //Metodo para salvar os dados da categoria. Verifica se é para incluir um novo registro
    //ou se é para alterar algum registro existente
    
public void salvar(ECategoria categoria){
        if( categoria.getCodigo() == 0){
            pcl.inserir(categoria);
        }else{
            pcl.alterar(categoria);
        }
        
    }
    
    //Método para excluir
    public void excluir(int codigo){
        pcl.excluir(codigo);
    }
    
    //Método para consultar uma categoria
    public ECategoria consultar(int codigo){
        return pcl.consultar(codigo);
    }
    
    //Método para consultar uma descricao
    public List<ECategoria> listar(){
        return pcl.listar();
    }

    
}
