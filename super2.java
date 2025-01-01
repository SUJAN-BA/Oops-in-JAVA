class base
{
    base(){
        System.out.println("base constructor");
    }

    base(int x){
        System.out.println("a:"+x);
    }
}
class derived extends base{

    derived(int x,int y){
        super(x);
        System.out.println("x:"+x+"\ny:"+y);
    }
}

public class super2 {
public static void main(String[] args){

   // derived d=new derived();
   derived d=new derived(1,2);


   
}

}

