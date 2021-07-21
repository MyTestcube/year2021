package Moon7;

import java.io.FileInputStream;
import java.io.IOException;

public class Example {
    public static void main(String[] args)throws IOException {

        FileInputStream fis=null;
        fis=new FileInputStream("D:/Desktop/note.txt");
        int k;
        while ((k=fis.read())!=-1){
            System.out.println((char)k);
        }
        fis.close();
    }
}
