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

  
    public static List<Produto> remover(int idProd) {
        List<Produto> produtos = ProdutoDao.removerProduto(idProd);
        return produtos;
    }
    public static List<Produto> atualizar(int idProd , Produto produto)
    {
        List<Produto> produtos = ProdutoDao.atualizar(idProd,produto);
        return produtos;
        
    }
    
     public List<Produto> listar() {
        List<Produto> produtos = ProdutoDao.listar();
        return produtos;
    }

    
   
    }
    
    

