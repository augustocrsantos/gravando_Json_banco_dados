/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import banco_dados.Conexao;
import com.mysql.jdbc.Connection;
import entidades.Cliente;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author augus
 */
public class daopadrao {
      Connection con = null;
        Conexao c = new Conexao();
        
    public boolean salvarCliente(Cliente cliente) {
       
        boolean salvou = true;
      
        try {
            con = c.abrirConexao();
            if (con != null) {
                
                
                Statement stm = con.createStatement();
                //Realiza o insert no banco dos valores das variaveis da classe cliente
                stm.executeUpdate("insert into cliente(nome, telefone) values ('" + cliente.getNome() + "' , '" + cliente.getTelefone() + "')");

                salvou = false;
                JOptionPane.showMessageDialog(null, "Opeação realizada com sucesso!");

            } else {
                System.out.println("Conexão nula.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar salvar registro no banco de dados." + ex + JOptionPane.ERROR_MESSAGE);
        } finally {
            c.fecharConexao(con);
        }
        return salvou;
}


}
