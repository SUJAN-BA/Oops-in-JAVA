

class student{
    private int id;
    private String name;
  void setname(String n){
     name=n;//or use this.name=n;
  }

  String getname(){
    return name;
  }

  void setid(int i){
    id=i;//or use this.id=n; 
  }

  int getid(){
    return id;
  }

}

public class access_modifier1 {
    public static void main(String[] args){
    student s=new student();

    s.setname("sujan");
    s.setid(12);

    System.out.println("id:"+s.getid());
    System.out.println("name:"+s.getname());
    }

    
}
