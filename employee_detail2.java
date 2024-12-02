

class employee{
    int salary;
    String name;
    int getsalary(){
        return salary;
    }

    String getname(){
        return name;
    }

    void  setname(String n){
        name=n;
    }
}


public class employee_detail2 {
    public static void main(String[] args){
        employee emp=new  employee();
        emp.setname("sujan");
        System.out.println(emp.getname());
        emp.salary=12;
        System.out.println(emp.getsalary());

       

    }
    
}
