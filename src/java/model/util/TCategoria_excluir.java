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
public class TCategoria_excluir {
    public static void main(String[] args) {
        
        //Cria uma instancia da persistencia para usarmos
        PCategoria persistencia = new PCategoria();
        
        System.out.println("Iniciando a exclusão de uma Categoria...");
        
        persistencia.excluir(1);
        
        System.out.println("Categoria excluida com sucesso!");
    }

    
}
