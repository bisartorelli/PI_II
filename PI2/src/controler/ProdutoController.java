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
        
    
    public void cadastarCliente(Produto produto) throws SQLException {

        ProdutoDao produtos = new ProdutoDao();
        produtos.cadastarProduto(produto);
        
    }

    public void remover(int id) throws SQLException {
        ProdutoDao produtos =  new ProdutoDao();
        produtos.removerProduto(id);
        
    }
     public void alterar(int id,Produto cliente) throws SQLException
    {
        ProdutoDao produtos  = new ProdutoDao();
        produtos.alterar(id, cliente);
    }

    public static List<Produto> listar() throws SQLException {
        List<Produto> produtos = ProdutoDao.listar();
        return produtos;
    }

    }
    
    

