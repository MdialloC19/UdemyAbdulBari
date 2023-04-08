public class StringMethods {
    public static void main(String [] args){
        String str=new String("abdulBari");
        //str=str.toUpperCase();
        str=str.trim();
        String str1=str.substring(3,8);
        String str3=str.replace('a','e');
        System.out.println(str3);
        //Methods 2
        String strn="Mr. Shahruh Khan";
        System.out.println(strn.startsWith("Shah",4));
        System.out.println(strn.endsWith("Khan"));
        for(int i=0; i<strn.length();i++)
            System.out.print(strn.charAt(i));
        
        String strn1="www.udemy.co.in";
        System.out.println(strn1.indexOf('.', 4));
        System.out.println(strn1.lastIndexOf('.'));
;    }
    

}
