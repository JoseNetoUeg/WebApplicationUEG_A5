/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;
import model.entidade.ECategoria;
import model.util.Conexao;

/**
 *
 * @author ZENETO
 */
public class PCategoria {
    //Variável local responsável pela conexão com o banco
    private Connection cnn;

    //Construtor
    public PCategoria() {

        //Instancia o objeto cnn com uma nova conexão vinda da classe Conexao
        cnn = Conexao.getConnection();
    }

    public void inserir(ECategoria categoria) {

        try {

            String sql = "INSERT INTO categoria (descricao) "
                    + " VALUES ( ? )";

            PreparedStatement prd = cnn.prepareStatement(sql);
            prd.setString(1, categoria.getDescricao());
                        
            prd.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro na inserção da categoria: " + e.getMessage());
        }

    }

    public void alterar(ECategoria categoria) {

        try {

            String sql = "UPDATE categoria "
                    + " SET descricao = ?,"
                    + " WHERE codigo = ? ";

            PreparedStatement prd = cnn.prepareStatement(sql);
            prd.setString(1, categoria.getDescricao());
            
            prd.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro na alteração da descricao: " + e.getMessage());
        }

    }

    public void excluir(int codigo) {
        //Código para excluir um único cliente no banco de dados
        try {

            String sql = "DELETE FROM categoria "
                    + " WHERE codigo = ? ";

            PreparedStatement prd = cnn.prepareStatement(sql);
            prd.setInt(1, codigo);

            prd.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro na exclusão da categoria: " + e.getMessage());
        }

    }

    public ECategoria consultar(int codigo) {
        //Código para consultar um registro de categoria no banco de dados
        //retornando o objeto do tipo ECategoria preenchido
        ECategoria categoria = new ECategoria();

        try {
            
            String sql = "SELECT * FROM categoria WHERE codigo = ?";
            PreparedStatement prd = cnn.prepareStatement(sql);
            prd.setInt(1, codigo);
            
            ResultSet rst = prd.executeQuery();
            
            if(rst.next()){
                categoria.setCodigo(codigo);
                categoria.setDescricao(rst.getString("descricao"));
                
            }
            
            rst.close();

        } catch (Exception e) {
            System.out.println("Erro na consulta da categoria: " + e.getMessage());
        }
        
        return categoria;
    }

    public List<ECategoria> listar() {
        //Código para listar todos os registros de categoiras do BD
        //Retorna uma lista de objetos do tipo ECategoria
        List<ECategoria> categorias = new ArrayList<>();

        try {
            
            String sql = "SELECT * FROM categoria ORDER BY codigo DESC";
            Statement prd = cnn.createStatement();
            
            ResultSet rst = prd.executeQuery(sql);
            
            while(rst.next()){
                ECategoria categoria = new ECategoria();
                
                categoria.setCodigo(rst.getInt("codigo"));
                categoria.setDescricao(rst.getString("descricao"));
                categorias.add(categoria);
            }
            
            rst.close();

        } catch (Exception e) {
            System.out.println("Erro na listagem de categoiras: " + e.getMessage());
        }
        
        return categorias;
    }

    
}
