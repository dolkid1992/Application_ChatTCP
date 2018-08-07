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
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Khoand
 */
public class Client {

    private static Socket server = null;

    public static void main(String[] args) {
        //send
        new Thread() {
            @Override
            public void run() {

//                try {
//                    server = new Socket("localhost", 5005);
//                } catch (Exception e) { 
//                    e.printStackTrace();
//                }
                while (true) {
                    try {
                        server = new Socket("localhost", 5005);
                        Scanner sc = new Scanner(System.in);
                        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(server.getOutputStream()));
                        String message = sc.nextLine();
                        bw.write(message);
                        bw.newLine();
                        bw.flush();
                        message = "";
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        //receive
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        //Socket server1 = new Socket("localhost",5005);
                        BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
                        String message = br.readLine();
                        System.out.println(message);

                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }
}
