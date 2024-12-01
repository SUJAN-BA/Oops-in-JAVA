interface parent{
    void print();
    default void name(){//this method run only when it is not overriden in sub class
        System.out.println("sujan");
    }

}
class sub implements parent{
    public void print(){
        System.out.println("printng");
    
    }
    public void name(){//if it is not overriden  then output is sujan
        System.out.println("sujan and suhas");
    }


}




public class default1 {
    public static void main(String[] args){
        sub obj=new sub();
        obj.name();

    }
}
