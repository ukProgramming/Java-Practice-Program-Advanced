package com.socket.basic;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try {

            ServerSocket ss = new ServerSocket(57956);
            //int a=ss.getLocalPort();
            //System.out.println(a);
            Socket s = ss.accept();
            DataInputStream dataInputStream = new DataInputStream(s.getInputStream());

            String str = (String) dataInputStream.readUTF();

            System.out.println("Message:" + str);
            ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

