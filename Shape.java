

public class Shape {

    float length;
    float breadth;
    
     public void getArea(float length,float breadth){

        float Area;
        this.length=length;
        this.breadth=breadth;
        Area=length*breadth;
        System.out.println("the area of the Shape is :"+Area);
        
    }


    
}

class Rectangle extends Shape{

    public void getArea(float length,float breadth){

        float Area;
        this.length=length;
        this.breadth=breadth;
        Area=length*breadth;
        System.out.println("the area of the rectangle is :"+Area);
        
    }
public static void main(String[] args) {
    Shape area=new Shape();
    Rectangle recArea= new Rectangle();
    area.getArea(45, 045);
    recArea.getArea(45, 12);

}

}
