public class StringChallenge{
    public static void main(String []args){
        String str="programmer@gmail.com";
        System.out.println(str.matches("\\w*@gmail.com"));//Find if the email id is on gmail with regex
        //Find username and domain name From email
        int index =str.indexOf("@");
        String username=str.substring(0, index);
        String domainName=str.substring(index+1);
        System.out.println("username: "+username+ " domain name: "+ domainName);

       
    }
}
