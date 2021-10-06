package constructors;


 //uses of parameterized  constructors

public class studentsInfo2 {
    // declaring local variable
     public int present_days;
     public String name;
     public int marks;

     // parameterized constructors
     studentsInfo2(int p_days, int num, String n){    // passing parameter
        present_days = p_days;
        name = n;
        marks = num;
     }

     void display(){    //method to display the values
         System.out.println(name+" got "+marks+" marks also present for "+ present_days+"  days");
     }

    public static void main(String[] args) {

       
        //creating objects and passing values  
        studentsInfo2 sui= new studentsInfo2(114, 200,"Mark");
        studentsInfo2 sui2= new studentsInfo2(110, 213,"Cholera");
        studentsInfo2 sui3= new studentsInfo2(96,128,"Lucy");

        //calling method to display the values
        sui.display();
        sui2.display();
        sui3.display();

    }
    
}
