/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Khoand
 */
public class Server {

    private static ServerSocket serverSocket = null;
    private static List<Socket> clients = new ArrayList<>();
    private static List<String> clientNames = new ArrayList<>();
    private static BufferedWriter bw;
    private static List<String> listContent = new ArrayList<>();

    public static void main(String[] args) {
        try {
            serverSocket = new ServerSocket(5005);
        } catch (Exception e) {
            e.printStackTrace();
        }

        while (true) {
            try {
                Socket client = serverSocket.accept();
                clients.add(client);
                //System.out.println("Connected: " + client.getInetAddress());
                BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
                String message = br.readLine();
                System.out.println("Client name :" + message + " Connected!");
                clientNames.add(message);

                //response
                bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
                bw.write("Connected to server :" + message);
                bw.newLine();
                bw.flush();

                // start doing
                // send all client
                new Thread() {
                    @Override
                    public void run() {
                         for(String content:listContent){
                             
                         }
                    }

                }.start();

                //reveive
                new Thread() {
                    @Override
                    public void run() {
                        super.run(); //To change body of generated methods, choose Tools | Templates.
                    }

                }.start();

                //end
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static boolean sendMess(Socket client, String content) {
        try {
            bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            bw.write(content);
            bw.newLine();
            bw.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}
