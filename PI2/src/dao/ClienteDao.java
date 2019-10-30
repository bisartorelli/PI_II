
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

    
    public static List<Cliente> removerCliente(int id) {
        bd.remove(id);
        return bd;
        
    }

    public static List<Cliente> atualizar(int id, Cliente cliente ) {
        bd.get(id).setCpf(cliente.getCpf());
        bd.get(id).setNome(cliente.getNome());
        bd.get(id).setSexo(cliente.getSexo());
        bd.get(id).setTelefone(cliente.getTelefone());
       return bd;
    }
    
    
}
