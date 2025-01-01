class square{
    int side;

    void area(){
        int area=side*side;
        System.out.println("area:"+area);
    }

    void parimeter(){
       int p=4*side;
        System.out.println("perimeter:"+p);
    }

}

public class square_area {
    public static void main(String[] args){

       square sq=new square();
    sq.side=6;
    sq.area();
    sq.parimeter();
    }
    
}
