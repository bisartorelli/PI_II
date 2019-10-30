/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;


import dao.ProdutoDao;
import java.util.List;
import model.Produto;

/**
 *
 * @author bianca.osartorelli
 */
public class ProdutoController {
        
    public static List<Produto> cadastarProduto(Produto produto) {

        List<Produto> produtos = ProdutoDao.cadastarProduto(produto);
        return produtos;
    }

  
    public static List<Produto> remover(int id) {
        List<Produto> produtos = ProdutoDao.removerProduto(id);
        return produtos;
    }
    public static List<Produto> atualizar(int id , Produto produto)
    {
        List<Produto> produtos = ProdutoDao.atualizar(id,produto);
        return produtos;
        
    }
    
    
}
