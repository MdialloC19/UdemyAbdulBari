import java.util.*;
public class Website {
    public static void main(String []args){
        
        System.out.println("Type of web site and the protocol");
        Scanner src=new Scanner(System.in);
        String url=src.nextLine();
       // String str= new String("https://www.mathemaroc.com");
        int index=url.indexOf(":");
        int lindex=url.lastIndexOf(".");
        String protocol= url.substring(0,index);
        String typeW= url.substring(lindex+1);
        System.out.println(protocol);
        System.out.println(typeW);
        if(protocol.equals("http"))
            System.out.println("Hypertext Transfer Protocol");
        else if(protocol.equals("https"))
            System.out.println("Hypertext Transfer Protocol Secure");
        else if(protocol.equals("ftp"))
            System.out.println("File Transfer Protocol");
        
        if(typeW.equals("com"))
            System.out.println("Commercial");
        else if(typeW.equals("org"))
            System.out.println("Organisation");
        else if(typeW.equals("net"))
            System.out.println("Network");

    }
}
