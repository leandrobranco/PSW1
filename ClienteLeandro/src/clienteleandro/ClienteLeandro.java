/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteleandro;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author RA21551055
 */
public class ClienteLeandro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            System.out.println("Conectando uma conexao aporta 1234");
               Socket clientSocket = new Socket("10.61.16.58", 1234); // Conecta-se ao servidor remoto na porta indicada
               System.out.println("Conectado!");
                             
               BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in)); //Prepara para ler do teclado
               String sentence = inFromUser.readLine(); //Le do teclado
               
               DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream()); //Prepara as classes para envio dos dados 
	       out.writeBytes("baytola" + '\n'); //envia a mensagem (msg deve ser String)
               
        }
            catch(Exception e){
                System.out.println("Erro ao conectar ");
            }
        System.out.println("Fim!!");
        
//        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in)); //Prepara para ler do teclado
//        String sentence = inFromUser.readLine(); //Le do teclado
    }
    
}
