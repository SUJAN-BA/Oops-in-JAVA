class student{

    int id;
    String name;
    student(){

    }

    student(student s1){//declaring constructer..copying content of object s1 to s2
      this.id=s1.id;
      this.name=s1.name;
    }

    void print(){
        System.out.println("id:"+this.id);
        System.out.println("name:"+this.name);
    }
}


public class copy_cons {
    public static void main(String[] args){
      student s1=new student();
      s1.id=12;
      s1.name="sujan";

      student s2=new student(s1);//defining copyconstructer

      s1.name="suhas";//changing the s1 content before copying....whatever the content want change make changes below the defining constructer


      s2.print();
    }
}
