package Rectangle;

class privateRec{

    //declaring private values
    private double length ;
    private double breadth ;

    //initialization private values with Get and Set Methods

    public double getLength(){
        return length;
    }

    public double  getbreadth(){
        return breadth;
    }

    public void setLength(double l){
        if (l>=0) {
        length=l;
        }else{
            System.out.println("Cant be negative");
        }
    }

    public void setbreadth(double b){
        if(b>=0)                breadth=b;
        else                       System.out.println("Cant be negative");
    }


    //method for finding the area 
    double areaMethod(){
        return length*breadth;
    }

    //method for finding the perimeter 
    double perimeterArea(){
        return 2*(length+breadth);
    }



}

public class rectanglePrivate {
    public static void main(String[] args) {
       privateRec re= new privateRec();

       re.setbreadth(-2);
       re.setLength(-3);
      

       System.out.println("length "+ re.getLength());
    System.out.println("breadth "+ re.getbreadth());
    }
}
