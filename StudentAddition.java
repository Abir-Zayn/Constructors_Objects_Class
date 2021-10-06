package StudentConstructors;

class presentsheet{

    public String name;
    public int id;
    public String courseOne;
    public String courseTwo;
    public String courseThree;

    void StrudentAdded(int id, String name, String courseOne, String courseTwo, String courseThree){
        System.out.println("Student name "+ name+ " and ID "+id+" enrolled in course "+ courseOne+" "+courseTwo+" "+courseThree);
    }

}
public class StudentAddition {
    public static void main(String[] args) {
        presentsheet student1=new presentsheet();
        presentsheet student2=new presentsheet();
        presentsheet student3=new presentsheet();
        presentsheet student4=new presentsheet();

        student1.StrudentAdded(666_54_34, "Abir Hasan", "OOP", "DS", "Algo");
        student2.StrudentAdded(666_44_32, "Mahfuzur Rahman","OOP","DS","DM");
        student3.StrudentAdded(666_44_32, "Minar Rahman","OOP","DS","DM");
        student4.StrudentAdded(666_54_40, "Mehraj Shawky", "Eng","CBPC","Algo");

        
    }
}
