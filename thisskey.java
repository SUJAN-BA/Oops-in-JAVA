class base{
 /* int a;
  base (int a){
    a=a;
    System.out.println(a);
  }
  */
  
    int a;
    base (int a){
       this. a=a;//if here this not use the a=0 is printed
        
    }
  int get(){
    return a;
  }
}





public class thisskey {
    public static void main(String[] args){
base b=new base(1);
System.out.println(b.get());

    }
}
