

class c1{//all modifiers can use in the same class

private int a=1;
public int b=2;
protected int c=3;
int d=4;//this is default

void fun(){
    System.out.println("a="+a+",b="+b+",c="+c+",d="+d);

}

}
class c2 extends c1{
    void fun2(){
    System.out.println("only protect and public and default modifier can be accesses in subclass but not private ");
    System.out.println("b="+b+",c="+c+",d="+d);
    }
}



public class access_modifier2 {
    public static void main(String[] args){
        c1 obj=new c1();
        obj.fun();

        c2 obj2=new c2();
        obj2.fun2();

       // System.out.println(obj.a);//private members can not be access even it is in same PACKAGE


       System.out.println("all modifier can be access in same pacakage except private");
       System.out.println("b="+obj.b+",c="+obj.c+",d="+obj.d);


    }
}
