public class PrimeNumber{

    static boolean isprime(int n){
        int half=n/2, cpt=0;
        for (int i=2;i<=half;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;   
    } 
     public static void main(String[] args) {
        int n=5;
        if(isprime(n)){
            System.out.println(n + " C'est un nombre premier");
        }else{
            System.out.println(n+  " C'est pas un nombre premier");
        }
    }
}