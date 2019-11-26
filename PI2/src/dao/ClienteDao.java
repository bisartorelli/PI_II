package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;

public class ClienteDao {

   static Connection conexao;

   

    public ClienteDao() throws SQLException {
        conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/tdsRoupa", "root", "");

    }

    public void cadastarCliente(Cliente cliente) throws SQLException {
        String sql = "insert into cliente (nomeCliente,cpfCliente,telefone,sexo,dataDeNascimento,estadoCivil) Values(?,?,?,?,?,?)";

        PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);

        instrucaoSQL.setString(1, cliente.getNome());
        instrucaoSQL.setString(2, cliente.getCpf());
        instrucaoSQL.setString(3, cliente.getTelefone());
        instrucaoSQL.setString(4, cliente.getSexo());
        instrucaoSQL.setString(5, cliente.getData());
        instrucaoSQL.setString(6, cliente.getEstadoCivil());
        
        int linhasAfetadas = instrucaoSQL.executeUpdate();

    }

    private static List<Cliente> bd = new ArrayList<>();

    public void removerCliente(int id) throws SQLException {
       String sql = "delete from cliente where idCliente = ?";
         
       PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);
       
       instrucaoSQL.setInt(1,id);
     
      
       int linhasAfetadas = instrucaoSQL.executeUpdate();

    }

    public void alterar(int id, Cliente cliente) throws SQLException {
       String sql = "update cliente set nomeCliente = ?, cpfCliente = ?, telefone  = ?, sexo = ?, dataDeNascimento = ?, estadoCivil = ? where idCliente = ?";

        PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);
        
        instrucaoSQL.setString(1, cliente.getNome());
        instrucaoSQL.setString(2, cliente.getCpf());
        instrucaoSQL.setString(3, cliente.getTelefone());
        instrucaoSQL.setString(4, cliente.getSexo());
        instrucaoSQL.setString(5, cliente.getData());
        instrucaoSQL.setString(6, cliente.getEstadoCivil());
        instrucaoSQL.setInt(7, id);

        int linhasAfetadas = instrucaoSQL.executeUpdate();
    }

    public static List<Cliente> listar() throws SQLException {
         String sql = "select * from cliente";
         
         PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);
         
         
        ResultSet rs =  instrucaoSQL.executeQuery();
        List<Cliente> clientes = new ArrayList<>();
        
        while(rs.next()){
            Cliente cliente = new Cliente();
            cliente.setId(rs.getInt("idCliente"));
            cliente.setNome(rs.getString("nomeCliente"));
            cliente.setCpf(rs.getString("cpfCliente"));
            cliente.setTelefone(rs.getString("telefone"));
            cliente.setSexo(rs.getString("sexo"));
            
            clientes.add(cliente);
            
        }
        rs.close();
        
        return clientes;
         
    }
    
     public List<Cliente> listarCpf(String cpf) throws SQLException {
        String sql = "select * from cliente where cpfCliente = ?";
        
        PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);
        instrucaoSQL.setString(1,cpf);
        
        ResultSet rs =  instrucaoSQL.executeQuery();
        List<Cliente> clientes = new ArrayList<>();
        
        while(rs.next()){
            Cliente cliente = new Cliente();
            cliente.setId(rs.getInt("idCliente"));
            cliente.setNome(rs.getString("nomeCliente"));
            cliente.setCpf(rs.getString("cpfCliente"));
            cliente.setTelefone(rs.getString("telefone"));
            cliente.setSexo(rs.getString("sexo"));
            
            clientes.add(cliente);
            
        }
        rs.close();
        
        return clientes;
        
    }

}
