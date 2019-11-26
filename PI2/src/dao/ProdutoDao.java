package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Produto;

/**
     * 
    * @author Bianca Sartorelli
    * @author Guilherme Augusto 
    * @author Lucas Augusto
    * @author Leonardo Lima
    */

public class ProdutoDao {

    static Connection conexao;

    public ProdutoDao() throws SQLException {
        conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/tdsRoupa", "root", "");

    }
    
    /**
     * @throws java.sql.SQLException
    *  @param  produtos objeto do Produto
    *  
    */

    public void cadastrarProduto(Produto produtos) throws SQLException {
        String sql = "insert into produto (nomeProduto, fabricante, categoria, estoque, valor , tamanho ) Values(?,?,?,?,?,?)";

        PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);

        instrucaoSQL.setString(1, produtos.getProduto());
        instrucaoSQL.setString(2, produtos.getFabricante());
        instrucaoSQL.setString(3, produtos.getCategoria());
        instrucaoSQL.setInt(4, produtos.getEstoque());
        instrucaoSQL.setInt(5, produtos.getValor());
        instrucaoSQL.setString(6, produtos.getTamanho());

        int linhasAfetadas = instrucaoSQL.executeUpdate();

    }

    private static List<Produto> bd = new ArrayList<>();

     /**
     * @throws java.sql.SQLException
        *  @param  id objeto do Produto, utilizado para manipulação no banco
    *  
    */
    
    public void removerProduto(int id) throws SQLException {
        String sql = "delete from produto where idProduto = ?";

        PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);

        instrucaoSQL.setInt(1, id);

        int linhasAfetadas = instrucaoSQL.executeUpdate();

    }
      /**
     * @throws java.sql.SQLException
     *  @param  id objeto do Produto, utilizado para manipulação no banco
    * @param produtos do objeto Produto
    *  
    */

    public void alterar(int id, Produto produtos) throws SQLException {
        String sql = "update produto set nomeProduto = ?, fabricante = ?, categoria = ?, estoque = ? , valor = ?, tamanho = ? where idProduto = ?";

        PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);

        instrucaoSQL.setString(1, produtos.getProduto());
        instrucaoSQL.setString(2, produtos.getFabricante());
        instrucaoSQL.setString(3, produtos.getCategoria());
        instrucaoSQL.setInt(4, produtos.getEstoque());
        instrucaoSQL.setInt(5, produtos.getValor());
        instrucaoSQL.setString(6, produtos.getTamanho());
        instrucaoSQL.setInt(7, id);

        int linhasAfetadas = instrucaoSQL.executeUpdate();
    }
    
      /**
     * 
    *  @return produtos - tabela de produtos
    *  
    */

    public static List<Produto> listar() throws SQLException {
        String sql = "select * from produto";

        PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);

        ResultSet rs = instrucaoSQL.executeQuery();
        List<Produto> produtos = new ArrayList<>();

        while (rs.next()) {
            Produto produto = new Produto();
            produto.setCodigo(rs.getInt("idProduto"));
            produto.setProduto(rs.getString("nomeProduto"));
            produto.setFabricante(rs.getString("fabricante"));
            produto.setCategoria(rs.getString("categoria"));
            produto.setEstoque(rs.getInt("estoque"));
            produto.setValor(rs.getInt("valor"));
            produto.setTamanho(rs.getString("tamanho"));

            produtos.add(produto);
        }
        rs.close();

        return produtos;

    }

//    public static List<Produto> controleEstoque(int idProd, Produto produto) {
//        bd.get(idProd).setEstoque(produto.getEstoque());
//        return bd;
//    }
    
    

      /**
     * @throws java.sql.SQLException
    *  @param codigo objeto de Produto
    *  @param estoque1 - novo valor de estoque, após update do banco
    */

    public void alterarEstoque(int codigo, int estoque1) throws SQLException {
        String sql = "update produto set estoque = ? where idProduto = ?";
        
       PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);

        instrucaoSQL.setInt(1, estoque1);
        instrucaoSQL.setInt(2,  codigo);
        
        
        int linhasAfetadas = instrucaoSQL.executeUpdate();
    }

    public List<Produto> listarPorId(int id) throws SQLException {
        String sql = "select * from produto where idProduto = ?";
        
        PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);
        instrucaoSQL.setInt(1,id);
        
        ResultSet rs =  instrucaoSQL.executeQuery();
        List<Produto> produtos = new ArrayList<>();
        
        while(rs.next()){
            Produto produtu = new Produto();
            produtu.setCodigo(rs.getInt("idProduto"));
            produtu.setProduto(rs.getString("nomeProduto"));
            produtu.setFabricante(rs.getString("fabricante"));
            produtu.setCategoria(rs.getString("categoria"));
            produtu.setEstoque(rs.getInt("estoque"));
            produtu.setValor(rs.getInt("valor"));
            produtu.setTamanho(rs.getString("tamanho"));
            
            
            produtos.add(produtu);
            
        }
        rs.close();
        
        return produtos;
    }

}
