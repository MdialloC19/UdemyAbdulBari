package Monitor ;

public class MyData {

synchronized void display(String str ){

        for (int i = 0; i < str.length(); i++) {

            System.out.println(str.charAt(i));
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
        }

    }

    
    
}
