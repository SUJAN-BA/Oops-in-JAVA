class A{
   void method1(){
        System.out.println("i am the method 1");
    }
    void method2(int a){
        System.out.println("method 2 :"+a);
    }
}

class B extends A{
    @Override
    void method2(int a){//overriding use same type and same number of parameter
        System.out.println("method overriden :"+a);
    }
    
    void method3(){
        System.out.println("method 3");
    }
}



public class method_overriden {
    public static void main(String[] args){
        B obj=new B();
        obj.method2(1);
        obj.method1();

        A obj1=new A();
        obj1.method2(2);

    }
}
