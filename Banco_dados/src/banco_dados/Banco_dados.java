/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_dados;

import javax.swing.JOptionPane;
import dao.daopadrao;
import entidades.Cliente;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
/**
 *
 * @author augus
 */
public class Banco_dados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      LeituraJson lejson = new LeituraJson();
        lejson.leitura();
        
       /* 
         Cliente cli = new Cliente();
        daopadrao dao = new daopadrao();
        cli.setTelefone("222");
         dao.salvarCliente(cli);
        
        */
       //Conexao conectar = new Conexao();
       //conectar.abrirConexao();
              
           
        
       //CriaJson json = new CriaJson();
     //  json.escreveJson();
        
      
    }
    
}
