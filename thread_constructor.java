
//please learn once again 



class myclass extends Thread{
    myclass (String name){
        super(name);
    }
   public void run(){
   /*int i=0;;

    while(i<40){
        System.out.println("sujansuja");
        i++;
    }*/

    }

}




public class thread_constructor {
    public static void main(String[] args){
        myclass obj=new myclass("sujan");
        obj.start();

        System.out.println("thread id is"+obj.getId());
        System.out.println("thread name is:"+obj.getName());

    }
}
