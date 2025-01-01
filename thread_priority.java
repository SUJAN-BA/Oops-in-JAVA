class c1 extends Thread{
    public void run(){
        int i=0;
        while (i<40){
       System.out.println("sujan");
       i++;
    }
}
}
class c2 extends Thread{
    public void run(){
        int i=0;
        while (i<40){
       System.out.println("sujansuja");
       i++;
    }
    }
}





public class thread_priority {
    public static void main(String[] args){
        c1 obj1=new c1();
        c2 obj2 =new c2();



        obj1.setPriority(Thread.MAX_PRIORITY);//this thread exicute more
        
        obj1.start();
        obj2.start();
      
    }
}
