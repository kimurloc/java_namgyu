package ch04.echo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EcoServer {
    void startServer(){
        try(
                ServerSocket ss = new ServerSocket(50000);
                ){
            System.out.println("serversocket created");

            Socket s = ss.accept();
            System.out.println("client access : " + s.getInetAddress().getHostAddress());

            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();

            int readData = 0;
            while((readData = in.read()) != -1){
                out.write(readData);
                int echoData = in.read();
                System.out.write(echoData);
            }
        }catch(IOException e){
            System.err.println("network error : " + e.getMessage());
        }
    }
    void main(){
        startServer();
    }
}
