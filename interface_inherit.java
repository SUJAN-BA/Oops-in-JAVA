interface parent{
    void method1();
}

interface child extends parent//it contain method1 also but do not implement it
{
    void method2();
}

class myclass implements child{
    public void method1(){
        System.out.println("method1");
    }
    public void method2(){
        System.out.println("method2");
    }
}

public class interface_inherit {
    public static void main(String[] args){

        myclass obj=new myclass();
        obj.method1();
        obj.method2();
    }
}
