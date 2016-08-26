/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorleandro;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author RA21551055
 */
public class ServidorLeandro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        try{
          System.out.println("Aguardando uma conexao na prota 1234");
        ServerSocket server = new ServerSocket(1234); // Prepara o servidor para receber conexoes na porta 1234
	Socket socket = server.accept(); //Interrompe a execução esperando um cliente
          System.out.println("recebi uma conexao");
         
          BufferedReader inputReader = new BufferedReader(new InputStreamReader(socket.getInputStream())); //Prepara as classes para leitura dos dados 
          
          String lido = inputReader.readLine(); //Le a informação enviada
          //System.out.println("Arquivo recebido:==> " + lido);
      
      //   DataOutputStream out = new DataOutputStream(socket.getOutputStream()); //Prepara as classes para envio dos dados 
      //   out.writeBytes( "ola!!!" + '\n'); //envia a mensagem (msg deve ser String)
      String resposta = "papel";  
      if(lido.trim().equals("tesoura")){
               resposta = "pedra";

      }else if(lido.trim().equals("papel")){
          resposta = "tesoura";
      }
          }
      catch(Exception e){
          System.out.println("Erro ao esperar conexao!!");
              
              }
        System.out.println("Fim!");
        
      //BufferedReader inputReader = new BufferedReader(new InputStreamReader(socket.getInputStream())); //Prepara as classes para leitura dos dados

    }
    
}
