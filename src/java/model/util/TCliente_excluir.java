/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.util;

import model.entidade.ECliente;
import model.persistencia.PCliente;

/**
 *
 * @author zeneto
 */
public class TCliente_excluir {
    
    public static void main(String[] args) {
        
        //Cria uma instancia da persistencia para usarmos
        PCliente persistencia = new PCliente();
        
        System.out.println("Iniciando a exclusão de um cliente...");
        
        persistencia.excluir(1);
        
        System.out.println("Cliente excluído com sucesso!");
    }
    
}
