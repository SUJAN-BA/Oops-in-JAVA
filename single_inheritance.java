class base{
    int x;
    int set(int a){
       x=a;
        return x;
    }
}
    
// use return x or use syso here

class derived extends base{
    int y;
    int set2(int b){
        y=b;
        return y;
    }
}



public class single_inheritance {
    public static void main(String[] args){

        derived d=new derived();
        System.out.println("value of x:"+d.set(1));
        System.out.println("value of y:"+d.set2(2));
    }
}
