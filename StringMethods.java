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
        //Methods 3
        String strn2="pyramid wall";
        String strn3="Pyramid";
        String strn4=new String("Pyramid");//create a new object in the heap, witch have different reference.
        System.out.println(strn2.equalsIgnoreCase(strn3));
        System.out.println(strn2==(strn3));
        System.out.println("resulat "+strn2.compareTo(strn3));// if they aren't equal they give the difference between their ascii code
        System.out.println(strn2.contains("wall"));


;    }
    

}
