public class StringRegexb    
{
 
    public static void main(String[] args) {
 
    int b=011101; // This is Octal literals: Allowed digits are 0 to 7. Literal value should be prefixed with zero.
 
    System.out.println(b); // hence 4673 
    String str=Integer.toString(b,2);  // refer documentation we will get binary form of b
    //tostring
    
    System.out.println(str);
   
    System.out.println(str.matches("[01]*"));
    int n = 29;
    for (int i = 31; i >= 0; i--) {
        System.out.print((n >> i)&1);
    }

}
}