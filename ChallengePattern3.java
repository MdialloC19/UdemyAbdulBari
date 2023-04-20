public class ChallengePattern3 {
    public static void main(String []args){
        System.out.println("Challenge Pattern 1");
        for( int i=1;i<=5;i++){
            for(int j=1; j<=5; j++){

                if(j>=i)
                    System.out.print("*");
                else
                    System.out.format(" "); 

            } 
        System.out.println("");
        }
        System.out.println("Challenge Pattern 2");

        for(int i=1;i<=5;i++){
            for(int j=1; j<=5; j++){

                if(i+j>5)
                    System.out.print("*");
                else                    
                    System.out.printf(" "); 

            } 
            System.out.println("");
        }
    }
}

