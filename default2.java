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



