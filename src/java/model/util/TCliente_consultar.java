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
public class TCliente_consultar {
    
    public static void main(String[] args) {
        
        //Cria uma instancia da persistencia para usarmos
        PCliente persistencia = new PCliente();
        
        System.out.println("Iniciando a consulta de um cliente...");
        
        ECliente cliente = persistencia.consultar(2);
        
        System.out.println("Codigo.....:" + cliente.getCodigo());
        System.out.println("Nome.......:" + cliente.getNome());
        System.out.println("DtNasc.....:" + cliente.getDatanascimento());
        
        System.out.println("Cliente consultado com sucesso!");
    }
    
}
