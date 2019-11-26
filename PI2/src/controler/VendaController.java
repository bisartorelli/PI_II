/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import dao.VendaDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Venda;

/**
     * 
    * @author Bianca Sartorelli
    * @author Guilherme Augusto 
    * @author Lucas Augusto
    * @author Leonardo Lima
    */
public class VendaController {

    /**
     * @throws java.sql.SQLException
     * @see dao.VendaDao
    * @param venda do objeto Venda
    * 
    *  
    */
    
    public static List<Venda> cadastrarVenda(Venda venda) {
        
        List<Venda> clientes = VendaDao.cadastrarVenda(venda);
        return clientes;
    }
    
     public static List<Venda> remover(int id) {
        List<Venda> vendas = VendaDao.removerCliente(id);
        return vendas;
    }
     
      /**
   
    * @param id do objeto Venda
    * @return array - vendas
    *  
    */

    public static List<Venda> alterarVenda(int id, Venda venda) {
         List<Venda> clientes = VendaDao.alterarVenda(id,venda);
         return clientes;
    }

    public void vendaEfetuada(Venda venda) throws SQLException {
       
        VendaDao vendas = new VendaDao();
        vendas.vendaEfetuada(venda);
        
    }
    
    
    public static List<Venda> listar() throws SQLException {
        List<Venda> vendas = VendaDao.listar();
        return vendas;
    }

  
  
    
    
      
    
    
     
    
}
