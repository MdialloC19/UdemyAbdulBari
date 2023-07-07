
package exceptionchallenge;

public class Stack {
    private int size;
    private int []stack;
    static int top=-1;

    public Stack(int size){

        this.stack=new int[size];

    }

    public void push(int nbr) throws StackOverFlow{

        if(top==size-1)
            throw new StackOverFlow();
        top ++;
        stack[top]=nbr;
    }

    public int pop() throws StackUnderFlow{
        int x=-1;
        if(top==-1)
            throw new StackUnderFlow();
        x=stack[top];
        top --;

        return x;
    }


}
