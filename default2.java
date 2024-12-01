interface parent{
    void print();

    private void player(){
        System.out.println("he is a player");
    }
    default void name(){
        player();
        System.out.println("sujan");
    }

}
class sub implements parent{
    public void print(){
        System.out.println("printng");
    
    }
   

}




public class default2 {
    public static void main(String[] args){
        sub obj=new sub();
        obj.name();
    
        //obj.player();//NOT ALLOWED

    }
}

