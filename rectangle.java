package Rectangle;

class rectangleFormula{

    public int length;
    public int breadth;

    double area(){
        return length*breadth;
    }

    double  perimeter(){
        return 2*(length+breadth);
    }
}

public class rectangle {
    public static void main(String[] args) {
        rectangleFormula r=new rectangleFormula();
        r.length=10;
        r.breadth=15;

        System.out.println("Area is "+String.format("%.4g%n", r.area()));
        System.out.println("Perimeter is "+ String.format("%.4g%n", r.perimeter()));
    }
} 
