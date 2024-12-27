class student{
    int id;
    String name;

    student(){// declaring the constructure
        id=12;
        name="sujan";
    }

    void print(){
        System.out.println("id:"+id);//or call only +id
        System.out.println("name:"+name);
    }

}




public class nom_parameter_cons {
    public static void main(String [] args){
        student s1=new student();

        s1.print();

    }
}
