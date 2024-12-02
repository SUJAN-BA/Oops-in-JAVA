class emplyoee{
    int id,salary;
    String name;
    void print(){
        System.out.println("the id is:"+id+"\n name:"+name+"\n salaray:"+salary);
    }


}

public class emplyoee_detail{
    public static void main (String[] args){
        emplyoee emp=new emplyoee ();
        emp.id=10;
        emp.name="sujan";
        emp.salary=12;

        emp.print();

    }
    
}

