/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_dados;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import dao.daopadrao;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import entidades.Cliente;
import java.rmi.server.ExportException;
/**
 *
 * @author augus
 */
public class LeituraJson {
    
    public void leitura (){
        Cliente cliente = new Cliente();
        JSONObject jsonObject;
        
        JSONParser parser = new JSONParser();
        //Variaveis que irao armazenar os dados do arquivo JSON
        String nome;
        String telefone;
       
 
        try {
            
            //Salva no objeto JSONObject o que o parse tratou do arquivo
            jsonObject = (JSONObject) parser.parse(new FileReader(
                    "cliente.json"));
             
            //Salva nas variaveis os dados retirados do arquivo
            nome = (String) jsonObject.get("nome");
            telefone = (String) jsonObject.get("telefone");
          
          // atribui o valor das variaveis nome e telefone, as variaveis da classe Cliente. 
            cliente.setNome(nome);
            cliente.setTelefone(telefone);
 
            System.out.printf(
                    "Nome: %s\nTelefone: %s\n",
                    nome, telefone );
            
            //Salva no banco 
            daopadrao dao = new daopadrao();
            Conexao conexao = new Conexao();
            dao.salvarCliente(cliente);
            conexao.fecharConexao(null);
        } 
        //Trata as exceptions que podem surgir
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            
            e.printStackTrace();
        }
        
    }
    }

