package ch03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileToFile {
    void main(){
        try(
                FileInputStream fis = new FileInputStream("output.txt");
                FileOutputStream fos = new FileOutputStream("output-copy.txt")
        ){
            int readData = 0;
            while((readData = fis.read()) != -1){
                fos.write(readData);
            }
        }catch(IOException e){
            System.out.println("i/o exception erupted");
        }
    }
}
