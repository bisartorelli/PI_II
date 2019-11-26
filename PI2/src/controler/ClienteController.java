/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import dao.ClienteDao;
import java.sql.SQLException;
import java.util.List;
import model.Cliente;

/**
     * 
    * @author Bianca Sartorelli
    * @author Guilherme Augusto 
    * @author Lucas Augusto
    * @author Leonardo Lima
    */

public class ClienteController {
    
  
/**
     * @throws java.sql.SQLException
     * @see dao.ClienteDao
    * @param cliente do objeto Cliente
    * 
    *  
    */
    public void cadastarCliente(Cliente cliente) throws SQLException {

        ClienteDao clientes = new ClienteDao();
        clientes.cadastarCliente(cliente);
        
    }

    /**
     
    * @param id do objeto Cliente
    * 
    *  
    */ 
    public void remover(int id) throws SQLException {
        ClienteDao clientes =  new ClienteDao();
        clientes.removerCliente(id);
        
    }
     public void alterar(int id,Cliente cliente) throws SQLException
    {
        ClienteDao clientes =  new ClienteDao();
        clientes.alterar(id, cliente);
    }

    public static List<Cliente> listar() throws SQLException {
        List<Cliente> clientes = ClienteDao.listar();
        return clientes;
    }
    
     public static List<Cliente> listarCpf(String cpf) throws SQLException {
         ClienteDao ClienteDao = new ClienteDao();
        List<Cliente> clientes = ClienteDao.listarCpf(cpf);
        return clientes;
    }
    
   
    

   
}
