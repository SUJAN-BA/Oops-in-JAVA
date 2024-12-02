

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
class derived2 extends base{
    int z;
    int set3(int c){
        z=c;
        return z;
    }

}


public class hierarchial {
    public static void main(String[] args){
        derived1 d1=new derived1();

            System.out.println("the value of x:"+d1.set(1));
            System.out.println("the value of y:"+d1.set2(2));

            derived2 d2=new derived2();

            System.out.println("the value of x:"+d2.set(4));
            System.out.println("the value of z:"+d2.set3(5));
    }
}
