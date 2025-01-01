class base
{
    base(){
        System.out.println("base constructor");
    }

    base(int x){
        System.out.println("a:"+x);
    }
}
class derived1 extends base{

    derived1(int x,int y){
        super(x);
        System.out.println("x:"+x+"\ny:"+y);
    }
}

class derived2 extends derived1{
    derived2(int x,int y,int z){
        super(x,y);
        System.out.println("x:"+x+"\ny:"+y+"\nz:"+z);
    }
}

public class super3 {
public static void main(String[] args){

   // derived d=new derived();
   derived2 d=new derived2(1,2,3);


   
}

}


