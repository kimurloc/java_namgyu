package ch04.echo;

import java.io.*;
import java.net.Socket;

public class EcoClient {
    void startClient(){
        try(
                Socket s = new Socket("localhost", 50000);
                InputStream in = s.getInputStream();
                OutputStream out = s.getOutputStream()
        ){
            int readData = 0;
            while((readData = System.in.read()) != -1){
                out.write(readData);
            }
        }catch(IOException e){
            System.out.println("network error : " + e.getMessage());
        }
    }

    void main(){
        startClient();
    }
}
