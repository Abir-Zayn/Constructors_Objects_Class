package Cyllnder;

class cylin{
    public int radius;
    public int height;

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

public class cylinclass {
    public static void main(String[] args) {
        
        cylin c=new cylin();
        c.radius=13;
        c.height=12;

        System.out.println(" Area is "+String.format("%.5g%n",c.diameter()));
        System.out.println(" Perimeter is "+String.format("%.5g%n",c.perimeter()));
        System.out.println(" baseArea is "+String.format("%.5g%n",c.baseArea()));
        System.out.println("volume is "+String.format("%.5g%n",c.volume()));
    }
}
