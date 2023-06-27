public class ChallengePattern2 {
    public static void main(String [] arg){
        System.out.println("Chalenge Pattern 1");
        for( int i=1;i<=5;i++){
            for(int j=1; j<=i; j++){
               
                System.out.format("%d ",j); 
            }
            System.out.println(" ");
        }
        System.out.println("Challenge Pattern 2");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.format("%d ", j);
            }
            System.out.println("");
        }
        // We can also do this
        System.out.println("Challenge Pattern 2");

        for (int i =1; i <=5; i++) {
            for (int j = 1; j <= 5-i+1; j++) {
                System.out.format("%d ", j);
            }
            System.out.println("");
        }
    }
    
}
