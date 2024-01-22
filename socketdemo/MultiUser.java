package socketdemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;

public class MultiUser extends Thread {

    Socket stk;

    public MultiUser(Socket st){
        stk=st;
    }

    public void run(){
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));

            PrintStream ps=new PrintStream(stk.getOutputStream());

            String msg;

            StringBuilder sb;

            do{
                msg=br.readLine();
                sb=new StringBuilder(msg);

                sb.reverse();
                msg=sb.toString();
                ps.println(msg);
            }while(!msg.equals("dne"));
            stk.close();
        }catch (Exception e) {
            // TODO: handle exception
        }
    }
        
    
    
    public static void main(String[] args) throws Exception{
        ServerSocket ss=new ServerSocket(2000);

        int count =0;
        LocalTime lt;
        Socket stk;
        MultiUser Mu;
        do{
            stk=ss.accept();
            lt= LocalTime.now();
            System.out.println("CLient connected : "+ count++ +" at "+ lt);
            Mu=new MultiUser(stk);
            Mu.start();
        }while(true);
    }
}

class Client1 {

    public static void main(String[] args) throws Exception {

        
        Socket stk=new Socket("localhost",2000);

        // Socket =ss.accept();
        BufferedReader keyb =new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));

        PrintStream ps=new PrintStream(stk.getOutputStream());

        String msg;

        StringBuilder sb;

        do{
            msg=keyb.readLine();
            
            ps.println(msg);
            msg=br.readLine();
            System.out.println("From server " +msg);
        }while(!msg.equals("dne"));
        stk.close();
    }
    
}
