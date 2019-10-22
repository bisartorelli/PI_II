/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;


public class ClienteDao {

    public static List<Cliente> cadastarCliente(Cliente cliente) {
       
       
        bd.add(cliente);
        return bd;
    }
    
    private static List<Cliente> bd = new ArrayList<>();
    
    
}
