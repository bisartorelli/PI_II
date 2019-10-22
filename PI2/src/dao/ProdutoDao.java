/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Produto;

/**
 *
 * @author bianca.osartorelli
 */
public class ProdutoDao {

    public static List<Produto> cadastarProduto(Produto produto) {
                  
       
        bd.add(produto);
        return bd;
    }
    
    private static List<Produto> bd = new ArrayList<>();
        
    }
    

