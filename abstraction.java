 abstract class parent{
    int a=20;
    void fun1(){
        System.out.println("i am function");
    }
    abstract void print();
}
 abstract class child1 extends parent{
    void fun2(){
        System.out.println("child function");
    }
}

    class child2 extends parent{
        @Override
        void print(){
            System.out.println("sujan");
        }
    }


public class abstraction {
    public static void main(String[] args){
        //parent p =new parent();//not allowed
        //child1 c=new child1();//NOT ALLOWED

        child2 obj=new child2();
        obj.print();

        parent obj2=new child2();//it is alowed bu dynamic method dispatch concept
        obj2.print();

       obj.a=30;//variables in abstract not finle we can modify it
     // obj2.a=10;  allowed 
        System.out.println(obj.a);

    }
}
