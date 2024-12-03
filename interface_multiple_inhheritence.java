//below code is also an example for multiple inheritance



interface chess{
    void move();
}

interface chessplayer{
    void strong();

}

class queen implements chess,chessplayer//class can implements multiple interface
{
 public  void move(){
     System.out.println("queen can move in all direction");
   }

   public void strong(){
      System.out.println("queen is strongest:");
   }
}


public class interface_multiple_inhheritence {
    public static  void main(String[] args){
        queen obj=new queen();
        obj.move();
        obj.strong();
    }
    
}
