package Cyllnder;

class privateCyclin{

    //declaring private values
    private double radius;
    private double height;

    //get and set method for modifying the private values ==>For radius
    public double getRadius() {
        return radius;
    }
    //get and set method for modifying the private values ==>For Height
    public double getHeight() {
        return height;
    }

    //get and set method for modifying the private values ==>For radius
    public void setRadius(double r) {
        if( r>0)       radius = r;
        else                    System.out.println("Radius cant be 0");
    }

    //get and set method for modifying the private values ==>For Height
    public void setHeight(double h) {
        height = h;
    }

    //Different Operations for Cylinder
    double diameter(){
        return 2*radius;
    }

    double perimeter(){
        return 2*Math.PI*radius;
    }

    double baseArea(){
        return Math.PI*radius*radius;
    }

    double volume(){
        return Math.PI*radius*height;
    }
}

public class cylinderPrivate {
    public static void main(String[] args) {
        privateCyclin cc= new privateCyclin();



        // set the values for Radius and Height
        cc.setRadius(0);   //Checking the ouput for Radius 0 Can be modify later on
        cc.setHeight(10);


        //printing the area and diameter
        System.out.println("Area is "+String.format("%.5g%n", cc.baseArea()));
        System.out.println("Perimeter is "+String.format("%.5g%n",cc.diameter()));
    }
}
