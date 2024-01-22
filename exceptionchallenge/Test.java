package exceptionchallenge;

public class Test {
    public static void main(String[] args) {
        
        Stack st=new Stack(5);

        try {
            st.pop();
            // st.push(3);
            // st.push(3);
            // st.push(3);
            // st.push(3);
            // st.push(3);
            // st.push(3);
        }catch (StackUnderFlow e) {
            System.out.println(e);
        }
    }
}
