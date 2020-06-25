/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_dados;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author augus
 */
public class Conexao {
    
    //metodo responsavel por crair a conexão com banco de dados
    public Connection abrirConexao() {
        Connection con = null;

        try {              
            Class.forName("com.mysql.jdbc.Driver");// driver do banco Mysql
            //na linha abaixo será endereçado o banco, usuario e senha 
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_dados","root","root"); 

            System.out.println("Conexão criada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Conectar com Banco de Dados \n" + ex, "Erro de Conexão", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o driver do Banco de Dados \n" + ex, "Erro: Driver do Banco de Dados", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
    
   
   
    //Método responsável por fechar a conexão com banco de daos ;
    public void fecharConexao(Connection con) {
        try {
            if (con != null && !con.isClosed()) {  
                con.close();
               System.out.println("Conexão fechada com sucesso!!!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Fechar a conexão \n" + ex + JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
}