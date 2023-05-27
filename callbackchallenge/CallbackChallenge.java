package callbackchallenge;


interface Member{
    void callBack();
}
class Customer implements Member{

    String name;
    public Customer(String m){
        name=m;
    }

    public void callBack(){
        System.out.println("Ok, I'll visite the sale event "+ this.name);
    }
}

class Store {
    Member memb[]=new Member[100];

    int count =0;

    void register(Member m){
        memb[count++]=m;
        
    }
    void inviteSale(){
        for(int i=0;i<count;i++){
            memb[i].callBack();
        }
    }
    
}

public class CallbackChallenge {

    public static void main(String[] args) {
        Store St=new Store();
        Customer c=new Customer("Moussa");
        Customer c1=new Customer("Modou");
        St.register(c1);
        St.register(c);
        St.inviteSale();
        
    }
    
}
