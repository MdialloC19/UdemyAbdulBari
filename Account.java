public class Account {
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;

    public Account(){ }

    public Account(String accNo, String name, String address, String phno, String dob, long balance){

        this.accNo=accNo;
        this.name=name;
        this.address=address;
        this.phno=phno;
        this.dob=dob;
        this.balance=balance;
    }
    
    public String getAccNo(){return accNo;}
    public String getName(){return name;}
    public String getAddress(){return address;};
    public String getPhno(){return phno;}
    public String getDOB(){return dob;}
    public long getBalance(){return balance;}
    
    public void setAddress(String add)
    {
        address=add;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
            
}

class SaveAccount extends Account{

    public void deposit(long mt){

        this.balance+=mt;

        System.out.println("New balance is "+ this.balance);

    }

    public void withdraw(long amt){
       
        balance-=amt;
       
       System.out.println("New balance is "+ this.balance);
    }

class loanAccount extends Account {

    public void payEms(long mt){
        
        balance-=mt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }

}

}
