package genericdemo;

class Data<T>{
    private T obj;

    public void setData(T v){
        obj=v;
    }

    public T getData(){
        return obj;
    }
}

class A{}
interface B{}
interface C{}
@SuppressWarnings("unchecked")

class MyArray<T>{
    T A[]=(T[])new Object[10];
    int length=0;

    public void append(T v){

        A[length++]=v;

    }

    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(A[i]);
        }
    }
}

class MyArray2 extends MyArray<String>{

}
public class DataDemo {

    static <E> void show (E... list){

        for (E x:list){
            System.out.println(x);
        }
    }

    static void fun(MyArray<? extends Number> obj){
        obj.display();
    }
    public static void main(String[] args) {
        Data<Integer> d=new Data<>();

        d.setData(Integer.valueOf(15));
        System.out.println(d.getData());

        MyArray <Integer> ma1=new MyArray<>();

        ma1.append(10);
        ma1.append(20);
        ma1.append(40);
        ma1.append(50);
        ma1.append(60); 
        ma1.display();

        fun(ma1);
    }
    
}
