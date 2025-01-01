class base
{
    base(){
        System.out.println("base constructor");
    }

    base(int a){
        System.out.println("a:"+a);
    }
}
class derived extends base{
    derived(){
        super(0);
        System.out.println("derived constructor");
    }
}

public class super1 {
public static void main(String[] args){

    derived d=new derived();

}

}
