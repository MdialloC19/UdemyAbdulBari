package enumdemo;

enum Dept{
    CS("Head John ","BLock: A"),IT("Head Smith ","BLock: B"),CIVIL("Head Moussa ","BLock: C"),ECE("Head Modou ","BLock: D") ;// Should be capital letter 

    String head;
    String location;

    private Dept(String head, String loc){
        this.head=head;
        this.location=loc;
    }
    public void display(){
        System.out.println(this.name()+" "+this.ordinal());
    }

    public String getHeadName(){
        return this.head;
    }

    public String getLocation(){
        return this.location;
    }
}
public class EnumDemo {

    public static void main(String[] args) {
        Dept d=Dept.CS;
        System.out.println(d.getHeadName());
        System.out.println(d.getLocation());
        // switch (d) {
        //     case CS: System.out.println("Head John \n BLock: A");
        //         break;
        //     case IT: System.out.println("Head Smith \n BLock: B");
        //         break;
        //     case CIVIL: System.out.println("Head Moussa \n BLock: C");
        //         break;
        //     case ECE: System.out.println("Head Modou \n BLock: D");
        //         break;
        
        //     default:
        //         break;
        // }

        // Dept list[]=Dept.values();

        // for(Dept x:list)
        //    
    }
    
}
