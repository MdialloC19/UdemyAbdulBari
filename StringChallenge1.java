public class StringChallenge1{
    public static void main(String []args){
        System.out.println("Cheking if a string is Binary number");
        int b=0b011101;
        String str= Integer.toBinaryString(b);
        System.out.println(str);
        System.out.println(str.matches("[01]*"));

        System.out.println("Cheking if a string is hexadecimal number");
        String str1 ="234AB";
        System.out.println(str1.matches("[0-9A-Z]+"));

        System.out.println("Cheking if a data string is data");
        String data="01/02/2023";
        System.out.println(data.matches("[0-3]/[0-1][0-9]/[0-9]{4}"));


       
    }
}
