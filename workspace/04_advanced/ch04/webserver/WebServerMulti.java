package ch04.webserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServerMulti {
    void startServer(){
        try(
                // 서버소켓 생성
                ServerSocket ss = new ServerSocket(8080)
        ){
            System.out.println("ServerSocket 생성 완료.");

            while(true){
                // 클라이언트의 접속 대기
                Socket s = ss.accept(); // 블로킹 작업
                System.out.println("클라이언트 접속: " + s.getInetAddress().getHostAddress());
                WebServerTask worker = new WebServerTask(s);
                new Thread(worker).start();
            }

        }catch(IOException e){
            System.err.println("네트워크 오류: " + e.getMessage());
        }
    }

    void main(){
        startServer();
    }
}
