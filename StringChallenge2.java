public class StringChallenge2 {
    public static void main(String []args){
        
    // Remove Special characters from string
    String str="a!B@C#1$2%3";
    System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
    // Remove extra spaces from string
    String str1="   abc     abc  de  fgh ijk ";
    str1=str1.replaceAll("[\\s]+"," ").trim();
    String words[]=str1.split("\\s");
    System.out.println(words.length);

    }
}
