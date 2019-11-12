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


public class ClienteController {
    
  

    public void cadastarCliente(Cliente cliente) throws SQLException {

        ClienteDao clientes = new ClienteDao();
        clientes.cadastarCliente(cliente);
        
    }

    public static List<Cliente> remover(int id) {
        List<Cliente> clientes = ClienteDao.removerCliente(id);
        return clientes;
    }
     public static List<Cliente> atualizar(int id , Cliente cliente)
    {
        List<Cliente> clientes = ClienteDao.atualizar(id,cliente);
        return clientes;
        
    }

    public static List<Cliente> listar() {
        List<Cliente> clientes = ClienteDao.listar();
        return clientes;
    }
    
   
    

   
}
