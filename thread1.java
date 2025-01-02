//creating a thread by extending the thread class

class c1 extends Thread{
    @Override
  public  void run(){//run() method indicate tha running the methodand it is present in thread
        int i=0;
        while(i<50){
        System.out.println("i am happy");
        i++;
    }
}

}

class c2 extends Thread{
    @Override
   public void run(){
    int i=0;
    while(i<50){
        System.out.println("i am sad");
        i++;
    }
}

}



public class thread1 {
    public static void main(String[] args){
        c1 obj1=new c1();

        c2 obj2=new c2();

        obj1.start();//starting the thread
        obj2.start();

    }
    
}
