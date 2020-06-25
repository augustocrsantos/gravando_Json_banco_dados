/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_dados;
import java.io.FileWriter;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
 
import org.json.simple.JSONObject;
/**
 *
 * @author augus
 */

public class CriaJson { 
       
    public void escreveJson(){
           
        //Cria um Objeto JSON
        JSONObject jsonObject = new JSONObject();
         
        FileWriter writeFile = null;
         
        //Armazena dados em um Objeto JSON
        jsonObject.put("nome", "nome");
        jsonObject.put("telefone", "8888555");
       
         
        try{
            writeFile = new FileWriter("cliente.json");
            //Escreve no arquivo conteudo do Objeto JSON, sendo que o mesmo será criando nos arquivos do projeto
            writeFile.write(jsonObject.toJSONString());
            writeFile.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
         
        //Exibe nos logs da aplicação as informacoes do objeto JSON 
        System.out.println(jsonObject);
 
    }
    }
    

