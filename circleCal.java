package CircleClass;

class circle{

    public double radius;

    double area(){
        return Math.PI*radius*radius;
    }

    double perimeter(){
        return 2*Math.PI*radius;
    }
}

public class circleCal {
  public static void main(String[] args) {
      
    circle c1=new circle();
    c1.radius=7;

    // String.format("%.4g%n",c1.area());
    System.out.println("area is "+String.format("%.8g%n" , c1.area()));
  }   
}
