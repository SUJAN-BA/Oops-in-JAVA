//creating a thread using runnable interface

class c1 implements Runnable{
    @Override
    public void run(){
     int i=0;
     while(i<50){
        System.out.println("morning");
        i++;
     }

    }

}

class c2 implements Runnable{
    @Override
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("evening");
            i++;
        }
    }
}



public class thread2 {
    public static void main(String[] args){
    c1 t1=new c1();
    Thread obj1=new Thread(t1);//passing runnable interface object as argument to Thread

   c2 t2=new c2();
   Thread obj2=new Thread(t2);

   obj1.start();
   obj2.start();
    }
}
