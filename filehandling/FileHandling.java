package filehandling;

import java.io.File;

public class FileHandling {

    public static void main(String[] args) {
        File f=new File("./");
        System.out.println(f.isDirectory());

        File list[]=f.listFiles();

        for(File x:list){
           if(x.isDirectory())
            System.out.println(x.getName()+" "+x.getParent());
        }

        
    }
    
}
