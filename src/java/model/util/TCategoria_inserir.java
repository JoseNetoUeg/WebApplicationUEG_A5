/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.util;

import model.entidade.ECategoria;
import model.persistencia.PCategoria;

/**
 *
 * @author ZENETO
 */
public class TCategoria_inserir {
    public static void main(String[] args) {
        
        //Objeto de testes, do tipo do Cliente
        ECategoria categoria = new ECategoria();
        
        //Preenchendo o objeto categoria com valores para testes
        categoria.setDescricao("Top da Galaxia Max");
        
        
        //Cria uma instancia da persistencia para usarmos
        PCategoria persistencia = new PCategoria();
        
        System.out.println("Iniciando a inclusão de uma nov categoria...");
        
        persistencia.inserir(categoria);
        
        System.out.println("Categoria incluída com sucesso!");
    }

    
}
