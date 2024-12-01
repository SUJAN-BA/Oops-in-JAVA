class parent{
    void method1(){
        System.out.println("hi..guys");
    }
    void method2(){
        System.out.println("parent class method2");
    }
}
class sub extends parent{
    void method2(){
        System.out.println(" sub class method2");
    }
    void method3(){
        System.out.println("i am method3");
    }
}


public class dispatch {
    public static void main(String[] args){
      parent obj=new sub();

      //sub obj1=new parent();//not alowed

      obj.method1();
      obj.method2();

     // obj.method3();//not allowed

    }
}
