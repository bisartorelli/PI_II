/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.ClienteDao.conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import model.Venda;

/**
 *
 * @author lucas.afsilva6
 */
public class VendaDao {
    
     static Connection conexao;
   
     
     public VendaDao() throws SQLException {
        conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/tdsRoupa", "root", "");

    }

    public static List<Venda> cadastrarVenda(Venda venda) {

        bd.add(venda);
        return bd;

    }
    public static List<Venda> bd = new ArrayList<>();
    

    public static List<Venda> removerCliente(int id) {
        bd.remove(id);
        return bd;

    }

    public static List<Venda> alterarVenda(int id, Venda venda) {
        bd.get(id).setCpf(venda.getCpf());
        bd.get(id).setCodigo(venda.getCodigo());
        bd.get(id).setQuantidade(venda.getQuantidade());
        bd.get(id).setValor(venda.getValor());
       return bd;
    }

    static int i = 0;
    
    public static void vendaEfetuada(Venda venda) throws SQLException {
        
        
        String sql = "insert into venda(cpfCliente,valorTotal) Values(?,?)";
        PreparedStatement instrucaoSQL = conexao.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        instrucaoSQL.setString(1, venda.getCpf());
        instrucaoSQL.setDouble(2, venda.getValor());
        
        int linhasAfetadas = instrucaoSQL.executeUpdate();
        
        int id = 0;
        
        if(linhasAfetadas > 0){
            ResultSet gerador = instrucaoSQL.getGeneratedKeys();
            if(gerador.next()){
                id = gerador.getInt(1);
            }
        }
        for (Venda vendas : bd) {
            instrucaoSQL = conexao.prepareStatement("insert into carrinho(idVenda,idProduto,quantidade) values (?,?,?)");
            
            instrucaoSQL.setInt(1, id);
            instrucaoSQL.setInt(2, vendas.getCodigo());
            instrucaoSQL.setInt(3, vendas.getQuantidade());
            
            instrucaoSQL.execute();
        }
        
        

    }

   
  
    

}
