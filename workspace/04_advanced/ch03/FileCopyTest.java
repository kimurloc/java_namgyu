package ch03;

import java.io.*;

public class FileCopyTest {
    void main(){
        long start = System.currentTimeMillis();
        //copyFile("output.txt", "output-copy.txt");
        //copyFileUseBuffer("output.txt", "output-copy.txt");
        copyFileCustomBuffer("output.txt", "output-copy.txt");
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    void copyFile(String org, String dest){
        try(
                FileInputStream fis = new FileInputStream(org);
                FileOutputStream fos = new FileOutputStream(dest)
        ){
            int readData = 0;
            while((readData = fis.read()) != -1){
                fos.write(readData);
            }
        }catch(IOException e){
            System.out.println("i/o exception erupted");
        }
    }

    void copyFileUseBuffer(String org, String dest){
        try(
                InputStream bis = new BufferedInputStream(new FileInputStream(org));
                OutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
        ){
            int readData = 0;
            while((readData = bis.read()) != -1){
                bos.write(readData);
            }
        }catch(IOException e){
            System.out.println("i/o exception erupted");
        }
    }

    void copyFileCustomBuffer(String org, String dest){
        try(
                FileInputStream fis = new FileInputStream(org);
                FileOutputStream fos = new FileOutputStream(dest)
        ){
            byte[] buffer = new byte[1024*8];
            int readData = 0;
            while((readData = fis.read(buffer)) != -1){
                fos.write(buffer);
            }
        }catch(IOException e){
            System.out.println("i/o exception erupted");
        }
    }
}
