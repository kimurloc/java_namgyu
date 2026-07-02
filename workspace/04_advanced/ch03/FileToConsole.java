package ch03;

import java.io.FileInputStream;
import java.io.IOException;

public class FileToConsole {
    void main(){
        try(FileInputStream fis = new FileInputStream("output.txt")){
            int readData = 0;
            while((readData = fis.read()) != -1){
                System.out.write(readData);
            }
        }catch(IOException e){
            System.out.println("i/o exception erupted");
        }
    }
}
