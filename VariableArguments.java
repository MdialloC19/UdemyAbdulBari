public class VariableArguments {

    static void show (int ...A){
        for(int x: A){
            System.out.println(x);
        }
    }
    static void showList( int start, String ...S){
        for(int i=0; i<S.length; i++){
            System.out.println(start+". "+S[i]);
            start++;
        }
    }
    public static void main(String [] args){

        int A[]={8,5,12,34,10,11,2,0};
        show (A);

        showList(5,"Musa","Diallo","Modou","Ndiaye","Assane", "ahmed");
    }
}
