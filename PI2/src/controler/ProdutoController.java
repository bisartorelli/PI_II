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
        
    
    public void cadastarProduto(Produto produto) throws SQLException {

        ProdutoDao produtos = new ProdutoDao();
        produtos.cadastrarProduto(produto);
        
    }

    public void removerProduto(int id) throws SQLException {
        ProdutoDao produtos =  new ProdutoDao();
        produtos.removerProduto(id);
        
    }
     public void alterar(int id,Produto cliente) throws SQLException
    {
        ProdutoDao produtos  = new ProdutoDao();
        produtos.alterar(id, cliente);
    }

    public List<Produto> listar() throws SQLException {
        List<Produto> produtos = ProdutoDao.listar();
        return produtos;
    }

    }
    
    

