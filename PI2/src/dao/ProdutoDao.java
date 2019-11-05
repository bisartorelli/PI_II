
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Produto;


 
public class ProdutoDao {

    public static List<Produto> cadastarProduto(Produto produto) {
                  
        bd.add(produto);
        return bd;
    }
    
    public static List<Produto> bd = new ArrayList<>();
        
    public static List<Produto> removerProduto(int id) {
        bd.remove(id);
        return bd;
        
    }

    public static List<Produto> atualizar(int id, Produto produto ) {
        bd.get(id).setProduto(produto.getProduto());
        bd.get(id).setFabricante(produto.getFabricante());
        bd.get(id).setCategoria(produto.getCategoria());
        bd.get(id).setTamanho(produto.getTamanho());
        bd.get(id).setEstoque(produto.getEstoque());
        bd.get(id).setValor(produto.getValor());
  
       return bd;
    }
   
    public static List<Produto> listar() {
        return bd;
    }

    public static List<Produto> controleEstoque(int idProd, Produto produto) {
      bd.get(idProd).setEstoque(produto.getEstoque());
      return bd;
    }
    
    }
    
    

