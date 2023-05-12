public class PrimeNumber{

    static boolean isprime(int n){
        int half=n/2, cpt=0;
        for (int i=2;i<=half;i++){
            if(n%i==0)
                return false;
        }
        return true;   
    } 
    static int gcd( int a, int b){
        int c;
        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        return a;
    }
    static int max (int A[]){
        int max =A[0], L=A.length;
        for (int i=0; i<L;i++){
            if(max<A[i]){
                max=A[i];
            }
        }

        return max;

    }
     public static void main(String[] args) {
        // int n=5;
        // if(isprime(n)){
        //     System.out.println(n + " C'est un nombre premier");
        // }else{
        //     System.out.println(n+  " C'est pas un nombre premier");
        // }
        System.out.println(gcd(25,15));
        int A[]={8,5,12,34,10,11,2,4,5,9,0};
        System.out.println(max(A));
}
}