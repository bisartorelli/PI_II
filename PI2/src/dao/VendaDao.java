/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Venda;

/**
 *
 * @author lucas.afsilva6
 */
public class VendaDao {

    public static List<Venda> cadastrarVenda(Venda venda) {

        bd.add(venda);
        return bd;

    }
    public static List<Venda> bd = new ArrayList<>();
    private static List<Venda> vendaEfetuada = new ArrayList<>();

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
    
    public static void vendaEfetuada() {
       
       vendaEfetuada = bd;
       bd.clear();

    }

   
  
    

}
