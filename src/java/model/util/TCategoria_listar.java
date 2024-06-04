/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.util;

import java.util.List;
import model.entidade.ECategoria;
import model.persistencia.PCategoria;

/**
 *
 * @author ZENETO
 */
public class TCategoria_listar {
     public static void main(String[] args) {

        //Cria uma instancia da persistencia para usarmos
        PCategoria persistencia = new PCategoria();

        System.out.println("Iniciando a listagem de categorias...");

        List<ECategoria> categorias = persistencia.listar();

        for (ECategoria categoria : categorias) {
            System.out.println("Codigo.....:" + categoria.getCodigo());
            System.out.println("Descricao.......:" + categoria.getDescricao());
                        
            System.out.println("");
        }

        System.out.println("Categorias listados com sucesso!");
    }

    
}
