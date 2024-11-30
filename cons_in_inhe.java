class base
{
    base(){
        System.out.println("base constructor");
    }
}
class derived extends base{
    derived(){
        System.out.println("derived constructor");
    }
}


public class cons_in_inhe {
    public static void main(String[] args){
   derived d=new derived();
    }
}
