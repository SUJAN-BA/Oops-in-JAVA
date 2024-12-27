class student{
    int id;
    String name;

    student(String n,int i){// declaring constructor;
        id=i;
        name=n;
    }

    void print(){
        System.out.println("id:"+this.id);
        System.out.println("name:"+this.name);
    }
}


public class parameter_cons{
    public static void main(String[] args){
        student s1=new student("sujan",12);//passing parameter to constructer
        
        s1.print();

    }
}