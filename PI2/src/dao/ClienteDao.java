package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;

public class ClienteDao {

    Connection conexao;

    public ClienteDao() throws SQLException {
        conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/tdsRoupa", "root", "");

    }

    public void cadastarCliente(Cliente cliente) throws SQLException {
        String sql = "insert into cliente (nomeCliente,cpfCliente,telefone,sexo) Values(?,?,?,?)";

        PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);

        instrucaoSQL.setString(1, cliente.getNome());
        instrucaoSQL.setString(2, cliente.getCpf());
        instrucaoSQL.setString(3, cliente.getTelefone());
        instrucaoSQL.setString(4, cliente.getSexo());

        int linhasAfetadas = instrucaoSQL.executeUpdate();

    }

    private static List<Cliente> bd = new ArrayList<>();

    public static List<Cliente> removerCliente(int id) {
        bd.remove(id);
        return bd;

    }

    public static List<Cliente> atualizar(int id, Cliente cliente) {
        bd.get(id).setCpf(cliente.getCpf());
        bd.get(id).setNome(cliente.getNome());
        bd.get(id).setSexo(cliente.getSexo());
        bd.get(id).setTelefone(cliente.getTelefone());
        return bd;
    }

    public static List<Cliente> listar() {
        return bd;
    }

}
