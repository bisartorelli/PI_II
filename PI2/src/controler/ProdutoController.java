/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;


import dao.ProdutoDao;
import java.sql.SQLException;
import java.util.List;
import model.Produto;

/**
 *
 * @author bianca.osartorelli
 */
public class ProdutoController {

    public static List<Produto> listarPorId(int id) throws SQLException {
       ProdutoDao produto = new ProdutoDao();
       List<Produto> produtos = produto.listarPorId(id);
       return produtos;
    }
        
    
    public void cadastarProduto(Produto produto) throws SQLException {

        ProdutoDao produtos = new ProdutoDao();
        produtos.cadastrarProduto(produto);
        
    }

    public void removerProduto(int id) throws SQLException {
        ProdutoDao produtos =  new ProdutoDao();
        produtos.removerProduto(id);
        
    }
     public void alterar(int id,Produto produto) throws SQLException
    {
        ProdutoDao produtos  = new ProdutoDao();
        produtos.alterar(id, produto);
    }

    public List<Produto> listar() throws SQLException {
        List<Produto> produtos = ProdutoDao.listar();
        return produtos;
    }

    public void alterarEstoque(int codigo, int estoque1) throws SQLException {
        ProdutoDao produtos = new ProdutoDao();
        produtos.alterarEstoque(codigo,estoque1);
    }
    
    

    }
    
    

