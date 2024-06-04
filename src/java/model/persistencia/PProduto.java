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
import model.entidade.EProduto;
import model.util.Conexao;


/**
 *
 * @author ZENETO
 */
public class PProduto {
    //Variável local responsável pela conexão com o banco
    private Connection cnn;

    //Construtor
    public PProduto() {

        //Instancia o objeto cnn com uma nova conexão vinda da classe Conexao
        cnn = Conexao.getConnection();
    }

    public void inserir(EProduto produto) {

        try {

            String sql = "INSERT INTO produto (nome, qtde, valor) "
                    + " VALUES ( ?, ?, ? )";

            PreparedStatement prd = cnn.prepareStatement(sql);
            prd.setString(1, produto.getNome());
            prd.setInt(2, produto.getQtde());
            prd.setDouble(3, produto.getValor());
      
            prd.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro na inserção do produto: " + e.getMessage());
        }

    }

    public void alterar(EProduto produto) {

        try {

            String sql = "UPDATE produto "
                    + " SET nome = ?,"
                    + " qtde = ?, "
                    + " valor = ? "
                    + " WHERE codigo = ? ";

            PreparedStatement prd = cnn.prepareStatement(sql);
            prd.setString(1, produto.getNome());
            prd.setInt(2, produto.getQtde());
            prd.setDouble(3, produto.getValor());
	    prd.setInt(4, produto.getCodigo());

            prd.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro na alteração do produto: " + e.getMessage());
        }

    }

    public void excluir(int codigo) {
        //Código para excluir um único produto no banco de dados
        try {

            String sql = "DELETE FROM produto "
                    + " WHERE codigo = ? ";

            PreparedStatement prd = cnn.prepareStatement(sql);
            prd.setInt(1, codigo);

            prd.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro na exclusão do produto: " + e.getMessage());
        }

    }

    public EProduto consultar(int codigo) {
        //Código para consultar um registro de produto no banco de dados
        //retornando o objeto do tipo EProduto preenchido
        EProduto produto = new EProduto();

        try {
            
            String sql = "SELECT * FROM produto WHERE codigo = ?";
            PreparedStatement prd = cnn.prepareStatement(sql);
            prd.setInt(1, codigo);
            
            ResultSet rst = prd.executeQuery();
            
            if(rst.next()){
                produto.setCodigo(codigo);
                produto.setNome(rst.getString("nome"));
                produto.setQtde(rst.getInt("qtde"));
                produto.setValor(rst.getDouble("valor"));
            }
            
            rst.close();

        } catch (Exception e) {
            System.out.println("Erro na consulta do produto: " + e.getMessage());
        }
        
        return produto;
    }

    public List<EProduto> listar() {
        //Código para listar todos os registros de produtos do BD
        //Retorna uma lista de objetos do tipo EProduto
        List<EProduto> produtos = new ArrayList<>();

        try {
            
            String sql = "SELECT * FROM produto ORDER BY codigo DESC";
            Statement prd = cnn.createStatement();
            
            ResultSet rst = prd.executeQuery(sql);
            
            while(rst.next()){
                EProduto produto = new EProduto();
                
                produto.setCodigo(rst.getInt("codigo"));
                produto.setNome(rst.getString("nome"));
                produto.setQtde(rst.getInt("qtde"));
                produto.setValor(rst.getDouble("valor"));
                produtos.add(produto);
            }
            
            rst.close();

        } catch (Exception e) {
            System.out.println("Erro na listagem de produtos: " + e.getMessage());
        }
        
        return produtos;
    }

    
}
