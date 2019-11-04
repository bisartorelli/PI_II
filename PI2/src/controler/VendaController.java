/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import dao.VendaDao;
import java.util.ArrayList;
import java.util.List;
import model.Venda;

/**
 *
 * @author lucas.afsilva6
 */
public class VendaController {

    public static List<Venda> cadastrarVenda(Venda venda) {
        
        List<Venda> clientes = VendaDao.cadastrarVenda(venda);
        return clientes;
    }
    
     public static List<Venda> remover(int id) {
        List<Venda> vendas = VendaDao.removerCliente(id);
        return vendas;
    }
     

    public static List<Venda> alterarVenda(int id, Venda venda) {
         List<Venda> clientes = VendaDao.alterarVenda(id,venda);
         return clientes;
    }
    
      
    
    
     
    
}
