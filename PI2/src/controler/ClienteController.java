/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import dao.ClienteDao;
import java.util.List;
import model.Cliente;


public class ClienteController {
    
  

    public static List<Cliente> cadastarCliente(Cliente cliente) {

        List<Cliente> clientes = ClienteDao.cadastarCliente(cliente);
        return clientes;
    }
    
}
