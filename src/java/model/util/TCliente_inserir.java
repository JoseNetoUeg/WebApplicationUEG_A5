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
public class TCliente_inserir {
    
    public static void main(String[] args) {
        
        //Objeto de testes, do tipo do Cliente
        ECliente cliente = new ECliente();
        
        //Preenchendo o objeto cliente com valores para testes
        cliente.setNome("Fulano da Silva");
        cliente.setDatanascimento(new java.util.Date());
        
        //Cria uma instancia da persistencia para usarmos
        PCliente persistencia = new PCliente();
        
        System.out.println("Iniciando a inclusão de um novo cliente...");
        
        persistencia.inserir(cliente);
        
        System.out.println("Cliente incluído com sucesso!");
    }
    
}
