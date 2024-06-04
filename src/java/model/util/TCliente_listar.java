/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.util;

import java.util.List;
import model.entidade.ECliente;
import model.persistencia.PCliente;

/**
 *
 * @author heube
 */
public class TCliente_listar {

    public static void main(String[] args) {

        //Cria uma instancia da persistencia para usarmos
        PCliente persistencia = new PCliente();

        System.out.println("Iniciando a listagem de clientes...");

        List<ECliente> clientes = persistencia.listar();

        for (ECliente cliente : clientes) {
            System.out.println("Codigo.....:" + cliente.getCodigo());
            System.out.println("Nome.......:" + cliente.getNome());
            System.out.println("DtNasc.....:" + cliente.getDatanascimento());
            
            System.out.println("");
        }

        System.out.println("Clientes listados com sucesso!");
    }

}
