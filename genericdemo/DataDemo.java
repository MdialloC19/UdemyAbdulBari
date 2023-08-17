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

    public static void main(String[] args) {
        Data<Integer> d=new Data<>();

        d.setData(Integer.valueOf(15));
        System.out.println(d.getData());

        MyArray <Integer> M1=new MyArray<>();

        M1.append(10);
        M1.append(20);
        M1.append(40);
        M1.append(50);
        M1.append(60);

        M1.display();
    }
    
}
