class base{

    int x;
    int set(int a){
        x=a;
        return x;
    }
}
    
// use return x or use syso here

class derived1 extends base{
    int y;
    int set2(int b){
        y=b;
        return b;
    }
}

class derived2 extends derived1{
    int z;
    int set3(int c){
        z=c;
        return z;
        
    }

}




public class multi_inheritance {
    public static void main(String[] args){
     derived2 d=new derived2();
     System.out.println("the value of x:"+d.set(1));
     System.out.println("the value of y:"+d.set2(2));
     System.out.println("the value of z:"+d.set3(3));
    }
}
