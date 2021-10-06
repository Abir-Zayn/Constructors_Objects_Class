package constructors;

class ConstructCircle{
    private double radius;

    public ConstructCircle(){
        radius =1;
    }

    public ConstructCircle(double r){
        radius=r;
    }

    double area(){
        return radius*radius*Math.PI;
    }

}

public class circleConstruct {
    public static void main(String[] args) {
    
        ConstructCircle c = new ConstructCircle(25);
        System.out.println("Area is "+ String.format("%.6g%n",c.area()));
        c.area();
    }
}
