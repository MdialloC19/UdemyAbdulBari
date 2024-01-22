package checkedunchecked;


class LowBalanceException extends Exception{

    public String toString(){
        return "Balance Should not be less thant 5000";
    }
}

public class checkedunchecked {
    static void fun1(){

        try{
            throw new LowBalanceException();
        }catch(LowBalanceException e){
            System.out.println(e);
        }
        
        // try{

        //     System.out.println(10/0);
        // }catch (Exception e) {
        //     System.out.println(e);

        //     e.printStackTrace();

        // }
    }

    static void fun2(){
        fun1();  
    }

    static void fun3(){
        fun2();  
    }

    public static void main(String[] args) {
        fun3();
    }
    
}
