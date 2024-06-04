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
 * @author heube
 */
public class TCliente_alterar {
    
    public static void main(String[] args) {
        
        //Objeto de testes, do tipo do Cliente
        ECliente cliente = new ECliente();
        
        //Preenchendo o objeto cliente com valores para testes
        cliente.setNome("Fulano da Silva ALTERADO");
        cliente.setDatanascimento(new java.util.Date());
        cliente.setCodigo(1);
        
        //Cria uma instancia da persistencia para usarmos
        PCliente persistencia = new PCliente();
        
        System.out.println("Iniciando a ALTERAÇÃO do cliente...");
        
        persistencia.alterar(cliente);
        
        System.out.println("Cliente alterado com sucesso!");
    }
    
}
