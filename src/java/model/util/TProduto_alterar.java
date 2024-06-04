/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.util;

import model.entidade.EProduto;
import model.persistencia.PProduto;

/**
 *
 * @author ZENETO
 */
public class TProduto_alterar {
    public static void main(String[] args) {
        
        //Objeto de testes, do tipo do Produto
        EProduto produto = new EProduto();
        
        //Preenchendo o objeto produto com valores para testes
        produto.setNome("papel A4 ALTERADO");
        produto.setQtde(101);
	produto.setValor(50.00);
        produto.setCodigo(1);
        
        //Cria uma instancia da persistencia para usarmos
        PProduto persistencia = new PProduto();
        
        System.out.println("Iniciando a ALTERAÇÃO do produto...");
        
        persistencia.alterar(produto);
        
        System.out.println("Produto alterado com sucesso!");
    }

    
}
