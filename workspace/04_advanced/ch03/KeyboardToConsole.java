package ch03;

import java.io.IOException;

public class KeyboardToConsole {
    void main(){
        try{
            int readData = 0;
            while((readData = System.in.read()) != -1){
                System.out.write(readData);
            }
        }catch(IOException e){
            System.out.println("i/o exception erupted");
        }
    }
}
